package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2020/01/06
 * �̸� : ������
 * ���� : Ioc �ǽ��ϱ�
 */

public class IocTest {

	public static void main(String[] args) {
		
		// Ioc ���� X ��ü����
		TV ltv = new LgTV();
		
		ltv.power();
		ltv.chUp();
		ltv.soundUp();
		
		TV stv = new SamsungTV();
		stv.power();
		stv.chUp();
		stv.soundUp();
		
		
		// Spring Ioc ����  (Ioc�����̳� -> ������ �����̳ʶ�� ���� ��)
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		TV tv1 = (LgTV) ctx.getBean("ltv");
		TV tv2 = (SamsungTV) ctx.getBean("stv");
		
		tv1.power();
		tv1.chUp();
		tv1.soundUp();
		
		tv2.power();
		tv2.chUp();
		tv2.soundUp();
		
		
	}
	
}
