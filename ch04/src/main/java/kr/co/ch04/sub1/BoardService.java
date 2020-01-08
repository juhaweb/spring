package kr.co.ch04.sub1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("bs1")
public class BoardService {
	
	@Autowired
	private LogAdvice log;
	
	
	public void insert() {
		log.beforeLog();
		
		System.out.println("�ٽɰ��� - insert...");
		
		log.afterLog();
	}
	
	
	
	public void select() {
		System.out.println("�ٽɰ��� - select...");
	}
	
	public void update(int seq) {
		System.out.println("�ٽɰ��� - update...");
	}
	
	public void delete(int seq, String uid) {
		System.out.println("�ٽɰ��� - delete...");
	}	
	
}
