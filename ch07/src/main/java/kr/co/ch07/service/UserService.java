package kr.co.ch07.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch07.dao.UserDAO;
import kr.co.ch07.vo.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;
	
	public void insertUser(UserVO vo) {
		dao.insertUser(vo);
	}
	
	public void selectUsers() {}
	
	

	
	
	
}
