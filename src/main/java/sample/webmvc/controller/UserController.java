package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	
//	@RequestParam can read Query parameter
	@GetMapping("/")
	public String greet(@RequestParam(name = "user", defaultValue  = "GuestUser") String user , Model model) {
		System.out.println("Usercontroller.greet() :" +user);
		
		model.addAttribute("user", user);
		
		return "welcome";
	}
	
	@GetMapping("/login")
	public String login() {
		System.out.println("Usercontroller.greet() :" );
		return "login";
	}
	
	@PostMapping("/login")
	public String userLogin(@RequestParam(name = "username") String username,@RequestParam(name = "password") String password , Model model) {
		System.out.println("Usercontroller.greet() :" +username );
		System.out.println("Usercontroller.greet() :" +password );
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		return "profile";
	}
	
	
}

