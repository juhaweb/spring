package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.ch02.LgTV;
import kr.co.ch02.SamsungTV;
import kr.co.ch02.TV;

/*
 * ��¥ : 2020/01/06
 * �̸� : ������
 * ���� : DI Setter ���� �ǽ��ϱ�
 */

public class DiSetterTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		TV tv1 = (LgTV) ctx.getBean("tv1");
		TV tv2 = (SamsungTV) ctx.getBean("tv2");
		
		tv1.power();
		tv1.chUp();
		tv1.soundUp();
		
		tv2.power();
		tv2.chUp();
		tv2.soundUp();
		
		
	}
}
