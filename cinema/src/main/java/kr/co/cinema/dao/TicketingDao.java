package kr.co.cinema.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.cinema.admin.vo.AdminTicketVo;
import kr.co.cinema.vo.MovieScheduleWithTheaterVo;
import kr.co.cinema.vo.SeatVo;

@Repository
public class TicketingDao {

	// dao는 db에서 엑세스만 요청 
	@Inject
	private SqlSessionTemplate mybatis; 
	
	
	public void selectMovie() {
		
	}
	
	public List<SeatVo> selectSeat(AdminTicketVo tvo ) {
		return mybatis.selectList("mapper.sql_seat.SELECT_SEAT");
	}
	
	public MovieScheduleWithTheaterVo selectMovieScheduleWithTheater(AdminTicketVo vo){
		return mybatis.selectOne("mapper.sql_movie.SELECT_MOVIE_SCHEDULE_WITH_THEATER", vo);
	}
	
	
}
