package kr.co.jcinema.api.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import kr.co.jcinema.api.dao.ApiTheaterDao;
import kr.co.jcinema.api.vo.ApiTheaterVo;

@Service
public class ApiTheaterService {
	
	@Inject
	private ApiTheaterDao dao;
	
	public void insertTheater() {}
	
	public ApiTheaterVo selectTheater() {
		return null;
	}
	
	public Map<String, List<ApiTheaterVo>> selectTheaters() {
		return dao.selectTheaters();
	}
	
	public void updateTheater() {}
	
	public void deleteTheater() {}
	
	
}
