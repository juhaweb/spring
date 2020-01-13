package kr.co.ch06;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class JDBCMemberTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		MemberDAO dao = (MemberDAO) ctx.getBean("memberDAO");
		
		List<MemberVO> member = dao.selectMembers();
		for(MemberVO mvo : member) {
			
			System.out.println("아이디:"+mvo.getUid());
			
		}
		System.out.println("===================");
		
		List<Map<String, Object>> members = dao.SelectMembersMap();
		for(Map<String, Object> map :members) {
		
			System.out.println("아이디:"+map.get("uid"));
		}
		
		
		
		
		
	}
	
}
