package kr.co.ch05.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturnAdvice {

	@Pointcut ("execution(void kr.co.ch05.sub2.*Service.insert())")
	public void insertPointcut() {}
	
	@AfterReturning("insertPointcut()")
	public void afterReturn1() {
		System.out.println("È¾´Ü°ü½É - afterReturn1...");
	}
	
	public void afterReturn2() {
		System.out.println("È¾´Ü°ü½É - afterReturn2...");
	}
	
	public void afterReturn3() {
		System.out.println("È¾´Ü°ü½É - afterReturn3...");
	}
	
}
