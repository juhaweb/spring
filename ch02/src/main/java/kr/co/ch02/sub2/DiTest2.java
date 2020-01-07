package kr.co.ch02.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2020/01/07
 * �̸� : ������
 * ���� : ������ DI �ǽ��ϱ�
 */
public class DiTest2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context");
		
		TV tv3 = (LgTV) ctx.getBean("tv3");
		tv3.power();
		tv3.chUp();
		tv3.soundUp();
		
		TV tv4 = (SamsungTV) ctx.getBean("tv4");
		tv4.power();
		tv4.chUp();
		tv4.soundUp();
		
		
		
	}
}
