package com.sboard.www.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.sboard.www.vo.BoardArticleVO;

@Repository
public class BoardDAO {

	// 마이바티스 
	@Inject
	private SqlSessionTemplate mybatis;

	// 전체 게시물 갯수
	public int getTotalArticle() {
		return mybatis.selectOne("mapper.sql_article.SELECT_TOTAL_ARTICLES");
	}
	
	// 게시글등록
	public void insertArticle(BoardArticleVO bvo) {
		mybatis.insert("mapper.sql_article.INSERT_ARTICLE", bvo);
	}
	
	// 게시글 선택 - seq 키값으로 조회를 해야함 
	public BoardArticleVO selectArticle(int seq) {
		return mybatis.selectOne("mapper.sql_article.SELECT_ARTICLE",seq);
	}
	
	// 게시글 전체선택(리스트 출력)
	public List<BoardArticleVO>selectArticles(int start) {
		return mybatis.selectList("mapper.sql_article.SELECT_ARTICLES",start);
	}
	
	// 게시글 수정
	public void updateArticle(BoardArticleVO bvo) {
		mybatis.update("mapper.sql_article.UPDATE_ARTICLE", bvo);
	}
	
	// 게시글 삭제
	public void deleteArticle(int seq) {
		mybatis.delete("mapper.sql_article.DELETE_ARTICLE",seq);
	}

	// 댓글 등록
	public void insertComment(BoardArticleVO bvo) {
		mybatis.insert("mapper.sql_article.INSERT_COMMENT", bvo);
	}
	
	// 댓글 선택(표시)
	public List<BoardArticleVO>selectComment(int parent) {
		return mybatis.selectList("mapper.sql_article.SELECT_COMMENT",parent);
	}
	
	public void updateComment(BoardArticleVO bvo) {}
	
	public void deleteComment(int seq) {
		mybatis.delete("mapper.sql_article.DELETE_COMMENT",seq);
	}
	

	
	
}
