package kr.co.ch02.sub3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.ch02.sub3.Speaker;

@Component("tv5")
public class LgTV implements TV{
	
	@Autowired
	private Speaker spk;
	
	@Override
	public void power() {
		System.out.println("LgTV power...");
	}

	@Override
	public void chUp() {
		System.out.println("LgTV chUp...");
	}
	
	@Override
	public void soundUp() {
		spk.soundUp();
	}
	
	
}
