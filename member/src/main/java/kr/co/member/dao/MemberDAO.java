package kr.co.member.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.member.vo.MemberVO;

@Repository
public class MemberDAO {

	// ���̹�Ƽ�� 
	@Inject
	private SqlSessionTemplate mybatis;
	
	// ��� ���
	public void insertMember(MemberVO mvo) {
		mybatis.insert("mapper.sql_member.INSERT_MEMBER", mvo);
	}
	
	// ��� ����Ʈ
	public List<MemberVO> selectMembers() {
		return mybatis.selectList("mapper.sql_member.SELECT_MEMBERS");
	}
	
	// ��� 1����
	public MemberVO selectMember(String uid) {
		return mybatis.selectOne("mapper.sql_member.SELECT_MEMBER",uid);
	}
	
	// ��� ����
	public void updateMember(MemberVO mvo) {
		mybatis.update("mapper.sql_member.UPDATE_MEMBER", mvo);
	}
	
	// ��� ����
	public void deleteMember(String uid) {
		mybatis.delete("mapper.sql_member.DELETE_MEMBER",uid);
	}
	
	
}
