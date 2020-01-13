package kr.co.ch06;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2020/01/13
 * �̸� : ������
 * ���� : ������ JDBC Select �ǽ��ϱ�
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
//			System.out.println("���̵�:"+vo.getUid());
//			System.out.println("�̸�:"+vo.getName());
//			System.out.println("�޴���:"+vo.getHp());
//			System.out.println("����:"+vo.getAge());
//		}
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		UserDAO dao = (UserDAO) ctx.getBean("userDAO");
		
		UserVO user = dao.selectUser("S102");
		System.out.println("���̵�:"+user.getUid());
		System.out.println("�̸�:"+user.getName());
		System.out.println("�޴���:"+user.getHp());
		System.out.println("����:"+user.getAge());

		
		List<UserVO> users = dao.selectUsers();
		for(UserVO vo : users) {
			System.out.println("===========================");
			System.out.println("���̵�:"+vo.getUid());
			System.out.println("�̸�:"+vo.getName());
			System.out.println("�޴���:"+vo.getHp());
			System.out.println("����:"+vo.getAge());
		}
	
		
		
	}
		
}
