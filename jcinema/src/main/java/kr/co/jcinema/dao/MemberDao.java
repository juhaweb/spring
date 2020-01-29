package kr.co.jcinema.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.vo.MemberVo;

@Repository
public class MemberDao {

	// 마이바티스 
		@Inject
		private SqlSessionTemplate mybatis;
		
		// 멤버 등록
		public void insertMember(MemberVo mvo) {
			mybatis.insert("mapper.sql_member.INSERT_MEMBER", mvo);
		}

		// 멤버 1선택
		public MemberVo selectMember(MemberVo mvo) {
			return mybatis.selectOne("mapper.sql_member.SELECT_MEMBER",mvo);
		}
		
		// 멤버 수정
		public void updateMember() {}
		
		// 멤버 삭제
		public void deleteMember(String uid) {
			mybatis.delete("mapper.sql_member.DELETE_MEMBER",uid);
		}
	
}
