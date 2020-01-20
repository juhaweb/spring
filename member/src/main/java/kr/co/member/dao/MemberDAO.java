package kr.co.member.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.member.vo.MemberVO;

@Repository
public class MemberDAO {

	// 마이바티스 
	@Inject
	private SqlSessionTemplate mybatis;
	
	// 멤버 등록
	public void insertMember(MemberVO mvo) {
		mybatis.insert("mapper.sql_member.INSERT_MEMBER", mvo);
	}
	
	// 멤버 리스트
	public List<MemberVO> selectMembers() {
		return mybatis.selectList("mapper.sql_member.SELECT_MEMBERS");
	}
	
	// 멤버 1선택
	public MemberVO selectMember(String uid) {
		return mybatis.selectOne("mapper.sql_member.SELECT_MEMBER",uid);
	}
	
	// 멤버 수정
	public void updateMember(MemberVO mvo) {
		mybatis.update("mapper.sql_member.UPDATE_MEMBER", mvo);
	}
	
	// 멤버 삭제
	public void deleteMember(String uid) {
		mybatis.delete("mapper.sql_member.DELETE_MEMBER",uid);
	}
	
	
}
