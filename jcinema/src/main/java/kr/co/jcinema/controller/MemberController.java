package kr.co.jcinema.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.jcinema.service.MemberService;
import kr.co.jcinema.vo.MemberVo;

@Controller
public class MemberController {

	@Inject
	private MemberService service;

	// 로그인
	@GetMapping ("/member/login")
	public String login(){
		return "/member/login";
	}
	
	@PostMapping ("/member/login")
	public String login(MemberVo mvo, HttpSession session){
		MemberVo member = service.selectMember(mvo);
		
		if(member == null) {
			// 회원이 아닐 경우
			return "redirect:/member/login";
		}else {
			// 회원일 경우 세션처리 후 index로 이동
			session.setAttribute("member", member);		
			return "redirect:/index";
		}
	}
	
	
	// 로그아웃
	@GetMapping ("/member/logout")
	public String logout(HttpSession session){
		return "redirect:/member/login";
	}
	
	
	// REGISTER - GET 요청시 - 등록페이지로 연결
	@GetMapping ("/member/register")
	public String register(){
		return "/member/register";
	}
	
	// REGISTER - POST 요청시   - 등록후 리스트로 연결
	@PostMapping("/member/register")
	public String register(MemberVo mvo) {
		service.insertMember(mvo);
		return "redirect:/member/login";
	}
	
	
	// 마이시네마
	@GetMapping ("/member/my-cinema")
	public String myCinema(){
		return "/member/my-cinema";
	}
	
	
	
}
