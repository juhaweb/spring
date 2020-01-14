package kr.co.ch07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "index";	
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	

}
