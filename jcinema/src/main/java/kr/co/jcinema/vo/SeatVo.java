package kr.co.jcinema.vo;

public class SeatVo {

	private int seat_theater_no;
	private int seat_screen_no;
	private String seat_row;
	private int seat_column;
	
	// 추가필드	
	private int ticket_is_valid;

	public int getTicket_is_valid() {
		return ticket_is_valid;
	}

	public void setTicket_is_valid(int ticket_is_valid) {
		this.ticket_is_valid = ticket_is_valid;
	}
	
	
	
	
	
	
	
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

	public String getSeat_row() {
		return seat_row;
	}

	public void setSeat_row(String seat_row) {
		this.seat_row = seat_row;
	}

	public int getSeat_column() {
		return seat_column;
	}

	public void setSeat_column(int seat_column) {
		this.seat_column = seat_column;
	}

	
	
	
	
	
	
	
}
