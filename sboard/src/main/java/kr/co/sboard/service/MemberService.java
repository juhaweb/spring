package kr.co.sboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.MemberDAO;
import kr.co.sboard.vo.MemberVO;
import kr.co.sboard.vo.TermsVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	
	// 회원가입
	public void insertMember(MemberVO mvo) {
		dao.insertMember(mvo);
	}
	
	// 중복체크
	public int selectUidCount(String uid) {
		return dao.selectUidCount(uid);
	}
	
	// 로그인
	public MemberVO selectMember(MemberVO mvo) {
		return dao.selectMember(mvo);
		
	}
	
	public void selectMembers() {}
	public void updateMember() {}
	public void deleteMember() {}
	
	public TermsVO selectTerms() {
		return dao.selectTerms();
	}
	
	
	
	
	
	
	
}
