package sa45.team9.inventoryApp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sa45.team9.inventoryApp.exception.ProductNotFound;
import sa45.team9.inventoryApp.model.Parts;
import sa45.team9.inventoryApp.repository.PartRepository;
import sa45.team9.inventoryApp.services.IPartsService;
import sa45.team9.inventoryApp.services.ISuppliersService;
import sa45.team9.inventoryApp.validator.PartsValidator;

@RequestMapping("/admin/parts")
@Controller
public class ProductController {
	@Resource
	private PartRepository prepo;
	@Autowired
	private IPartsService pService;
	@Autowired
	private PartsValidator pValidator;
	@InitBinder("admin/parts")
	private void initEmployeeBinder(WebDataBinder binder) {
		binder.addValidators(pValidator);
	} 
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView partsListPage() {
		ModelAndView mav = new ModelAndView("parts-list");
		ArrayList<Parts> partsList =(ArrayList<Parts>) pService.findAllParts();
		mav.addObject("partsList", partsList);
		mav.setViewName("admin/parts-list");
		return mav;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView newPartsPage() {
		ModelAndView mav = new ModelAndView("admin/parts-new", "parts", new Parts());
		mav.addObject("partsList", pService.findAllPartNumbers());
		return mav;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createNewParts(@ModelAttribute @Valid Parts  parts, BindingResult result,
			final RedirectAttributes redirectAttributes) {

		if (result.hasErrors())
			return new ModelAndView("admin/parts-new");
		ModelAndView mav = new ModelAndView();
		String message = "New Product " + parts.getPartNumber() + " was successfully created.";
		pService.createParts(parts);
		mav.setViewName("redirect:/admin/parts/list");

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteParts(@PathVariable String id, final RedirectAttributes redirectAttributes)
			throws ProductNotFound {

		ModelAndView mav = new ModelAndView("redirect:/admin/parts/list");
		Parts parts = pService.findParts(id);
		pService.removeParts(parts);
		String message = "The employee " + parts.getPartNumber() + " was successfully deleted.";

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editPartsPage(@PathVariable String id) {
		ModelAndView mav = new ModelAndView("admin/parts-edit");
		Parts parts = pService.findParts(id);
		mav.addObject("parts", parts );
		//mav.addObject("partsList", pService);
		return mav;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editSuppliers(@ModelAttribute @Valid Parts parts, BindingResult result,
			@PathVariable String id, final RedirectAttributes redirectAttributes) throws ProductNotFound {

		if (result.hasErrors())
			return new ModelAndView("admin/parts-edit");

		ModelAndView mav = new ModelAndView("redirect:/admin/parts/list");
		String message = "Parts was successfully updated.";

		pService.changeParts(parts);

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
}
