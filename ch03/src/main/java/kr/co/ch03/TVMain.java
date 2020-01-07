package kr.co.ch03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * ��¥ : 2020/01/07
 * �̸� : ������
 * ���� : ������̼� ��� DI �ǽ��ϱ� .
 * 
 * ������̼� ����
 * @Component
 * 	- ������ �����̳ʰ� �ش� ������̼��� ���� Ŭ������ ���� ���� 
 * 	- @Controller, @Service, @Repository�� ����ȭ �ȴ�.  
 * 
 * @Autowired
 *  - ��������(��ü)�� ��ü�� �����ϴ� ������̼�
 *  - ������ ���� ������̼�
 *  
 *  @Inject
 *  - ��������(��ü)�� ��ü�� �����ϴ� ������̼�
 *  - �ڹ� ���� ������̼�
 * 
 * ������̾�� ����Ʈ �ƹ��ų� �ᵵ ��. 
 * 
 */

public class TVMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		TV stv = (SamsungTV) ctx.getBean("stv");
		stv.power();
		stv.chUp();
		stv.soundUp();
		
		TV ltv = (LgTV) ctx.getBean("lgTV");
		ltv.power();
		ltv.chUp();
		ltv.soundUp();
		
		TV atv = (AppleTV) ctx.getBean("appleTV");
		stv.power();
		stv.chUp();
		stv.soundUp();
		
		
	}
}
