package kr.co.ch04.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("bs2")
public class BoardService {
	
	
	public void insert() {
		System.out.println("�ٽɰ��� - insert...");
		return;
	}
	
	public void select() {
		System.out.println("�ٽɰ��� - select...");
	}
	
	public void update(int seq) {
		System.out.println("�ٽɰ��� - update...");
	}
	
	public void delete(int seq, String uid) {
		System.out.println("�ٽɰ��� - delete...");
		char c = uid.charAt(0);
	}	
	
}
