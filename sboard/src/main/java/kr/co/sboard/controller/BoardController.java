package kr.co.sboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sboard.vo.MemberVO;


@Controller
public class BoardController {

	// 리스트 
	@RequestMapping ("/list")
	public String list(HttpSession session) {
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		if(member == null) {
			// 세션정보가 없다면 -> 로그인으로
			return"/member/login";
		}else{
			// 세션정보가 있다면 
			return "/list";
		}
		
	}
		
		
}

