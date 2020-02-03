package kr.co.jcinema.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminTheaterController {

	@GetMapping("/admin/theater/register")
	public String register() {
		return "/admin/theater/register";
	}
	
	@GetMapping("/admin/theater/register-screen")
	public String registerScreen() {
		return "/admin/theater/register-screen";
	}
	
}
