package kr.co.ch04.sub1;

import org.springframework.stereotype.Component;

@Component
public class LogAdvice {
	
	// 횡단관심 로직을 갖는 클래스
	public void beforeLog() {
		System.out.println("=====================");
		System.out.println("횡단관심 - beforeLog...");
	}
	
	
	public void afterLog() {
		System.out.println("횡단관심 - afterLog...");
		System.out.println("--------------------");
	}
	
	
}
