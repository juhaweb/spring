package kr.co.ch02.sub2;

import kr.co.ch02.sub2.Speaker;

public class SamsungTV implements TV{

	private Speaker spk;
	
	public void SamsungTV(Speaker spk) {
		this.spk = spk;
	}
	
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
