package kr.co.sboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.BoardArticleVO;

@Repository
public class BoardDAO {

	// ���̹�Ƽ�� 
	@Inject
	private SqlSessionTemplate mybatis;

	// ��ü �Խù� ����
	public int getTotalArticle() {
		return mybatis.selectOne("mapper.sql_article.SELECT_TOTAL_ARTICLES");
	}
	
	// �Խñ۵��
	public void insertArticle(BoardArticleVO bvo) {
		mybatis.insert("mapper.sql_article.INSERT_ARTICLE", bvo);
	}
	
	// �Խñ� ���� - seq Ű������ ��ȸ�� �ؾ��� 
	public BoardArticleVO selectArticle(int seq) {
		return null;
	}
	
	// �Խñ� ��ü����(����Ʈ ���)
	public List<BoardArticleVO>selectArticles(int start) {
		return mybatis.selectList("mapper.sql_article.SELECT_ARTICLES",start);
	}
	
	// �Խñ� ����
	public void updateArticle(int seq) {}
	
	// �Խñ� ����
	public void deleteArticle(int seq) {}

	
	
	
	
}
