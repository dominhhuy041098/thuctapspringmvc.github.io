package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.entitíe.User;


@Controller
public class LoginController {
	@RequestMapping("")
	public String loadHomePage() {
		return "login";
	}
	
	@RequestMapping(value = "login", method=RequestMethod.POST)
	public String doAction(Model model, User user) {
		if(user.getUsername().equals("admin")&&user.getPassword().equals("123")) {
			model.addAttribute("user", user);
			return "homepage";
		}
		return "error";
	}
}
