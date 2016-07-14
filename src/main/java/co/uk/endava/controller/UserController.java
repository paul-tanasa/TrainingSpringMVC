package co.uk.endava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.uk.endava.model.User;

@Controller
public class UserController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("login", "SpringWeb", new User());
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("SpringWeb") User user, ModelMap model) {

		if (!user.getUsername().toString().equals("paul") || !user.getPassword().toString().equals("paul"))
			return "failed";

		model.addAttribute("username", user.getUsername());
		model.addAttribute("email", user.getEmail());
		model.addAttribute("password", user.getPassword());

		return "result";
	}
}