package kr.co.jcinema.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.admin.vo.AdminTicketVo;
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
	
	
}
