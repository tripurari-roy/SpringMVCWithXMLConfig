package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping("/hello")
	public String  hello() {
		System.out.println(">>>> Method called");
		return "helloworld";
	}

}
