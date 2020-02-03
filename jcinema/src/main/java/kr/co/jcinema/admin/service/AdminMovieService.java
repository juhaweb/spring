package kr.co.jcinema.admin.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.jcinema.admin.dao.AdminMovieDao;
import kr.co.jcinema.admin.vo.AdminMovieScheduleVo;
import kr.co.jcinema.admin.vo.AdminMovieVo;

@Service
public class AdminMovieService {

	@Inject
	private AdminMovieDao dao;
	
	
	public void insertMovie(AdminMovieVo vo) {		
		dao.insertMovie(vo);		
	}
	
	
	public void selectMovie() {}
	public void selectMovies() {}
	public void updateMovie() {}
	public void deleteMovie() {}
	
	public void insertMovieSchedule(AdminMovieScheduleVo vo) {
		dao.insertMovieSchedule(vo);
	}
	
	
}
