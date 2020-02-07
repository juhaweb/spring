package com.sboard.www.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.sboard.www.vo.BoardArticleVO;

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
		return mybatis.selectOne("mapper.sql_article.SELECT_ARTICLE",seq);
	}
	
	// �Խñ� ��ü����(����Ʈ ���)
	public List<BoardArticleVO>selectArticles(int start) {
		return mybatis.selectList("mapper.sql_article.SELECT_ARTICLES",start);
	}
	
	// �Խñ� ����
	public void updateArticle(BoardArticleVO bvo) {
		mybatis.update("mapper.sql_article.UPDATE_ARTICLE", bvo);
	}
	
	// �Խñ� ����
	public void deleteArticle(int seq) {
		mybatis.delete("mapper.sql_article.DELETE_ARTICLE",seq);
	}

	// ��� ���
	public void insertComment(BoardArticleVO bvo) {
		mybatis.insert("mapper.sql_article.INSERT_COMMENT", bvo);
	}
	
	// ��� ����(ǥ��)
	public List<BoardArticleVO>selectComment(int parent) {
		return mybatis.selectList("mapper.sql_article.SELECT_COMMENT",parent);
	}
	
	public void updateComment(BoardArticleVO bvo) {}
	
	public void deleteComment(int seq) {
		mybatis.delete("mapper.sql_article.DELETE_COMMENT",seq);
	}
	

	
	
}
