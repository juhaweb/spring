package kr.co.jcinema.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.jcinema.admin.vo.AdminTicketVo;
import kr.co.jcinema.service.TicketingService;
import kr.co.jcinema.vo.MovieScheduleWithTheaterVo;
import kr.co.jcinema.vo.SeatVo;

@Controller
public class TicketingController {
	
	@Inject
	private TicketingService service;
	
	
	@GetMapping ("/ticketing/choice-movie")
	public String choiceMovie() {
		
		return "ticketing/choice-movie";
	}
	
	
	// �¼�����, �¼����ý� Ƽ������ ǥ��
	@GetMapping ("/ticketing/choice-seat")
	public String choiceSeat(AdminTicketVo tvo, Model model, HttpSession session) {
		
		MovieScheduleWithTheaterVo movieInfo = service.selectMovieScheduleWithTheater(tvo);
		List<List<SeatVo>> totalSeatList = service.selectSeat(tvo);
		
		model.addAttribute("totalSeatList", totalSeatList);
		model.addAttribute("movieInfo", movieInfo);
		// ���ǿ� movieInfo�� �������� �� �߿���ũ��: ������Ʈ���� ������ �������� ���
		session.setAttribute("movieInfo", movieInfo);
		
		return "/ticketing/choice-seat";
	}
	

	// ������������ ���õ� �¼� ���� ���ܿ��� (choice-seat -> order-confirm)
	@GetMapping ("/ticketing/order-confirm")  //String seat�� �Ķ���ͷ� ����
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
