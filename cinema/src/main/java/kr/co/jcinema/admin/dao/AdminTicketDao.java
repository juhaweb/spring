package kr.co.jcinema.admin.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.jcinema.admin.vo.AdminTicketVo;

@Repository
public class AdminTicketDao {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public void insertTicket(AdminTicketVo vo) {
		mybatis.insert("mapper.sql_ticket.INSERT_TICKET", vo);
	}
	
	public AdminTicketVo selectTicket() {
		return null;
	}
	
	public List<AdminTicketVo> selectTickets() {
		return null;
	}
	
	public void updateTicket() {}
	public void deleteTicket() {}
	
}
