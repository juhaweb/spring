package kr.co.ch06;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2020/01/13
 * 이름 : 하정욱
 * 내용 : 스프링 JDBC Select 실습하기
 */
public class JDBCSelectTest {

	public static void main(String[] args) {
			
//		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
//		
//		UserDAO dao = (UserDAO) ctx.getBean("userDAO");
//		
//		List<UserVO> user = dao.selectUser("S102");
//		
//		for(UserVO vo : user) {
//			System.out.println("아이디:"+vo.getUid());
//			System.out.println("이름:"+vo.getName());
//			System.out.println("휴대폰:"+vo.getHp());
//			System.out.println("나이:"+vo.getAge());
//		}
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		UserDAO dao = (UserDAO) ctx.getBean("userDAO");
		
		UserVO user = dao.selectUser("S102");
		System.out.println("아이디:"+user.getUid());
		System.out.println("이름:"+user.getName());
		System.out.println("휴대폰:"+user.getHp());
		System.out.println("나이:"+user.getAge());

		
		List<UserVO> users = dao.selectUsers();
		for(UserVO vo : users) {
			System.out.println("===========================");
			System.out.println("아이디:"+vo.getUid());
			System.out.println("이름:"+vo.getName());
			System.out.println("휴대폰:"+vo.getHp());
			System.out.println("나이:"+vo.getAge());
		}
	
		
		
	}
		
}
