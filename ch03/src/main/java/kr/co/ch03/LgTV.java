package kr.co.ch03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import kr.co.ch03.Speaker;

@Service
public class LgTV implements TV{
	
	@Autowired
	private Speaker spk;
	
	@Resource //@Autowired //¶Ç´Â @Inject
	private Internet internet;
	
	
	@Override
	public void power() {
		System.out.println("LgTV power...");
		internet.access();
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
