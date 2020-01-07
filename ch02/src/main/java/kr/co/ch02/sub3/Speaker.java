package kr.co.ch02.sub3;

import org.springframework.stereotype.Component;

@Component("spk3")
public class Speaker {

	public void soundUp() {
		System.out.println("spk3 soundUp....");
	}
	
	public void soundDown() {
		System.out.println("spk3 soundDown....");
	}
	
	
	
}
