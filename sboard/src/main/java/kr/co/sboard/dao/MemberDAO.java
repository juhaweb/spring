package kr.co.sboard.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.MemberVO;
import kr.co.sboard.vo.TermsVO;

@Repository
public class MemberDAO {

	// 마이바티스 
	@Inject
	private SqlSessionTemplate mybatis;
		
	// 회원가입
	public void insertMember(MemberVO mvo) {
		mybatis.insert("mapper.sql_member.INSERT_MEMBER", mvo);
	}
	
	// 중복체크
	public int selectUidCount(String uid) {
		return mybatis.selectOne("mapper.sql_member.SELECT_UID_COUNT", uid);
	}
	
	public MemberVO selectMember(MemberVO mvo) {
		return mybatis.selectOne("mapper.sql_member.SELECT_MEMBER",mvo);
	}
	
	public void selectMembers() {}
	public void updateMember() {}
	public void deleteMember() {}
	
	public TermsVO selectTerms() {
		return mybatis.selectOne("mapper.sql_member.SELECT_TERMS");

	}
	
	
	
	
}
