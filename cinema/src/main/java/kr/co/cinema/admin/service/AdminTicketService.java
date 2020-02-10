package kr.co.cinema.admin.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.cinema.admin.dao.AdminTicketDao;
import kr.co.cinema.admin.vo.AdminGenerateVo;
import kr.co.cinema.admin.vo.AdminTicketVo;

@Service
public class AdminTicketService {

	@Inject
	private AdminTicketDao dao;
	
	
	public void insertTicket(AdminTicketVo vo) {
		dao.insertTicket(vo);
	}
	
	public void insertTickets(List<AdminTicketVo> tickets) {
		
		for(AdminTicketVo ticket : tickets) {
			dao.insertTicket(ticket);	
		}		
	}
	
	
	public AdminTicketVo selectTicket() {
		return dao.selectTicket();
	}
	
	public List<AdminTicketVo> selectTickets() {
		return dao.selectTickets();
	}
	
	public void updateTicket() {
		dao.updateTicket();
	}
	public void deleteTicket() {
		dao.deleteTicket();
	}	
	
	
	public List<AdminTicketVo> createTicket(AdminGenerateVo vo) {
		
		char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
	
		
		String ticketNo = vo.getTheater_no() + 
						  vo.getScreen_no() + 
						  vo.getMovie_no() + 
						  vo.getMovie_date().substring(2).replace("-", "") +
						  vo.getRound_view();
		
		
		List<AdminTicketVo> tickets = new ArrayList<AdminTicketVo>();
		
		for(int row=1 ; row<=alphabet.length ; row++) {			
			for(int col=1 ; col<=10 ; col++) {		
				
				AdminTicketVo ticket = new AdminTicketVo();
				
				ticket.setTicket_no(ticketNo+row+col);
				ticket.setTicket_movie_no(vo.getMovie_no());
				ticket.setTicket_movie_date(vo.getMovie_date());
				ticket.setTicket_round_view(vo.getRound_view());
				ticket.setTicket_theater_no(vo.getTheater_no());
				ticket.setTicket_screen_no(vo.getScreen_no());
				ticket.setTicket_seat(alphabet[row-1]+""+col);
				ticket.setTicket_price(vo.getPrice());
		
				tickets.add(ticket);
			}			
		}
		
		return tickets;		
	}
	
	
}
