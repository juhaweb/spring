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
	
	// �α���
	@GetMapping ("/member/login")
	public String login() {
		return "/member/login";
	}
	
	@PostMapping ("/member/login")
	public String login(MemberVO mvo, HttpSession session) {
		
		MemberVO member = service.selectMember(mvo);
		
		if(member == null) {
			// ȸ���� �ƴ� ���
			return "redirect:/member/login";
		}else {
			// ȸ���� ��� ����ó�� �� list�� �̵�
			session.setAttribute("member", member);
			return "redirect:/list";
		}
	}
	
	//�α׾ƿ�
	@GetMapping ("member/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/member/login";
	}

	// ȸ������ ��� 
	@GetMapping ("/member/terms")
	public String terms(Model model){
		TermsVO tvo = service.selectTerms();
		model.addAttribute("tvo",tvo);
		return "/member/terms";
	}
	
	// ȸ������ ��
	@GetMapping ("/member/register")
	public String register() {
		return "/member/register";
	}
	
	// ȸ������ ���ۼ��Ϸ� ����
	@PostMapping ("/member/register")
	public String register(MemberVO mvo, HttpServletRequest req) {
		// �����Ǿ�����
		String regip = req.getRemoteAddr();
		mvo.setRegip(regip);
		
		service.insertMember(mvo);
		return "redirect:/member/login";
	}
	
	/*
	 @ResponseBody
	- �ڹ� ��ü�� HTTP ���� ��ü�� ������
	- �ڹ� ��ü�� HTTP ��û�� body �������� �����ϴ� ����
	- ��°���� View ������ ������� �������� �ʰ� �ٷ� �����͸� responseó��	
	*/
	
	// ȸ������ ���̵� �ߺ� üũ
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
