package kr.co.ch08.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch08.dao.MemberDAO;
import kr.co.ch08.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	
	public void insertMember(MemberVO mvo) {
		dao.insertMember(mvo);
	}
	
	public List<MemberVO> selectMembers() {
		return dao.selectMembers();
	}
	
	public MemberVO selectMember(String uid) {
		return dao.selectMember(uid);
	}
	
	public void updateMember(MemberVO mvo) {
		dao.updateMember(mvo);
	}
	
	public void deleteMember(String uid) {
		dao.deleteMember(uid);		
	}
	
	
}
