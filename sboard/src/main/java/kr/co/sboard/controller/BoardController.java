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
	
//	// ����Ʈ
//	@RequestMapping("/list")
//	public String list(HttpServletRequest req) {
//		
//		List<BoardArticleVO> articles =  service.selectArticles();
//		req.setAttribute("articles", articles);
//		
//		return "/list";	
//		
//	}
	
	
	// ����Ʈ 
	@RequestMapping ("/list")
	public String list(HttpSession session,HttpServletRequest req) {
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		if(member == null) {
			// ���������� ���ٸ� -> �α�������
			return"/member/login";
		}else{
			// ���������� �ִٸ� 
			List<BoardArticleVO> articles =  service.selectArticles();
			req.setAttribute("articles", articles);
			return "/list";
		}
	}
	
	
	// �۾��� ����
	@GetMapping ("/write")
	public String write() {
		return"/write";		
	}
	
	// �۾���
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

