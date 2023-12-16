package com.smart.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smart.dao.UserRepositery;
import com.smart.entities.User;
import com.smart.helper.Message;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@Autowired
	UserRepositery userRepositery;
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("title","Home-contact manager");
		return "home";
		
	}
	
	@GetMapping("/base")
	public String base(Model model) {
		model.addAttribute("title","Base- contact manager");
		return "base";
	}
	
	@GetMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("title","about- contact manager");
		return "about";
	}
	
	@GetMapping("/signup")
	public String signup(Model model)
	{
		model.addAttribute("title","register- contact manager");
		model.addAttribute("user",new User());
		return "signup";
	}
	
	@PostMapping("/do-register")
	public String registerUser(@ModelAttribute("user") User user,@RequestParam(value="agreement",defaultValue="false") boolean agreement,Model model,HttpSession session)
	
	{
		try {
			if (!agreement)
			{
				System.out.println("check agrrment");
				throw new Exception("check agrrment");
			}
			
			user.setRole("ROLE_USER");
			user.setEnabled(true);
			user.setImage("sample.png");
			
			System.out.println("agreement   "+agreement);
			System.out.println("User "+user);
			
			User user2=this.userRepositery.save(user);
			model.addAttribute("user",new User());
			
			session.setAttribute("message",new Message("successfully registered", "alert-success"));
			return "signup";
		} 
		catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("user",user);
			session.setAttribute("message",new Message("something went wrong !!"+e.getMessage(), "alert-error"));
			return "signup";
			
			
		}
		
		
		
	}
}










