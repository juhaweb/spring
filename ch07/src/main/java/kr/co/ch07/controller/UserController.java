package kr.co.ch07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.ch07.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.ch07.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;

	@RequestMapping("/user/form")
	public String form() {
		return "/user/form";
	}
	
	@RequestMapping("/user/list")
	public String list() {
		return "/user/list";
	}
	
	@RequestMapping("/user/register")
	public String register(UserVO vo) {
		service.insertUser(vo);
		return "redirect:/user/list";
	}
	
	
}
