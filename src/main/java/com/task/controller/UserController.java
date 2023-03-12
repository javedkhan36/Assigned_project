package com.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.task.dao.UserRepository;
import com.task.entity.User;
import com.task.helper.Message;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/login")
	public String customLogin(Model model) {
		
		model.addAttribute("title","Login");
		return "login";
	}
	
	@RequestMapping("/")
	public String test(Model model) {
		model.addAttribute("title","Home");
		return "home";
	}
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title","SignUp");
		model.addAttribute("user",new User());
		return "signup";
	}
	@RequestMapping(value="/do_register", method= RequestMethod.POST)
	public String registerUser(@ModelAttribute("user")User user,Model model,HttpSession session) {
		try {

			System.out.println("User"+user);
			User result = userRepository.save(user);
			
			model.addAttribute("user",result);
			session.setAttribute("message", new Message("Succesfully Registered","alert-success"));
		} catch (Exception e) {
			
			e.printStackTrace();
			model.addAttribute("user",user);
			session.setAttribute("message", new Message("Something went wrong!!"+e.getMessage(), "alert-danger"));
			
		}
		return "signup";
		
	}
	
}
