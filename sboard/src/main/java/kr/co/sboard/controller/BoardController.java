package kr.co.sboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sboard.vo.MemberVO;


@Controller
public class BoardController {

	// ����Ʈ 
	@RequestMapping ("/list")
	public String list(HttpSession session) {
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		if(member == null) {
			// ���������� ���ٸ� -> �α�������
			return"/member/login";
		}else{
			// ���������� �ִٸ� 
			return "/list";
		}
		
	}
		
		
}

