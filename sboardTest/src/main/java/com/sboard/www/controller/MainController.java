package com.sboard.www.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sboard.www.vo.MemberVO;

@Controller
public class MainController {

	@GetMapping (value= {"/", "/index"})
	public String index(HttpSession session) {
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		if(member == null) {
			// �α����� ��������
			return"/member/login";
			
		}else{
			// �α����� ������
			return "/list";
		}
		
	}
}
