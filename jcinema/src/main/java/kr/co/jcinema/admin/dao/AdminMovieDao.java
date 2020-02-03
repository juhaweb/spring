package kr.co.jcinema.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.admin.vo.AdminMovieScheduleVo;
import kr.co.jcinema.admin.vo.AdminMovieVo;

@Repository
public class AdminMovieDao {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public void insertMovie(AdminMovieVo vo) {
		
		mybatis.insert("mapper.sql_movie.INSERT_MOVIE", vo);
		
	}
	
	
	public void selectMovie() {}
	public void selectMovies() {}
	public void updateMovie() {}
	public void deleteMovie() {}

	public void insertMovieSchedule(AdminMovieScheduleVo vo) {
		
		mybatis.insert("mapper.sql_movie.INSERT_MOVIE_SCHEDULE", vo);
		
	}
	
	
}
