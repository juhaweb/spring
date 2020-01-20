package kr.co.member.service;

/*
 * 이름 : 하정욱
 * 내용 : 멤버 서비스 
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.member.dao.MemberDAO;
import kr.co.member.vo.MemberVO;

@Service
public class MemberService {

	
	@Autowired
	private MemberDAO dao;
	
	
	public void insertMember(MemberVO mvo) {
		dao.insertMember(mvo);
	}
	
	public MemberVO selectMember(String uid) {
		return dao.selectMember(uid);
	}
	
	public List<MemberVO> selectMembers() {
		return dao.selectMembers();
	}
	
	public void updateMember(MemberVO mvo) {
		dao.updateMember(mvo);
	}
	
	public void deleteMember(String uid) {
		dao.deleteMember(uid);
	}
	
	
}
