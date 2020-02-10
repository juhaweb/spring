package kr.co.cinema.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.cinema.admin.vo.AdminMovieScheduleVo;
import kr.co.cinema.admin.vo.AdminMovieVo;

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



