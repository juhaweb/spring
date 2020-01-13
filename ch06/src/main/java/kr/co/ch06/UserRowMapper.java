package kr.co.ch06;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

			// UserRowMapper 뭔진 몰라도 UserVO를 리턴한데여 
public class UserRowMapper implements RowMapper<UserVO>{

	@Override
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		UserVO vo = new UserVO();
		vo.setUid(rs.getString(1));
		vo.setName(rs.getString(2));
		vo.setHp(rs.getString(3));
		vo.setAge(rs.getInt(4));
		
		return vo;
	}
	
	

	
	
}
