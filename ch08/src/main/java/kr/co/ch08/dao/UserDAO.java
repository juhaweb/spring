package kr.co.ch08.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch08.vo.UserVO;

@Repository
public class UserDAO {
	
	@Inject
	private JdbcTemplate jdbc;
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	
	public void insertUser(UserVO vo) {
		mybatis.insert("mapper.sql.INSERT_USER", vo);
	}
	
	public List<UserVO> selectUsers() {
		return mybatis.selectList("mapper.sql.SELECT_USERS");
	}
	
	public UserVO selectUser(String uid) {
		return mybatis.selectOne("mapper.sql.SELECT_USER",uid);
	}
	
	public void updateUser(UserVO vo) {
		mybatis.update("mapper.sql.UPDATE_USER",vo);
	}
	
	public void deleteUser(String uid) {
		mybatis.delete("mapper.sql.DELETE_USER",uid);
	}
	
}
