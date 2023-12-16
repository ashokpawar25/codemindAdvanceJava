package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MyController {

	@RequestMapping(value = "/about",method =RequestMethod.GET)
	public String about(Model model) {
		System.out.println("inside the about handler");
		model.addAttribute("name","Ashok Pawar");
		model.addAttribute("currentDate",new Date().toLocaleString());
		
		return "about";
	}
	
	@GetMapping("/loop")
	public String loop(Model m)
	{
		List<String> list=List.of("Ankit","Laxmi","karan","John");
		m.addAttribute("list",list);
		return "loop";
	}
	
	@GetMapping("/condition")
	public String condition(Model m)
	{
		List<Integer> list=List.of(221);
		m.addAttribute("list" ,list);
		
		m.addAttribute("gender","F");
		
		m.addAttribute("isActive",false);
		return "condition";
	}
	
	@GetMapping("/fragment")
	public String fragmentHandeler(Model m)
	{
		return "service";
	}
	
	
	@GetMapping("/newAbout")
	public String content(Model m)
	{
		return "newAbout";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
}

















