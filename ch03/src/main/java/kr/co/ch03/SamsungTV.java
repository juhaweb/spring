package kr.co.ch03;

import org.springframework.stereotype.Component;

import kr.co.ch03.Speaker;

@Component("stv")
public class SamsungTV implements TV{

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
