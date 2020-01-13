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
		//����ڽ� : �� Ÿ�Ժ��� �ڵ����� 
		Object[] values = {"S101","������","010-1242-2327",20};
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
	} 	// ��� �̰͵� �� ���ϰ� ������ �����ӿ�ũ ORM ���̹�Ƽ��(MY BATIS)�� ��
		
	
	public List<UserVO> selectUsers() {
		String sql = "SELECT * FROM `USER3`;";
		List<UserVO> users = jdbc.query(sql, new UserRowMapper());
		return users;
	}
	
		
	public void updateUser() {
		Object[] values = {"������","S102"};
		jdbc.update("UPDATE `USER3` SET `name`=? WHERE `uid`=?",values);
	}
		
	
	public void deleteUser() {
		jdbc.update("DELETE FROM `USER3` WHERE `uid`=?","s103");
	}
	
	
	
}
