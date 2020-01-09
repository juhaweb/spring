package kr.co.ch05.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdvice {

	@Pointcut ("execution(void kr.co.ch05.sub2.*Service.insert())")
	public void insertPointcut() {}	
	
	
	@Around("insertPointcut()")
	public void around1(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("È¾´Ü°ü½É - around1-1...");
		pjp.proceed(); // ÇÙ½É°ü½É(Æ÷ÀÎÆ®ÄÆ) ½ÇÇà
		System.out.println("È¾´Ü°ü½É - around1-2...");
		
	}
	
	public void around2(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("È¾´Ü°ü½É - around2-1...");
		pjp.proceed(); // ÇÙ½É°ü½É(Æ÷ÀÎÆ®ÄÆ) ½ÇÇà
		System.out.println("È¾´Ü°ü½É - around2-2...");
		
	}
	
	public void around3(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("È¾´Ü°ü½É - around3-1...");
		pjp.proceed(); // ÇÙ½É°ü½É(Æ÷ÀÎÆ®ÄÆ) ½ÇÇà
		System.out.println("È¾´Ü°ü½É - around3-2...");
		
	}	
}
