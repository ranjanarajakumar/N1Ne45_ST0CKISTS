package sa45.team9.inventoryApp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import sa45.team9.inventoryApp.exception.ProductNotFound;
import sa45.team9.inventoryApp.exception.SupplierNotFound;
import sa45.team9.inventoryApp.model.Parts;
import sa45.team9.inventoryApp.model.Suppliers;
import sa45.team9.inventoryApp.services.IPartsService;
import sa45.team9.inventoryApp.services.RecordService;

@RequestMapping("/part")
@Controller
public class RecordController {
	
	//private RecordService recordService;
	@Autowired
	private IPartsService pService;
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editSearchDetailPage(@PathVariable String id) {
		ModelAndView mav = new ModelAndView("Record");
		Parts partList = pService.findParts(id);
		mav.addObject("part", partList);
		// mav.addObject("suppliersList", iSuppliersService.getSuppliers());
		return mav;
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView changePart(@ModelAttribute @Valid Parts part, BindingResult result,
			@PathVariable String id, final RedirectAttributes redirectAttributes) throws ProductNotFound {

		if (result.hasErrors())
			return new ModelAndView("SearchPage");

		String message = "Part was successfully record.";

		pService.changeParts(part); // update the record in db
		ModelAndView mav = new ModelAndView("redirect:/part/search");
		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
	
//	@RequestMapping("/save")
//    public String Save(@ModelAttribute Parts part,HttpServletRequest req,HttpServletResponse resp) throws IOException{
//		recordService.save(part);
//		req.setAttribute("parts", recordService.findAllPart());
//		req.setAttribute("mode", "PART_EDIT");
//		resp.sendRedirect("/");
//		return"Record";
//	}
//	@RequestMapping("/newPart")
//	public String newPart(HttpServletRequest req) {
//		req.setAttribute("mode", "BOOK_NEW");
//		return"Record";
//	}
}
