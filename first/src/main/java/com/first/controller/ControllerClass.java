package com.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass 
{
	@RequestMapping("/")
	public String home()
	{
		System.out.println("This is home page");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("This is home page");
		return "contact";
	}
	
	
}
