package kr.co.jcinema.service;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jcinema.admin.vo.AdminTicketVo;
import kr.co.jcinema.dao.MemberDao;
import kr.co.jcinema.dao.TicketingDao;
import kr.co.jcinema.vo.MovieScheduleWithTheaterVo;
import kr.co.jcinema.vo.PaymentVo;
import kr.co.jcinema.vo.SeatVo;

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
	
	
	// Ƽ�� ����Ʈ�ؼ� ������ �ѱ� 
	public String selectTicketNo(MovieScheduleWithTheaterVo vo) {
		return dao.selectTicketNo(vo);
		
	}
	
	// String seat(A1,A2,A3...)���� ���� �¼���ȣ�� int(11,12,13...)�� ����
	public String convertSeatNo(String seat) {
		
		char rowAlp		= seat.charAt(0);
		String colNum	= seat.substring(1);
		
		int rowNum = 0;
		
		if		(rowAlp == 'A') { rowNum = 1; } 
		else if (rowAlp == 'B') { rowNum = 2; } 
		else if (rowAlp == 'C') { rowNum = 3; } 
		else if (rowAlp == 'D') { rowNum = 4; } 
		else if (rowAlp == 'E') { rowNum = 5; } 
		else if (rowAlp == 'F') { rowNum = 6; } 
		else if (rowAlp == 'G') { rowNum = 7; } 
		else if (rowAlp == 'H') { rowNum = 8; } 
		else if (rowAlp == 'I') { rowNum = 9; } 
		else if (rowAlp == 'J') { rowNum = 10;}
						
		return rowNum + colNum;
		
	}
	
	// ����
	public void insertPayment(PaymentVo pvo) {
		dao.insertPayment(pvo);
	}

	
	
	
}
