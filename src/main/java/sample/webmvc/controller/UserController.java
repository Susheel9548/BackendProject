package sample.webmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sample.webmvc.entity.User;
import sample.webmvc.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/")
	public String greet() {
		System.out.println("Usercontroller.greet() :");

		return "welcome";
	}

	@GetMapping("/{id}")
	@ResponseBody
	public User pathVariable(@PathVariable(name = "id") int id) {
		System.out.println("Usercontroller.pathVariable() :" + id);

		return userService.getUserById(id);
	}

	@PostMapping
	@ResponseBody
	public User saveUser(@RequestBody User user) {
		System.out.println("Usercontroller.saveUser :");
		System.out.println(user);


		return userService.saveUser(user);
	}

}
