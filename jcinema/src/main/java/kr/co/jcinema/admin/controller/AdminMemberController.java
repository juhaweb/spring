package kr.co.jcinema.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminMemberController {

	@GetMapping ("/admin/member/login")
	public String adminLogin() {
		return "/admin/member/login";
	}
	
	
}
