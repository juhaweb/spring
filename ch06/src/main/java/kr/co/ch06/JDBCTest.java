package kr.co.ch06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2020/01/13
 * �̸� : ������
 * ���� : ������ JDBC �ǽ��ϱ�
 */
public class JDBCTest {

	public static void main(String[] args) {
		
		// ���ؼ� Ǯ�̴ϱ� db ���� ���̵� ��� �������־����. ������ �����Ҷ� �����ϴ� ����� �ƴ� --> context.xml �� ���ؼ�Ǯ ������ �ؾ���. 
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		UserDAO dao = (UserDAO) ctx.getBean("userDAO");
		
		dao.insertUser();
		System.out.println("insert�Ϸ�...");
		
		dao.updateUser();
		System.out.println("update�Ϸ�...");
		
		dao.deleteUser();
		System.out.println("delete�Ϸ�...");
		
	}
	
}
