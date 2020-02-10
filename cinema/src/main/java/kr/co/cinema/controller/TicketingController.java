package kr.co.cinema.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.cinema.admin.vo.AdminTicketVo;
import kr.co.cinema.service.TicketingService;
import kr.co.cinema.vo.MovieScheduleWithTheaterVo;
import kr.co.cinema.vo.SeatVo;

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
	public String orderConfirm(String seat, Model model) {
		
		model.addAttribute("seat",seat);
		
		return "/ticketing/order-confirm";
	}
	
	
	
	
	
	@GetMapping ("/ticketing/order-result")
	public String orderResult() {
		return "/ticketing/order-result";
	}
	
	
	public void getTheater() {
		
		
		
		
	}
	
	
}
