package kr.co.jcinema.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminTheaterController {

	@GetMapping ("/admin/theater/register-screen")
	public String adminTheaterRegisterScreen() {
		return "/admin/theater/register-screen";
	}
	
}