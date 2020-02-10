package kr.co.jcinema.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.jcinema.admin.vo.AdminTicketVo;
import kr.co.jcinema.vo.MovieScheduleWithTheaterVo;
import kr.co.jcinema.vo.PaymentVo;
import kr.co.jcinema.vo.SeatVo;

@Repository
public class TicketingDao {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	
	public void selectMovie() {
		
	}
	
	public List<SeatVo> selectSeat(AdminTicketVo vo) {				 
		return mybatis.selectList("mapper.sql_seat.SELECT_SEAT", vo);
	}
	
	public MovieScheduleWithTheaterVo selectMovieScheduleWithTheater(AdminTicketVo vo) {
		return mybatis.selectOne("mapper.sql_movie.SELECT_MOVIE_SCHEDULE_WITH_THEATER", vo);
	}
	
	public String selectTicketNo(MovieScheduleWithTheaterVo vo) {
		return mybatis.selectOne("mapper.sql_ticket.SELECT_TICKET_NO", vo);
	}
	
	public void insertPayment(PaymentVo payVo) {
		mybatis.insert("mapper.sql_ticket.INSERT_PAYMENT", payVo);
	}
	

}
