package kr.co.jcinema.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.jcinema.admin.vo.AdminTicketVo;
import kr.co.jcinema.service.TicketingService;
import kr.co.jcinema.vo.SeatVo;

@Controller
public class TicketingController {
	
	@Inject
	private TicketingService service;
	
	
	
	@GetMapping ("/ticketing/choice-movie")
	public String choiceMovie() {
		return "ticketing/choice-movie";
	}
	
	// ÁÂ¼®¼±ÅÃ
	@GetMapping ("/ticketing/choice-seat")
	public String choiceSeat(AdminTicketVo tvo, Model model) {
		
		List<List<SeatVo>> totalSeatList = service.selectSeat(tvo);
		model.addAttribute("totalSeatList", totalSeatList);
		
		return "/ticketing/choice-seat";
	}
	
	
	
	
	
	@GetMapping ("/ticketing/order-confirm")
	public String orderConfirm() {
		return "/ticketing/order-confirm";
	}
	
	
	@GetMapping ("/ticketing/order-result")
	public String orderResult() {
		return "/ticketing/order-result";
	}
	
	
	public void getTheater() {
		
		
		
		
	}
	
	
}
