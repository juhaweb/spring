package kr.co.jcinema.admin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.admin.vo.AdminTheaterVo;

@Repository
public class AdminTheaterDao {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertTheater() {}
	
	public AdminTheaterVo selectTheater() {
		return null;
	}
	
	public List<AdminTheaterVo> selectTheaters() {
		mybatis.selectList("");
		return null;
	}
	
	public void updateTheater() {}
	
	public void deleteTheater() {}
	
		
	
}
