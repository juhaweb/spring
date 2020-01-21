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
		
		// ��ü �Խù� ����
		public int getTotalArticle() {
			return dao.getTotalArticle();
		}
		
		// LIMIT ��ȣ ���
		public int getLimitStart(String pg) {
			
			if(pg == null) {
				// ������ 1�������ϱ� limit start ��ȣ�� ������ 0
				return 0;
			}else {
				int page = Integer.parseInt(pg);
				return (page-1)*10;
			}	
		}
		
		// ������ ��ȣ ���
		public int getPageEnd(int total) {
			
			int pageEnd = 0;

			if(total % 10 == 0) {
				pageEnd = total / 10;
			}else {
				pageEnd = (total / 10) +1;				
			}
			return pageEnd;
		}
		
		// ��  COUNT(����) ��ȣ
		public int getLIstCount(int total, int start) {
			return (total - start) +1;
		}
			
		// �Խñ۵��
		public void insertArticle(BoardArticleVO bvo) {
			dao.insertArticle(bvo);
		}
		
		// �Խñ� ���� - seq Ű������ ��ȸ�� �ؾ��� 
		public BoardArticleVO selectArticle(int seq) {
			return dao.selectArticle(seq);
		}
		
		// �Խñ� ��ü����(����Ʈ ���)
		public List<BoardArticleVO> selectArticles(int start) {
			return dao.selectArticles(start);
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
