package com.codingdojo.spring.survay.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
public class controller {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	

	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String submit(HttpSession session, 
			@RequestParam(value="name", defaultValue="") String name, 
			@RequestParam(value="location") String dojo, 
			@RequestParam(value="language") String lang, 
			@RequestParam(value="comment", required=false) String comment) {
		
		session.setAttribute("name", name);
		session.setAttribute("dojo", dojo);
		session.setAttribute("language", lang);
		session.setAttribute("comment", comment);
		
		
		System.out.println(name);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result(HttpSession session, Model model) {
		String myName = (String) session.getAttribute("name");
		String myDojo = (String) session.getAttribute("dojo");
		String myLang = (String) session.getAttribute("language");
		String myComment = (String) session.getAttribute("comment");
		model.addAttribute("myName", myName);
		model.addAttribute("myDojo", myDojo);
		model.addAttribute("myLang", myLang);
		model.addAttribute("myComment", myComment);
		
		
		return "result.jsp";
	}
	
	
}
