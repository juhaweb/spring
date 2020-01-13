package kr.co.ch06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2020/01/13
 * 이름 : 하정욱
 * 내용 : 스프링 JDBC 실습하기
 */
public class JDBCTest {

	public static void main(String[] args) {
		
		// 컨넥션 풀이니까 db 계정 아이디 비번 정해져있어야함. 쿼리문 실행할때 접속하는 방식이 아님 --> context.xml 에 컨넥션풀 설정을 해야함. 
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		UserDAO dao = (UserDAO) ctx.getBean("userDAO");
		
		dao.insertUser();
		System.out.println("insert완료...");
		
		dao.updateUser();
		System.out.println("update완료...");
		
		dao.deleteUser();
		System.out.println("delete완료...");
		
	}
	
}
