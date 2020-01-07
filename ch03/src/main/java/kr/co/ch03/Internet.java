package kr.co.ch03;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//""이름엔 의미없다 
@Component("itn")
// @service

public class Internet {

	public void access() {
		System.out.println("인터넷연결....");
	}
	
}
