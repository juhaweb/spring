package kr.co.jcinema.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller ("AdminMainController")
@Controller
public class AdminMainController {

	@GetMapping (value= {"/admin","/admin/", "/admin/index"})
	public String index() {
		return"/admin/index";
	}
	
	
	
	
}