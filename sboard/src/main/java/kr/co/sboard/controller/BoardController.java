package kr.co.sboard.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.sboard.service.BoardService;
import kr.co.sboard.vo.BoardArticleVO;
import kr.co.sboard.vo.MemberVO;


@Controller
public class BoardController {

	@Inject
	private BoardService service;
	
	// �Խñ� ����Ʈ ���
	@RequestMapping("/list")
	public String list(HttpServletRequest req, String pg) {
		
		// ��ü �Խù� ����
		int total = service.getTotalArticle();
		
		// LIMIT ��ȣ ���
		int start = service.getLimitStart(pg);
		
		// ������ ������ ��ȣ ���
		int pageEnd = service.getPageEnd(total);
		
		// �� ���� ī���� ��ȣ
		int count = service.getLIstCount(total, start);
		
		List<BoardArticleVO> articles = service.selectArticles(start);
		
		req.setAttribute("articles", articles);
		req.setAttribute("pageEnd", pageEnd);
		req.setAttribute("count", count);
		
		return "/list";
	}
	
	// �Խñ� ����
	@GetMapping ("/view")
	public String view(int seq, Model model) {
		// �Ű������� �����ϸ� �����İ� �˾Ƽ� �� �ҰŰ� �˾Ƽ� �������ٰ���.
		// vo���� �����Ҽ��ְ� �𵨷� ����
		BoardArticleVO article = service.selectArticle(seq);
		
		// ������
		List<BoardArticleVO> comment = service.selectComment(seq);
		
		model.addAttribute(article);
		model.addAttribute("comments",comment);
							// ��� �̸� ��������� --->view.jsp
		
							// �̸��� BoardArticleVO Ÿ���� ��
		return "/view";
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

	// �Խñ� ����
	@GetMapping("/modify")
		public ModelAndView modify(int seq) {
				// ����Ÿ���� �𵨿� �� ��. 
		BoardArticleVO article = service.selectArticle(seq);
		ModelAndView mav = new ModelAndView();
		mav.addObject("article" ,article);
		mav.setViewName("/modify");
			
			return mav;
		}
	
	// �Խñ� ������ ����
	@PostMapping("/modify")
		public String modify(BoardArticleVO bvo) {
		
		service.updateArticle(bvo);
			
		return "redirect:/view?seq="+bvo.getSeq();
		}
	
	
	// �Խñ� ����
	@GetMapping ("/delete")
	public String delete(int seq) {
		service.deleteArticle(seq);
		return "redirect:/list";
	}
		
		
		
	// ��۾���
	@PostMapping ("/comment/write")
	public String commentWrite(HttpServletRequest req,int parent, int seq, String comment) {
		// ���� ������Ʈ�� �����ķ� �޾Ƽ� ������Ʈ�� �� ���� �ؼ�,
		HttpSession session = req.getSession();
		// ���ǿ��� getAttri
		MemberVO member = (MemberVO) session.getAttribute("member");
		String uid = member.getUid();
		String regip = req.getRemoteAddr();
		
		BoardArticleVO bvo = new BoardArticleVO();
		bvo.setParent(parent);
		bvo.setSeq(seq);
		bvo.setContent(comment);
		bvo.setUid(uid);
		bvo.setRegip(regip);
		
		service.insertComment(bvo);		
		
		return "redirect:/view?seq="+parent;
	}
	
	
	// ��� ����
	@GetMapping ("/comment/delete")
	public String commentDelete(int seq) {
		
		service.deleteComment(seq);
		
		return "redirect:/list";
	}

	
		
}


// request, Model, ModelAndView ���� ������. 

