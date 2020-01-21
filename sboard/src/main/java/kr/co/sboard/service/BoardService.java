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
		
		
		// �Խñ۵��
		public void insertArticle(BoardArticleVO bvo) {
			dao.insertArticle(bvo);
		}
		
		// �Խñ� ���� - seq Ű������ ��ȸ�� �ؾ��� 
		public BoardArticleVO selectArticle(int seq) {
			return dao.selectArticle(seq);
		}
		
		// �Խñ� ��ü����(����Ʈ ���)
		public List<BoardArticleVO> selectArticles() {
			return dao.selectArticles();
		}
		
		// �Խñ� ����
		public void updateArticle(int seq) {
			dao.updateArticle(seq);
		}
		
		// �Խñ� ����
		public void deleteArticle(int seq) {
			dao.deleteArticle(seq);
		}

		
	
	
}
