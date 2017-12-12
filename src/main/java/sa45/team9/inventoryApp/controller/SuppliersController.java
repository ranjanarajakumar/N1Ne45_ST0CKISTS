package sa45.team9.inventoryApp.controller;

import java.util.ArrayList;
import java.util.List;

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

import sa45.team9.inventoryApp.exception.SupplierNotFound;
import sa45.team9.inventoryApp.model.Suppliers;
import sa45.team9.inventoryApp.services.ISuppliersService;
import sa45.team9.inventoryApp.model.Parts;
import sa45.team9.inventoryApp.services.IReportService;

@Controller
@RequestMapping(value = "/admin/suppliers")
public class SuppliersController {
	@Autowired
	private ISuppliersService iSuppliersService;
	@Autowired
	private IReportService RService;
	@InitBinder("supplier")
	private void initSupplierBinder(WebDataBinder binder) {
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newSupplierPage() {
		ModelAndView mav = new ModelAndView("admin/suppliers-new", "supplier", new Suppliers());
		return mav;
	}
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public ModelAndView createNewSupplier(@ModelAttribute @Valid Suppliers supplier, BindingResult result,
			final RedirectAttributes redirectAttributes) {

		if (result.hasErrors())
			return new ModelAndView("redirect:/admin/suppliers/new");

		ModelAndView mav = new ModelAndView();
		String message = "New Supplier " + supplier.getSupplierID() + " was successfully created.";

		iSuppliersService.createSupplier(supplier);
		mav.setViewName("redirect:/admin/suppliers/list");
		//mav.setViewName("admin/suppliers-list");
		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView suppliersListPage() {
		ModelAndView mav = new ModelAndView("suppliers-list");
		List<Suppliers> suppliersList = iSuppliersService.getSuppliers();
		mav.addObject("suppliersList", suppliersList);
		mav.setViewName("admin/suppliers-list");
		return mav;
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editSuppliersPage(@PathVariable String id) {
		ModelAndView mav = new ModelAndView("admin/suppliers-edit");
		Suppliers suppliersList = iSuppliersService.findSupplier(id);
		mav.addObject("supplier", suppliersList);
		// mav.addObject("suppliersList", iSuppliersService.getSuppliers());
		return mav;
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView changeSupplier(@ModelAttribute @Valid Suppliers supplier, BindingResult result,
			@PathVariable String id, final RedirectAttributes redirectAttributes) throws SupplierNotFound {

		if (result.hasErrors())
			return new ModelAndView("admin/suppliers-edit");

		String message = "Supplier was successfully updated.";

		iSuppliersService.changeSupplier(supplier); // update the record in db
		ModelAndView mav = new ModelAndView("redirect:/admin/suppliers/list");
		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteSupplier(@PathVariable String id, final RedirectAttributes redirectAttributes)
			throws SupplierNotFound {

		ModelAndView mav = new ModelAndView("redirect:/admin/suppliers/list");
		Suppliers suppliersList = iSuppliersService.findSupplier(id);
		iSuppliersService.removeSupplier(suppliersList);
		String message = "The department " + suppliersList.getSupplierID() + " was successfully deleted.";

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
	@RequestMapping(value = "/report/{id}", method = RequestMethod.GET)
	public ModelAndView PartsListPage(@PathVariable String id) {
		ModelAndView mav = new ModelAndView("/admin/reorder-report");
		ArrayList<Parts> PartsList = RService.findPendingProductByID(id);
		mav.addObject("partsList",PartsList);		
		return mav;
	}

}
