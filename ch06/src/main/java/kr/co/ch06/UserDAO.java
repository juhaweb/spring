package kr.co.ch06;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	@Inject //@Autowired
	private JdbcTemplate jdbc;
	
	public void insertUser() {
		String sql = "INSERT INTO `USER3` VALUES (?,?,?,?);"; 
		//오토박싱 : 각 타입별로 자동저장 
		Object[] values = {"S101","김춘추","010-1242-2327",20};
		jdbc.update(sql,values);
	}
	
	
//	public List<UserVO> selectUser(String uid) {
//		String sql = "SELECT *FROM `USER3` WHERE `uid`=?";
//		Object[] values = {uid};
//		List<UserVO> list = jdbc.query(sql,values,new UserRowMapper());
//		return list;
//	}
	
	public UserVO selectUser(String uid) {
		String sql	= "SELECT *FROM `USER3` WHERE `uid`=?";
		UserVO user = jdbc.queryForObject(sql,new UserRowMapper(), uid);
		return user;
	} 	// 사실 이것도 잘 안하고 스프링 프레임워크 ORM 마이바티스(MY BATIS)로 함
		
	
	public List<UserVO> selectUsers() {
		String sql = "SELECT * FROM `USER3`;";
		List<UserVO> users = jdbc.query(sql, new UserRowMapper());
		return users;
	}
	
		
	public void updateUser() {
		Object[] values = {"하정욱","S102"};
		jdbc.update("UPDATE `USER3` SET `name`=? WHERE `uid`=?",values);
	}
		
	
	public void deleteUser() {
		jdbc.update("DELETE FROM `USER3` WHERE `uid`=?","s103");
	}
	
	
	
}
