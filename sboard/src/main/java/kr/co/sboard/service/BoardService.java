package kr.co.sboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.BoardDAO;
import kr.co.sboard.vo.BoardArticleVO;

@Service
public class BoardService {

		@Autowired
		private BoardDAO dao;
		
		
		// 게시글등록
		public void insertArticle(BoardArticleVO bvo) {
			dao.insertArticle(bvo);
		}
		
		// 게시글 선택 - seq 키값으로 조회를 해야함 
		public BoardArticleVO selectArticle(int seq) {
			return dao.selectArticle(seq);
		}
		
		// 게시글 전체선택(리스트 출력)
		public List<BoardArticleVO> selectArticles() {
			return dao.selectArticles();
		}
		
		// 게시글 수정
		public void updateArticle(int seq) {
			dao.updateArticle(seq);
		}
		
		// 게시글 삭제
		public void deleteArticle(int seq) {
			dao.deleteArticle(seq);
		}

		
	
	
}
