package kr.co.ch02.sub3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.ch02.sub3.Speaker;

@Component("tv6")
public class SamsungTV implements TV{
	
	@Autowired
	private Speaker spk;
	
	@Override
	public void power() {
		System.out.println("SamsungTV power...");
	}

	@Override
	public void chUp() {
		System.out.println("SamsungTV chUp...");
	}

	@Override
	public void soundUp() {
		System.out.println("SamsungTV soundUp...");
	}

	
	
}
