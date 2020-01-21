package kr.co.sboard.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sboard.service.BoardService;
import kr.co.sboard.vo.BoardArticleVO;
import kr.co.sboard.vo.MemberVO;


@Controller
public class BoardController {

	@Inject
	private BoardService service;
	
//	// 리스트
//	@RequestMapping("/list")
//	public String list(HttpServletRequest req) {
//		
//		List<BoardArticleVO> articles =  service.selectArticles();
//		req.setAttribute("articles", articles);
//		
//		return "/list";	
//		
//	}
	
	
	// 리스트 
	@RequestMapping ("/list")
	public String list(HttpSession session,HttpServletRequest req) {
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		if(member == null) {
			// 세션정보가 없다면 -> 로그인으로
			return"/member/login";
		}else{
			// 세션정보가 있다면 
			List<BoardArticleVO> articles =  service.selectArticles();
			req.setAttribute("articles", articles);
			return "/list";
		}
	}
	
	
	// 글쓰기 들어가기
	@GetMapping ("/write")
	public String write() {
		return"/write";		
	}
	
	// 글쓰기
	@PostMapping("/write")
	public String write(HttpServletRequest req, String subject, String content) {

		HttpSession session = req.getSession();
		MemberVO member = (MemberVO) session.getAttribute("member");


		BoardArticleVO bvo = new BoardArticleVO();
		bvo.setCate("free");
		bvo.setTitle(subject);
		bvo.setContent(content);
		bvo.setUid(member.getUid());
		bvo.setRegip(req.getRemoteAddr());		

		service.insertArticle(bvo);

		return "redirect:/list";
	}
	
	
	
		
}

