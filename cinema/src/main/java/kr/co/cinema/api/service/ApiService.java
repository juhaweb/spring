package kr.co.cinema.api.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.cinema.admin.vo.AdminMovieScheduleVo;
import kr.co.cinema.admin.vo.AdminMovieVo;
import kr.co.cinema.api.dao.ApiDao;
import kr.co.cinema.api.vo.ApiTheaterVo;

@Service
public class ApiService {

	@Inject
	private ApiDao dao;
	
	public void insertTheater() {}
	public ApiTheaterVo selectTheater() {
		return null;
	}
	
	public Map<String, List<ApiTheaterVo>> selectTheaters() {
		return dao.selectTheaters();
	}
	
	public void updateTheater() {}
	public void deleteTheater() {}
	
	public List<AdminMovieVo> selectMovies(AdminMovieScheduleVo vo) {
		return dao.selectMovies(vo);
	}
	
	public List<AdminMovieVo> selectMovies(String title) {
		return dao.selectMovies(title);
	}
	
	public AdminMovieScheduleVo selectMovieSchedule(AdminMovieScheduleVo vo) { 
		return dao.selectMovieSchedule(vo);
	}
	
	public List<AdminMovieScheduleVo> selectMovieRoundView(AdminMovieScheduleVo vo) { 
		return dao.selectMovieRoundView(vo);
	}
}
