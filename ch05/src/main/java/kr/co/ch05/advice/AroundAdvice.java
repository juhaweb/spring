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
		
		System.out.println("Ⱦ�ܰ��� - around1-1...");
		pjp.proceed(); // �ٽɰ���(����Ʈ��) ����
		System.out.println("Ⱦ�ܰ��� - around1-2...");
		
	}
	
	public void around2(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("Ⱦ�ܰ��� - around2-1...");
		pjp.proceed(); // �ٽɰ���(����Ʈ��) ����
		System.out.println("Ⱦ�ܰ��� - around2-2...");
		
	}
	
	public void around3(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("Ⱦ�ܰ��� - around3-1...");
		pjp.proceed(); // �ٽɰ���(����Ʈ��) ����
		System.out.println("Ⱦ�ܰ��� - around3-2...");
		
	}	
}
