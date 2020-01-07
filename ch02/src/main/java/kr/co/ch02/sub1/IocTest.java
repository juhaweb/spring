package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2020/01/06
 * 이름 : 하정욱
 * 내용 : Ioc 실습하기
 */

public class IocTest {

	public static void main(String[] args) {
		
		// Ioc 적용 X 객체생성
		TV ltv = new LgTV();
		
		ltv.power();
		ltv.chUp();
		ltv.soundUp();
		
		TV stv = new SamsungTV();
		stv.power();
		stv.chUp();
		stv.soundUp();
		
		
		// Spring Ioc 적용  (Ioc컨테이너 -> 스프링 컨테이너라고 많이 함)
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
