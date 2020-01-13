package kr.co.ch06;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	private JdbcTemplate jdbc;
	
	public List<MemberVO> selectMembers() {
		String sql = "SELECT * FROM `BOARD_MEMBER`";
		List<MemberVO> member = jdbc.query(sql, new MemberRowMapper());
		return member;
	}	
		
	public List<Map<String, Object>> SelectMembersMap() {
		String sql = "SELECT * FROM `BOARD_MEMBER`";
		List<Map<String, Object>> members = jdbc.queryForList(sql);
		return members;
	}
	
		
	
}
