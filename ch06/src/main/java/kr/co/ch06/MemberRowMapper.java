package kr.co.ch06;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<MemberVO>{

	@Override
	public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		MemberVO mvo = new MemberVO();
		
		mvo.setUid(rs.getString(1));
		mvo.setPass(rs.getString(2));
		mvo.setName(rs.getString(3));
		mvo.setNick(rs.getString(4));
		mvo.setEmail(rs.getString(5));
		mvo.setHp(rs.getString(6));
		mvo.setGrade(rs.getInt(7));
		mvo.setZip(rs.getString(8));
		mvo.setAddr1(rs.getString(9));
		mvo.setAddr2(rs.getString(10));
		mvo.setRegip(rs.getString(11));
		mvo.setRdate(rs.getString(12));
				
		return mvo;
	}

	
	
}
