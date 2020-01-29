package kr.co.jcinema.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.vo.MemberVo;

@Repository
public class MemberDao {

	// ���̹�Ƽ�� 
		@Inject
		private SqlSessionTemplate mybatis;
		
		// ��� ���
		public void insertMember(MemberVo mvo) {
			mybatis.insert("mapper.sql_member.INSERT_MEMBER", mvo);
		}

		// ��� 1����
		public MemberVo selectMember(MemberVo mvo) {
			return mybatis.selectOne("mapper.sql_member.SELECT_MEMBER",mvo);
		}
		
		// ��� ����
		public void updateMember() {}
		
		// ��� ����
		public void deleteMember(String uid) {
			mybatis.delete("mapper.sql_member.DELETE_MEMBER",uid);
		}
	
}
