package kr.co.sboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sboard.vo.MemberVO;

@Controller
public class MainController {

	@GetMapping (value= {"/", "/index"})
	public String index(HttpSession session) {
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		if(member == null) {
			// 로그인을 안했으면
			return"/member/login";
			
		}else{
			// 로그인을 했으면
			return "/list";
		}
		
	}
}
