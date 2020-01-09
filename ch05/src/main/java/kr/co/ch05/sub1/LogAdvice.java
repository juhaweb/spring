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
	public void insertPointcut() {}	// ������ ���� ���� �޼���. �� �̸��� ����ϱ� ���� ����. 
	
	@Pointcut("execution(* kr.co.ch05.sub1.BoardService.select*(..))")
	public void selectPointcut() {}	 // ������ ���� ���� �޼���. �� �̸��� ����ϱ� ���� ����. 
		
	
	@Before("insertPointcut()")
	public void beforeAdvice() {
		System.out.println("Ⱦ�ܰ��� beForeAdvice...");
	}
	@After("selectPointcut()")
	public void afterAdvice() {
		System.out.println("Ⱦ�ܰ��� afterAdvice...");
	}
	
	
	
	
	
}
