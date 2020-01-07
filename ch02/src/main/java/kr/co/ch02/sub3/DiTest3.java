package kr.co.ch02.sub3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.ch02.sub3.LgTV;
import kr.co.ch02.sub3.SamsungTV;
import kr.co.ch02.sub3.TV;

/*
 * 날짜 : 2020/01/07
 * 이름 : 하정욱
 * 내용 : 어노테이션 DI 실습하기  //이걸로 작업함.. 
 */

public class DiTest3 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		TV tv5 = (LgTV) ctx.getBean("tv5");
		tv5.power();
		tv5.chUp();
		tv5.soundUp();
		
		TV tv6 = (SamsungTV) ctx.getBean("tv6");
		tv6.power();
		tv6.chUp();
		tv6.soundUp();
		
		
		
	}
	
	
}
