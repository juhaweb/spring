package kr.co.cinema.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cinema.dao.MemberDao;
import kr.co.cinema.vo.MemberVo;

@Service
public class MemberService {

	@Autowired
	private MemberDao dao;
	
	
	public void insertMember(MemberVo mvo) {
		dao.insertMember(mvo);
	}
	
	public MemberVo selectMember(MemberVo mvo) {
		return dao.selectMember(mvo);
	}
	
	public void updateMember() {}
	
	public void deleteMember(String uid) {
		dao.deleteMember(uid);
	}
	
}
