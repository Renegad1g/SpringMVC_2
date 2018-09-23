package org.tyaa.springmvc2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	/*@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}*/
	
	@RequestMapping("/processFormModel")
	public String processFormModel(HttpServletRequest _req, Model _model) {
		
		String theName = _req.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Hi, " + theName;
		_model.addAttribute("message", result);
		return "helloworld";
	}
}
