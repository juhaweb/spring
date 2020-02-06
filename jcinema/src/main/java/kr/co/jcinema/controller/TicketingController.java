package kr.co.jcinema.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.jcinema.admin.vo.AdminTicketVo;
import kr.co.jcinema.service.TicketingService;
import kr.co.jcinema.vo.MemberVo;
import kr.co.jcinema.vo.MovieScheduleWithTheaterVo;
import kr.co.jcinema.vo.PaymentVo;
import kr.co.jcinema.vo.SeatVo;

@Controller
public class TicketingController {
	
	@Inject
	private TicketingService service;
	
	
	@GetMapping ("/ticketing/choice-movie")
	public String choiceMovie() {
		
		return "ticketing/choice-movie";
	}
	
	
	// 좌석선택, 좌석선택시 티켓정보 표시
	@GetMapping ("/ticketing/choice-seat")
	public String choiceSeat(AdminTicketVo tvo, Model model, HttpSession session) {
		
		MovieScheduleWithTheaterVo movieInfo = service.selectMovieScheduleWithTheater(tvo);
		List<List<SeatVo>> totalSeatList = service.selectSeat(tvo);
		
		model.addAttribute("totalSeatList", totalSeatList);
		model.addAttribute("movieInfo", movieInfo);
		
		// 세션에 movieInfo를 저장하자 ★ 중요테크닉: 컴포넌트간의 데이터 공유에도 사용
		session.setAttribute("movieInfo", movieInfo);
		
		return "/ticketing/choice-seat";
	}
	

	// 세션을가지고 선택된 좌석 정보 땡겨오기 (choice-seat -> order-confirm)
	@GetMapping ("/ticketing/order-confirm")  //String seat만 파라미터로 받음
	public String orderConfirm(String seat, HttpSession session) {
		
		// 세션에 seat 정보 저장. 
		session.setAttribute("seat",seat);		
		
		return "/ticketing/order-confirm";
	}
	
	
	
	
	// 좌석정보 선택후 결제전송 
	@GetMapping ("/ticketing/order-result")
	public String orderResult(HttpSession session, PaymentVo pvo) {
		
		// dao adminTicketDao. 
		MovieScheduleWithTheaterVo vo = (MovieScheduleWithTheaterVo) session.getAttribute("movieInfo");
		String seat = (String) session.getAttribute("seat");
		MemberVo member = (MemberVo) session.getAttribute("member");
		
		vo.setSchedule_seat(seat);
		String ticketNo = service.selectTicketNo(vo);
				
		// pvo.setPay_user_id(member.getUser_id());
		pvo.setPay_user_id("admin");
		pvo.setPay_ticket_no(ticketNo);
		pvo.setPay_ticket_amount(1);
		
		service.insertPayment(pvo);
		
		return "/ticketing/order-result";
	}
	
	
	public void getTheater() {
		
		
		
		
	}
	
	
}
