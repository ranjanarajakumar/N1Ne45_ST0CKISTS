package sa45.team9.inventoryApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import sa45.team9.inventoryApp.exception.SupplierNotFound;
import sa45.team9.inventoryApp.model.Suppliers;
import sa45.team9.inventoryApp.model.User;
import sa45.team9.inventoryApp.services.IUserService;

@RequestMapping(value="/admin/home")
@Controller
public class UserManagementController {
	
	@Autowired
	private IUserService userService;
	@InitBinder("user")
	private void initUserBinder(WebDataBinder binder) {
	}
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public ModelAndView userListPage() {
		ModelAndView mav = new ModelAndView("user-list");
		List<User> userList = userService.getUsers();
		mav.addObject("userList", userList);
		mav.setViewName("admin/user-list");
		return mav;
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView registration() {		
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();		
		modelAndView.addObject("user", user);
		modelAndView.setViewName("admin/registration");
		return modelAndView;
	}
	 @RequestMapping(value = "/registration", method = RequestMethod.POST)
	 public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
	 ModelAndView modelAndView = new ModelAndView();
	 User userExists = userService.findUserByName(user.getUsername());
	 
	 if (userExists != null) {
	 bindingResult.rejectValue("username", "error.user", "There is already a user registered with this name");
	 }
//	 if (bindingResult.hasErrors()) {
//	 modelAndView.setViewName("admin/registration");
//	 }
	 else {
	 userService.saveUser(user);
	 modelAndView.addObject("successMessage", "User has been registered successfully");
	 modelAndView.addObject("user", new User());
	 modelAndView.setViewName("admin/registration");
	 }
	 return modelAndView;
	 }
	 
	 @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
		public ModelAndView deleteUser(@PathVariable String id, final RedirectAttributes redirectAttributes)
				 {
			ModelAndView mav = new ModelAndView("redirect:/admin/home/userList");
			User userList = userService.findUser(id);
			userService.removeUser(userList );
			String message = "The User " + userList.getUsername() + " was successfully deleted.";
			redirectAttributes.addFlashAttribute("message", message);
			return mav;
		}
	
}
