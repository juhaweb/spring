package kr.co.jcinema.api.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.admin.vo.AdminMovieScheduleVo;
import kr.co.jcinema.admin.vo.AdminMovieVo;
import kr.co.jcinema.api.vo.ApiTheaterVo;

@Repository
public class ApiDao {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public void insertTheater() {}
	
	public ApiTheaterVo selectTheater() {
		return null;
	}
	
	public Map<String, List<ApiTheaterVo>> selectTheaters() {
		
		Map<String, List<ApiTheaterVo>> map = new HashMap<String, List<ApiTheaterVo>>();
		map.put("강원", selectTheaters("강원"));
		map.put("경기/인천", selectTheaters("경기/인천"));
		map.put("경남/부산/울산", selectTheaters("경남/부산/울산"));
		map.put("경북/대구", selectTheaters("경북/대구"));
		map.put("서울", selectTheaters("서울"));
		map.put("전라/광주", selectTheaters("전라/광주"));
		map.put("충청/대전", selectTheaters("충청/대전"));
		
		return map;
	}
	
	public List<ApiTheaterVo> selectTheaters(String city) {
		return mybatis.selectList("mapper.sql_theater.SELECT_THEATERS", city);
	}
	
	public void updateTheater() {}
	public void deleteTheater() {}
	
	
	public List<AdminMovieVo> selectMovies(AdminMovieScheduleVo vo) {
		return mybatis.selectList("mapper.sql_movie.SELECT_MOVIES_BY_THEATER", vo);
	}
	
	public List<AdminMovieVo> selectMovies(String title) {
		return mybatis.selectList("mapper.sql_movie.SELECT_MOVIES", title);
	}
	
	public AdminMovieScheduleVo selectMovieSchedule(AdminMovieScheduleVo vo) { 
		return mybatis.selectOne("mapper.sql_movie.SELECT_MOVIE_SCHEDULE", vo);
	}
	
	public List<AdminMovieScheduleVo> selectMovieRoundView(AdminMovieScheduleVo vo) { 
		return mybatis.selectList("mapper.sql_movie.SELECT_MOVIE_ROUND_VIEW", vo);
	}
	
}




