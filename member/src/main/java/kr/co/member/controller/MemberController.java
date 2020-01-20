package kr.co.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.member.service.MemberService;
import kr.co.member.vo.MemberVO;

/*
 * Ŭ���̾�Ʈ�� ��û�� ó���� ��Ʈ�ѷ� �ۼ�
 */

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	// LIST ���� - ����Ʈ�� ����
	@RequestMapping("/member/list")
	public String list(Model model) {
		List<MemberVO> members = service.selectMembers();
		model.addAttribute("members",members);
		return "/member/list";
	}
	
	// REGISTER - GET ��û�� - ����������� ����
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	// REGISTER - POST ��û��   - ����� ����Ʈ�� ����
	@PostMapping("/member/register")
	public String register(MemberVO mvo) {
		service.insertMember(mvo);
		return "redirect:/member/list";
	}
	// MODIFY - GET ��û�� - ���������� ����
	@RequestMapping(value="/member/modify",method=RequestMethod.GET)
	public String modify(String uid, Model model) {
		MemberVO member = service.selectMember(uid);
		model.addAttribute("member", member);
		return "/member/modify";
	}
	
	// MODIFY - POST ��û�� - ������ ����Ʈ�� ����
	@RequestMapping(value="/member/modify",method=RequestMethod.POST)
	public String modify(MemberVO mvo) {
		service.updateMember(mvo);
		return "redirect:/member/list";
	}
	
	
	// DELETE ���� ����Ʈ�� ����
	@RequestMapping("/member/delete")
	public String delete(String uid) {
		service.deleteMember(uid);		
		return "redirect:/member/list";
	}
	
	
}
