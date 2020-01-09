package kr.co.ch05.sub1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;

@Aspect
@Repository
public class LogAdvice {

	@Pointcut("execution(* kr.co.ch05.sub1.BoardService.insert*(..))")
	public void insertPointcut() {}	// 내용이 없는 참조 메서드. 이 이름을 사용하기 위해 선언. 
	
	@Pointcut("execution(* kr.co.ch05.sub1.BoardService.select*(..))")
	public void selectPointcut() {}	 // 내용이 없는 참조 메서드. 이 이름을 사용하기 위해 선언. 
		
	
	@Before("insertPointcut()")
	public void beforeAdvice() {
		System.out.println("횡단관심 beForeAdvice...");
	}
	@After("selectPointcut()")
	public void afterAdvice() {
		System.out.println("횡단관심 afterAdvice...");
	}
	
	
	
	
	
}
