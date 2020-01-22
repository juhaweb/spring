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
	
	// 게시글 리스트 출력
	@RequestMapping("/list")
	public String list(HttpServletRequest req, String pg) {
		
		// 전체 게시물 갯수
		int total = service.getTotalArticle();
		
		// LIMIT 번호 계산
		int start = service.getLimitStart(pg);
		
		// 마지막 페이지 번호 계산
		int pageEnd = service.getPageEnd(total);
		
		// 글 순서 카운터 번호
		int count = service.getLIstCount(total, start);
		
		List<BoardArticleVO> articles = service.selectArticles(start);
		
		req.setAttribute("articles", articles);
		req.setAttribute("pageEnd", pageEnd);
		req.setAttribute("count", count);
		
		return "/list";
	}
	
	// 게시글 보기
	@GetMapping ("/view")
	public String view(int seq, Model model) {
		// 매개변수를 선언하면 디스패쳐가 알아서 겟 할거고 알아서 전달해줄거임.
		// vo에서 참조할수있게 모델로 저장
		BoardArticleVO article = service.selectArticle(seq);
		
		// 댓글출력
		List<BoardArticleVO> comment = service.selectComment(seq);
		
		model.addAttribute(article);
		model.addAttribute("comments",comment);
							// 얘는 이름 정해줘야함 --->view.jsp
		
							// 이름이 BoardArticleVO 타입이 됨
		return "/view";
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

	// 게시글 수정
	@GetMapping("/modify")
		public ModelAndView modify(int seq) {
				// 리언타입이 모델엔 뷰 됨. 
		BoardArticleVO article = service.selectArticle(seq);
		ModelAndView mav = new ModelAndView();
		mav.addObject("article" ,article);
		mav.setViewName("/modify");
			
			return mav;
		}
	
	// 게시글 수정후 전송
	@PostMapping("/modify")
		public String modify(BoardArticleVO bvo) {
		
		service.updateArticle(bvo);
			
		return "redirect:/view?seq="+bvo.getSeq();
		}
	
	
	// 게시글 삭제
	@GetMapping ("/delete")
	public String delete(int seq) {
		service.deleteArticle(seq);
		return "redirect:/list";
	}
		
		
		
	// 댓글쓰기
	@PostMapping ("/comment/write")
	public String commentWrite(HttpServletRequest req,int parent, int seq, String comment) {
		// 서블릿 리퀘스트를 디스페쳐로 받아서 리퀘스트로 겟 세션 해서,
		HttpSession session = req.getSession();
		// 세션에서 getAttri
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
	
	
	// 댓글 삭제
	@GetMapping ("/comment/delete")
	public String commentDelete(int seq) {
		
		service.deleteComment(seq);
		
		return "redirect:/list";
	}

	
		
}


// request, Model, ModelAndView 많이 볼거임. 

