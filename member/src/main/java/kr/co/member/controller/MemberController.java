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
 * 클라이언트의 요청을 처리할 컨트롤러 작성
 */

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	// LIST 연결 - 리스트로 연결
	@RequestMapping("/member/list")
	public String list(Model model) {
		List<MemberVO> members = service.selectMembers();
		model.addAttribute("members",members);
		return "/member/list";
	}
	
	// REGISTER - GET 요청시 - 등록페이지로 연결
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	// REGISTER - POST 요청시   - 등록후 리스트로 연결
	@PostMapping("/member/register")
	public String register(MemberVO mvo) {
		service.insertMember(mvo);
		return "redirect:/member/list";
	}
	// MODIFY - GET 요청시 - 수정페이지 연결
	@RequestMapping(value="/member/modify",method=RequestMethod.GET)
	public String modify(String uid, Model model) {
		MemberVO member = service.selectMember(uid);
		model.addAttribute("member", member);
		return "/member/modify";
	}
	
	// MODIFY - POST 요청시 - 수정후 리스트로 연결
	@RequestMapping(value="/member/modify",method=RequestMethod.POST)
	public String modify(MemberVO mvo) {
		service.updateMember(mvo);
		return "redirect:/member/list";
	}
	
	
	// DELETE 이후 리스트로 연결
	@RequestMapping("/member/delete")
	public String delete(String uid) {
		service.deleteMember(uid);		
		return "redirect:/member/list";
	}
	
	
}
