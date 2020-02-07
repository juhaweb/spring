package com.sboard.www;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sboard.www.dao.BoardDAO;
import com.sboard.www.vo.BoardArticleVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-context-test.xml"})
public class BoardDaoTest {

	@Inject
	private BoardDAO dao;

	@Test
	public void test() {
		
		BoardArticleVO bvo =new BoardArticleVO();
		System.out.println(bvo);
		
	}
	
	

	
}
