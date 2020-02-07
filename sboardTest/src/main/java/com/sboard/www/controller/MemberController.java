package com.sboard.www.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import com.sboard.www.service.MemberService;
import com.sboard.www.vo.MemberVO;
import com.sboard.www.vo.TermsVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	// 로그인
	@GetMapping ("/member/login")
	public String login() {
		return "/member/login";
	}
	
	@PostMapping ("/member/login")
	public String login(MemberVO mvo, HttpSession session) {
		
		MemberVO member = service.selectMember(mvo);
		
		if(member == null) {
			// 회원이 아닐 경우
			return "redirect:/member/login";
		}else {
			// 회원일 경우 세션처리 후 list로 이동
			session.setAttribute("member", member);
			return "redirect:/list";
		}
	}
	
	//로그아웃
	@GetMapping ("member/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/member/login";
	}

	// 회원가입 약관 
	@GetMapping ("/member/terms")
	public String terms(Model model){
		TermsVO tvo = service.selectTerms();
		model.addAttribute("tvo",tvo);
		return "/member/terms";
	}
	
	// 회원가입 폼
	@GetMapping ("/member/register")
	public String register() {
		return "/member/register";
	}
	
	// 회원가입 폼작성완료 전송
	@PostMapping ("/member/register")
	public String register(MemberVO mvo, HttpServletRequest req) {
		// 아이피얻어오기
		String regip = req.getRemoteAddr();
		mvo.setRegip(regip);
		
		service.insertMember(mvo);
		return "redirect:/member/login";
	}
	
	/*
	 @ResponseBody
	- 자바 객체를 HTTP 응답 몸체로 전송함
	- 자바 객체를 HTTP 요청의 body 내용으로 매핑하는 역할
	- 출력결과를 View 페이지 포워드로 실행하지 않고 바로 데이터를 response처리	
	*/
	
	// 회원가입 아이디 중복 체크
	@ResponseBody
	@GetMapping("/member/checkUid")
	public String checkUid(String uid) {
		int result = service.selectUidCount(uid);
		
		JsonObject obj = new JsonObject();
		obj.addProperty("result", result);
		
		String json = new Gson().toJson(result);
		return json;
	}
	
	
		
	
	
	
	
}
