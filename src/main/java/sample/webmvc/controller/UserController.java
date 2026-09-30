package sample.webmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		System.out.println("Usercontroller.greet() :" );
	
		return "welcome";
	}
	
	@GetMapping("/login")
	public String login() {
		System.out.println("Usercontroller.login() :" );
		return "login";
	}
	
	@GetMapping("/path/{id}")
	@ResponseBody
	public User pathVariable(@PathVariable(name = "id") int id) {
		System.out.println("Usercontroller.pathVariable() :" +id );
		
		
		return userService.getUserById(id);
	}
	
	@GetMapping("/sign-up")
	public String signUp() {
		System.out.println("Usercontroller.signUp() :" );
		return "signup";
	}
	
	@PostMapping("/sign-up")
	public String saveUser(@ModelAttribute User user, Model model) {
		System.out.println("Usercontroller.saveUser :"  );
		System.out.println(user);
		
		
		userService.saveUser(user);
		
		model.addAttribute("user", user);
		
		return "success";
	}
	
	//Update user by id
	@GetMapping("/update/{id}")
	public String showUpdateUser(@PathVariable(name = "id")int id, Model model) {
		
		User user = userService.getUserById(id);
		
		model.addAttribute("user", user);
		return "update";
	}
	
	@PostMapping("/update")
	public String updateUser(@ModelAttribute User user) {
		
		userService.updateUser(user);
		
		return "redirect:/path/" + user.getId();
		
	}
	
	//delete user by id
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable(name = "id") int id) {
		userService.deleteUser(id);
		return "redirect:/";
	}
	
//	@PostMapping("/sign-up")
//	public String saveUser(@RequestParam(name = "name") String name,@RequestParam(name = "gender") String gender,@RequestParam(name = "address") String address , Model model) {
//		System.out.println("Usercontroller.sign-upName() :" +name );
//		System.out.println("Usercontroller.sign-upGebder() :" +gender );
//		
//		User user = new User(name, gender, address);
//		
//		userService.saveUser(user);
//		
//		model.addAttribute("user", user);
//		
//		return "success";
//	}
	

	
	@PostMapping("/login")
	public String userLogin(@RequestParam(name = "username") String username,@RequestParam(name = "password") String password , Model model) {
		
		System.out.println("Usercontroller.loginUsername() :" +username );
		System.out.println("Usercontroller.loginPassword() :" +password );
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		return "profile";
	}
	
	
}

