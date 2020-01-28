package kr.co.jcinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping ("/member/login")
	public String login(){
		return "/member/login";
	}
	
	@GetMapping ("/member/logout")
	public String logout(){
		return "/member/login";
	}
	
	@GetMapping ("/member/my-cinema")
	public String myCinema(){
		return "/member/my-cinema";
	}
	
	@GetMapping ("/member/register")
	public String register(){
		return "/member/register";
	}
	
	
	
}
