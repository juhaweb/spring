package kr.co.sboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BoardController {

	@RequestMapping ("/list")
	public String list() {
		return "/list";
	}
		
}

