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
	
	
	@GetMapping("/ticketing/choice-movie")
	public String choiceMovie() {
		return "/ticketing/choice-movie";
	}
	
	@GetMapping("/ticketing/choice-seat")
	public String choiceSeat(AdminTicketVo vo, Model model, HttpSession session) {
		
		
		MovieScheduleWithTheaterVo movieInfo = service.selectMovieScheduleWithTheater(vo);
		List<List<SeatVo>> totalSeatList = service.selectSeat(vo);
		
		model.addAttribute("totalSeatList", totalSeatList);
		session.setAttribute("movieInfo", movieInfo);		
		
		return "/ticketing/choice-seat";
	}
	
	@GetMapping("/ticketing/order-confirm")
	public String orderConfirm(String seat, HttpSession session) {
		
		session.setAttribute("seat", seat);
		
		
		return "/ticketing/order-confirm";
	}
	
	@GetMapping("/ticketing/order-result")
	public String orderResult(HttpSession session, PaymentVo payVo) {
		
		MovieScheduleWithTheaterVo vo = (MovieScheduleWithTheaterVo) session.getAttribute("movieInfo");
		String seat = (String) session.getAttribute("seat");
		MemberVo member = (MemberVo) session.getAttribute("member");
		
		vo.setSchedule_seat(seat);
		
		String ticketNo = service.selectTicketNo(vo);
				
		payVo.setPay_user_id("chhak");
		payVo.setPay_ticket_no(ticketNo);
		payVo.setPay_ticket_amount(1);
		
		service.insertPayment(payVo);
		
		
		return "/ticketing/order-result";
	}
	
	
	
	
}
