package kr.co.ch07.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

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
	
//	@RequestMapping("/user/list")
//	public String list(HttpServletRequest res) {				//list메서드만 있으면 디스페쳐(dispatcher)가 실행함 
//		List<UserVO> users = service.selectUsers();
//		return "/user/list";
//	}
	
	@RequestMapping("/user/list")
	public String list(Model model) {							// Spring에서는 Model로 참조함.  
		List<UserVO> users = service.selectUsers();
		
//		model.addAttribute("users",users);	//이케하는게 맞으나 "aaa"는 이해를 돕기 위해 --->list.jsp
		model.addAttribute("aaa",users);
		
		return "/user/list";
	}
	
	
	@RequestMapping("/user/register")
	public String register(UserVO vo) {
		service.insertUser(vo);
		return "redirect:/user/list";
	}
	
	
}
