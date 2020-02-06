package kr.co.jcinema;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.jcinema.admin.vo.AdminTicketVo;
import kr.co.jcinema.dao.TicketingDao;
import kr.co.jcinema.vo.SeatVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-context-test.xml"})
public class TicketingDaoTest {

	@Inject
	private TicketingDao dao;
	
	@Test // 이걸 붙여야 테스트가 됨. 
	public void test() {
		
		AdminTicketVo tvo = new AdminTicketVo();
		tvo.setSeat_theater_no("115");
		tvo.setSeat_screen_no("1");
		tvo.setTicket_screen_no("1");
		tvo.setTicket_movie_no("56");
		tvo.setTicket_movie_date("2020-02-07");
		tvo.setTicket_round_view("1");
		
		List<SeatVo> list = dao.selectSeat(tvo);
		System.out.println(list);
	}
	
	
	
	
	public void getTicket() {
		System.out.println("getTicket..실행...");
	}
	
}
