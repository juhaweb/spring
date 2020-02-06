package kr.co.jcinema.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.admin.vo.AdminTicketVo;
import kr.co.jcinema.vo.MovieScheduleWithTheaterVo;
import kr.co.jcinema.vo.PaymentVo;
import kr.co.jcinema.vo.SeatVo;

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
	
	// 티켓 셀렉트해서 결제로 넘김 
	public String selectTicketNo(MovieScheduleWithTheaterVo vo) {
		return mybatis.selectOne("mapper.sql_ticket.SELECT_TICKET_NO", vo);
	}
	
	// 지불
	public void insertPayment(PaymentVo pvo) {
		mybatis.insert("mapper.sql_ticket.INSERT_PAYMENT", pvo);
	}
	
	
	
}
