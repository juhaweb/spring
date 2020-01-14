package kr.co.ch07.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch07.mapper.UserRowMapper;
import kr.co.ch07.vo.UserVO;

@Repository
public class UserDAO {
	
	@Inject
	private JdbcTemplate jdbc;
	
	public void insertUser(UserVO vo) {
		
		Object[] values = {vo.getUid(), vo.getName(), vo.getHp(), vo.getAge()};
		String sql ="INSERT INTO `USER3` VALUES(?,?,?,?);"; 
		jdbc.update(sql, values);
	}
	
//	public List<UserVO> selectUsers() {
//		List<UserVO> users = jdbc.query("SELECT * FROM `USER3`",new UserRowMapper());
//		return users;		
//	}
	
	public List<UserVO> selectUsers() {
		return jdbc.query("SELECT * FROM `USER3`",new UserRowMapper());		
	}
	
	
	
	
	
	
}
