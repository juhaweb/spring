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
		
		// 전체 게시물 갯수
		public int getTotalArticle() {
			return dao.getTotalArticle();
		}
		
		// LIMIT 번호 계산
		public int getLimitStart(String pg) {
			
			if(pg == null) {
				// 무조건 1페이지니까 limit start 번호는 무조건 0
				return 0;
			}else {
				int page = Integer.parseInt(pg);
				return (page-1)*10;
			}	
		}
		
		// 페이지 번호 계산
		public int getPageEnd(int total) {
			
			int pageEnd = 0;

			if(total % 10 == 0) {
				pageEnd = total / 10;
			}else {
				pageEnd = (total / 10) +1;				
			}
			return pageEnd;
		}
		
		// 글  COUNT(순서) 번호
		public int getLIstCount(int total, int start) {
			return (total - start) +1;
		}
			
		// 게시글등록
		public void insertArticle(BoardArticleVO bvo) {
			dao.insertArticle(bvo);
		}
		
		// 게시글 선택 - seq 키값으로 조회를 해야함 
		public BoardArticleVO selectArticle(int seq) {
			return dao.selectArticle(seq);
		}
		
		// 게시글 전체선택(리스트 출력)
		public List<BoardArticleVO> selectArticles(int start) {
			return dao.selectArticles(start);
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
