package kr.co.cinema.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.cinema.admin.service.AdminTicketService;
import kr.co.cinema.admin.vo.AdminGenerateVo;
import kr.co.cinema.admin.vo.AdminTicketVo;

@Controller
public class AdminTicketController {

	@Autowired
	private AdminTicketService service;
	
	
	@GetMapping("/admin/ticket/generate")
	public String generate() {
		return "/admin/ticket/generate";
	}
	
	
	@PostMapping("/admin/ticket/generate")
	public String generate(AdminGenerateVo vo) {
		
		List<AdminTicketVo> tickets = service.createTicket(vo);
		
		
		service.insertTickets(tickets);
		
		
		return "/admin/ticket/generate";
	}
}
