package kr.co.jcinema.api.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.api.vo.ApiTheaterVo;

@Repository
public class ApiTheaterDao {

	@Inject
	private SqlSessionTemplate mybatis;

		
	public void insertTheater() {}
	
	public ApiTheaterVo selectTheater() {
		return null;
	}
	
	
	
	public Map<String, List<ApiTheaterVo>> selectTheaters() {
		
		Map<String,List<ApiTheaterVo>> map = new HashMap<String, List<ApiTheaterVo>>();

		map.put("����", selectTheaters("����"));
		map.put("���/��õ", selectTheaters("���/��õ"));
		map.put("�泲/�λ�/���", selectTheaters("�泲/�λ�/���"));
		map.put("���/�뱸", selectTheaters("���/�뱸"));
		map.put("����", selectTheaters("����"));
		map.put("����/����", selectTheaters("����/����"));
		map.put("��û/����", selectTheaters("��û/����"));
	
		return map;
	}
	
	public List<ApiTheaterVo> selectTheaters(String city) {
		return mybatis.selectList("mapper.sql_theater.SELECT_THEATERS", city);
	}
	
	
	
	
	public void updateTheater() {}
	
	public void deleteTheater() {}
	
	
	
}
