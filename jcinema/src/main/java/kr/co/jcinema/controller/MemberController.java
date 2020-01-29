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

	// �α���
	@GetMapping ("/member/login")
	public String login(){
		return "/member/login";
	}
	
	@PostMapping ("/member/login")
	public String login(MemberVo mvo, HttpSession session){
		MemberVo member = service.selectMember(mvo);
		
		if(member == null) {
			// ȸ���� �ƴ� ���
			return "redirect:/member/login";
		}else {
			// ȸ���� ��� ����ó�� �� index�� �̵�
			session.setAttribute("member", member);		
			return "redirect:/index";
		}
	}
	
	
	// �α׾ƿ�
	@GetMapping ("/member/logout")
	public String logout(HttpSession session){
		return "redirect:/member/login";
	}
	
	
	// REGISTER - GET ��û�� - ����������� ����
	@GetMapping ("/member/register")
	public String register(){
		return "/member/register";
	}
	
	// REGISTER - POST ��û��   - ����� ����Ʈ�� ����
	@PostMapping("/member/register")
	public String register(MemberVo mvo) {
		service.insertMember(mvo);
		return "redirect:/member/login";
	}
	
	
	// ���̽ó׸�
	@GetMapping ("/member/my-cinema")
	public String myCinema(){
		return "/member/my-cinema";
	}
	
	
	
}
