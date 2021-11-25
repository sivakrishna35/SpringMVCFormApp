package com.mouri.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mouri.model.HelloWorldCls;

@Controller 
public class SpringController {
	
	@GetMapping("/")
	public String hello() {
		System.out.println("this is from hello().");
		return "Hello Spring MVC";
	}
	
	@GetMapping("/getMsg")
	public String getMessage() {
		System.out.println("this is from getMessage().");
		return "Hello Spring MVC! How r u";
	}
	
	@RequestMapping("/helloworld")
	public ModelAndView handler(HttpServletRequest req, HttpServletResponse res) {
		HelloWorldCls helloWorld = new HelloWorldCls();
		helloWorld.setMessage("HelloWorld example");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		System.out.println("this is from handler().");
		System.out.println("second modification.");
		ModelAndView model = new ModelAndView("helloworld");
		model.addObject("helloWorld", helloWorld);
		
		return model;
	}

}
