package com.database;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		
		int a=10;
		int b=20;
		return "this is just to test  sum of a and b is "+(a+b);
	}
}
