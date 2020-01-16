package kr.co.ch08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ch08.service.MemberService;
import kr.co.ch08.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	
	@RequestMapping("/member/list")
	public String list(Model model) {
		List<MemberVO> members = service.selectMembers();
		model.addAttribute("members",members);
		return "/member/list";
	}
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	@PostMapping("/member/register")
	public String register(MemberVO mvo) {
		service.insertMember(mvo);
		return "redirect:/member/list";
	}
	

	
	@RequestMapping(value="/member/modify",method=RequestMethod.GET)
	public String modify(String uid, Model model) {
		MemberVO member = service.selectMember(uid);
		model.addAttribute("member", member);
		return "/member/modify";
	}
	
	@RequestMapping(value="/member/modify",method=RequestMethod.POST)
	public String modify(MemberVO mvo) {
		service.updateMember(mvo);
		return "redirect:/member/list";
	}
	
	
	
	@RequestMapping("/member/delete")
	public String delete(String uid) {
		service.deleteMember(uid);		
		return "redirect:/member/list";
	}
	
	
}
