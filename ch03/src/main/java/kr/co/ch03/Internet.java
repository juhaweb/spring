package kr.co.ch03;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//""�̸��� �ǹ̾��� 
@Component("itn")
// @service

public class Internet {

	public void access() {
		System.out.println("���ͳݿ���....");
	}
	
}
