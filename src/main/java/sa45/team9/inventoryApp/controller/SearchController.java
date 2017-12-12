package sa45.team9.inventoryApp.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sa45.team9.inventoryApp.model.Parts;
import sa45.team9.inventoryApp.pojo.SearchPart;
import sa45.team9.inventoryApp.services.IOrderService;
import sa45.team9.inventoryApp.services.IPartsService;
@RequestMapping(value="/part")
@Controller
public class SearchController {
	@Autowired
	private IPartsService pService;
	@Autowired
	private IOrderService oService;
	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchPage(@ModelAttribute SearchPart searchPart) {
		ModelAndView mav = new ModelAndView("SearchPage");
		SearchPart s = null;
		if (searchPart != null) {
			s = searchPart;
		} else {
			s = new SearchPart();
		}
		mav.addObject("searchPart", s);
		return mav;
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView resultsPage(@ModelAttribute SearchPart searchPart) {
		ModelAndView mav = new ModelAndView("SearchPage");
		List<Parts> searchParts = pService.search(searchPart);
		if (searchParts == null || searchParts.size() == 0) {
			searchPart.setErrorMsg("No search results found!");
		} else {
			searchPart.setParts(searchParts);
		}
		mav.addObject("searchPart", searchPart);
		return mav;
	}

	@RequestMapping(value = "/search/results", method = RequestMethod.GET)
	public ModelAndView blahblah() {
		ModelAndView mav = new ModelAndView();
		mav = new ModelAndView("DisplaySearchResults");
		mav.addObject("pList", pService.findAllParts());
		return mav;
	}
	//Need testing
	@RequestMapping(value = "/details/{partNumber}", method = RequestMethod.GET)
	public ModelAndView ViewDetails(@PathVariable String partNumber) {
		ModelAndView mav = new ModelAndView("Details");
		Parts part = pService.viewDetails(partNumber);
		mav.addObject("part", part);
		return mav;
	}

	@RequestMapping(value = "/thistory/{partNumber}", method = RequestMethod.GET)
	public ModelAndView ViewTransHistory(@PathVariable String partNumber) {
		ModelAndView mav = new ModelAndView("TransactionHistory");
		Parts part = pService.viewDetails(partNumber);
		mav.addObject("part", part);
		mav.addObject("olist", oService.findAllOrders());
		return mav;
	}
}
//		@RequestMapping(value = "/details/{partNumber}", method = RequestMethod.POST)
//	    public String Save(@ModelAttribute Parts part,HttpServletRequest req,HttpServletResponse resp) throws IOException{
//			pService.save(part);
//			req.setAttribute("part", pService.findAllParts());
//			req.setAttribute("mode", "PART_EDIT");
//			resp.sendRedirect("/");
//			return"search";
//		}
//	@RequestMapping(value="/search")
//	public ModelAndView Search(Parts part,@RequestParam(value = "part.partNumber", required = false) String pSearchTerm, HttpServletRequest request, HttpServletResponse response, Model model) {
//	    ModelAndView mav = new ModelAndView("search");
//	    mav.addObject("part.partNumber", pSearchTerm);
//	    //mav.addObject( "partList", pService.findByNumber(pSearchTerm));
//	    model.addAttribute("partList", pService.findByNumber(pSearchTerm));
//	    return mav;
//	}
	 
//	@RequestMapping(value="/search/{searchTerm}")
//	public ModelAndView Search(@PathVariable("searchTerm") String pSearchTerm) {
//	    ModelAndView mav = new ModelAndView("search");
//
//	    mav.addObject("searchTerm", pSearchTerm);
//	    mav.addObject("searchResult", sp.findTeamByName(pSearchTerm));      
//
//	    return mav;
//	}
//	@ModelAttribute
//    public PartSearchCriteria criteria() {
//
//        return new PartSearchCriteria();
//
//    }
//	
//	
//	@RequestMapping(value = "/search/${part.PartNumber}", method = RequestMethod.GET)
//	public ModelAndView partListPage(@RequestParam(value="part.PartNumber", required=false) String pSearchTerm, HttpServletRequest request, HttpServletResponse response)
//	{
//		ModelAndView mav = new ModelAndView("DisplaySearchResults");
//		mav.addObject("part.PartNumber", pSearchTerm);
//		mav.addObject("searchResult", pService.findByNumber(pSearchTerm));
//		//mav.setViewName("redirect:/part/search/results");	
//		return mav;
//	}
//@RequestMapping(value = "/search" , method = RequestMethod.GET)
//public ModelAndView searchPage() {
//	ModelAndView mav = new ModelAndView("search");
//	mav.addObject("partList", pService.findAllParts());
//	return mav;
//}
//
//@RequestMapping(value="/search")
//public ModelAndView Search(@RequestParam(value = "txtPartNumber", required = false) String pSearchByPartNumber,
//		                   @RequestParam(value = "txtPartNumber", required = false) String pSearchByPartDescription ,
//		                   @RequestParam(value = "txtPartNumber", required = false) String pSearchByPartColor,
//		                   @RequestParam(value = "txtPartNumber", required = false) String psearchByPartManufacturer,
//						   HttpServletRequest request, HttpServletResponse response) {
//    ModelAndView mav = new ModelAndView("search");
//    mav.addObject("partNumberTerm", pSearchByPartNumber);
//    mav.addObject("partDescriptionTerm", pSearchByPartDescription);
//    mav.addObject("partColorTerm", pSearchByPartColor);
//    mav.addObject("partManufacturerTerm", psearchByPartManufacturer);
//    mav.addObject( "partList", pService.findByNumberAndDescriptionAndColorAndManufacturer(pSearchByPartNumber, pSearchByPartDescription, pSearchByPartColor, psearchByPartManufacturer));
//    return mav;
//}
//
//
