package kr.co.jcinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketingController {
	
	@GetMapping ("/ticketing/choice-movie")
	public String choiceMovie() {
		return "ticketing/choice-movie";
	}
	
	@GetMapping ("/ticketing/choice-seat")
	public String choiceSeat() {
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
