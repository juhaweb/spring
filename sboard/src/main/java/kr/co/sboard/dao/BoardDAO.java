package kr.co.sboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.BoardArticleVO;

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
		return null;
	}
	
	// 게시글 전체선택(리스트 출력)
	public List<BoardArticleVO>selectArticles(int start) {
		return mybatis.selectList("mapper.sql_article.SELECT_ARTICLES",start);
	}
	
	// 게시글 수정
	public void updateArticle(int seq) {}
	
	// 게시글 삭제
	public void deleteArticle(int seq) {}

	
	
	
	
}
