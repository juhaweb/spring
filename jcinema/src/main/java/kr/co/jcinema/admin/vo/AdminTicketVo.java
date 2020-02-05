package kr.co.jcinema.admin.vo;

public class AdminTicketVo {
	
	private String ticket_no;
	private int ticket_movie_no;
	private String ticket_movie_date;
	private String ticket_round_view;
	private int ticket_theater_no;
	private int ticket_screen_no;
	private String ticket_seat;
	private int ticket_is_valid;
	private int ticket_price;
	
	// 추가필드
	private int seat_theater_no;
	private int seat_screen_no;
	
	
	
	public int getSeat_theater_no() {
		return seat_theater_no;
	}
	public void setSeat_theater_no(int seat_theater_no) {
		this.seat_theater_no = seat_theater_no;
	}
	public int getSeat_screen_no() {
		return seat_screen_no;
	}
	public void setSeat_screen_no(int seat_screen_no) {
		this.seat_screen_no = seat_screen_no;
	}
	public String getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(String ticket_no) {
		this.ticket_no = ticket_no;
	}
	public int getTicket_movie_no() {
		return ticket_movie_no;
	}
	public void setTicket_movie_no(int ticket_movie_no) {
		this.ticket_movie_no = ticket_movie_no;
	}
	public String getTicket_movie_date() {
		return ticket_movie_date;
	}
	public void setTicket_movie_date(String ticket_movie_date) {
		this.ticket_movie_date = ticket_movie_date;
	}
	public String getTicket_round_view() {
		return ticket_round_view;
	}
	public void setTicket_round_view(String ticket_round_view) {
		this.ticket_round_view = ticket_round_view;
	}
	public int getTicket_theater_no() {
		return ticket_theater_no;
	}
	public void setTicket_theater_no(int ticket_theater_no) {
		this.ticket_theater_no = ticket_theater_no;
	}
	public int getTicket_screen_no() {
		return ticket_screen_no;
	}
	public void setTicket_screen_no(int ticket_screen_no) {
		this.ticket_screen_no = ticket_screen_no;
	}
	public String getTicket_seat() {
		return ticket_seat;
	}
	public void setTicket_seat(String ticket_seat) {
		this.ticket_seat = ticket_seat;
	}
	public int getTicket_is_valid() {
		return ticket_is_valid;
	}
	public void setTicket_is_valid(int ticket_is_valid) {
		this.ticket_is_valid = ticket_is_valid;
	}
	public int getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(int ticket_price) {
		this.ticket_price = ticket_price;
	}

	
}
