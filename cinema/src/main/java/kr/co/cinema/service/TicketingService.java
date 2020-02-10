package kr.co.cinema.service;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cinema.admin.vo.AdminTicketVo;
import kr.co.cinema.dao.MemberDao;
import kr.co.cinema.dao.TicketingDao;
import kr.co.cinema.vo.MovieScheduleWithTheaterVo;
import kr.co.cinema.vo.SeatVo;

@Service
public class TicketingService {

	@Autowired
	private TicketingDao dao;
	
	public void selectMovie() {	
	}
	
	
	// �¼� �ڸ��� 
	public List<List<SeatVo>> selectSeat(AdminTicketVo tvo) {
		
		List<List<SeatVo>> totalSeatList = new ArrayList<List<SeatVo>>();
	
		List<SeatVo> seatList = dao.selectSeat(tvo);
		
		// subList ���ξ������� ��������
		totalSeatList.add(seatList.subList(1,10));
		totalSeatList.add(seatList.subList(10,20));
		totalSeatList.add(seatList.subList(20,30));
		totalSeatList.add(seatList.subList(30,40));
		totalSeatList.add(seatList.subList(40,50));
		totalSeatList.add(seatList.subList(50,60));
		totalSeatList.add(seatList.subList(60,70));
		totalSeatList.add(seatList.subList(70,80));
		
		return totalSeatList;
	}
	
	
	// �󿵰��� ��ȭ����
	public MovieScheduleWithTheaterVo selectMovieScheduleWithTheater(AdminTicketVo vo){
		
		return dao.selectMovieScheduleWithTheater(vo);
		
		
	}
	
	
}
