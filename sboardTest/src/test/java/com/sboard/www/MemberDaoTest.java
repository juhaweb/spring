package com.sboard.www;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sboard.www.dao.MemberDAO;
import com.sboard.www.vo.MemberVO;
import com.sboard.www.vo.TermsVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-context-test.xml"})
public class MemberDaoTest {

	@Inject
	private MemberDAO dao;

	@Test
	public void selectTerms() {
		
		TermsVO tvo =new TermsVO();
		List<TermsVO> list = (List<TermsVO>) dao.selectTerms();
		System.out.println(list);
		
	}

}