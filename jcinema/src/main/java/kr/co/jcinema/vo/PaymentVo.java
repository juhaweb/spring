package kr.co.jcinema.vo;

public class PaymentVo {

	private int 	pay_no;
	private String	pay_method;
	private int		pay_price;
	private int		pay_discount;
	private int		pay_total_price;
	private String 	pay_user_id;
	private String 	pay_date;
	private String	pay_ticket_no;
	private int		pay_ticket_amount;
	
		
	public int getPay_no() {
		return pay_no;
	}
	public void setPay_no(int pay_no) {
		this.pay_no = pay_no;
	}
	public String getPay_method() {
		return pay_method;
	}
	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}
	public int getPay_price() {
		return pay_price;
	}
	public void setPay_price(int pay_price) {
		this.pay_price = pay_price;
	}
	public int getPay_discount() {
		return pay_discount;
	}
	public void setPay_discount(int pay_discount) {
		this.pay_discount = pay_discount;
	}
	public int getPay_total_price() {
		return pay_total_price;
	}
	public void setPay_total_price(int pay_total_price) {
		this.pay_total_price = pay_total_price;
	}
	public String getPay_user_id() {
		return pay_user_id;
	}
	public void setPay_user_id(String pay_user_id) {
		this.pay_user_id = pay_user_id;
	}
	public String getPay_date() {
		return pay_date;
	}
	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}
	public int getPay_ticket_amount() {
		return pay_ticket_amount;
	}
	public void setPay_ticket_amount(int pay_ticket_amount) {
		this.pay_ticket_amount = pay_ticket_amount;
	}
	public String getPay_ticket_no() {
		return pay_ticket_no;
	}
	public void setPay_ticket_no(String pay_ticket_no) {
		this.pay_ticket_no = pay_ticket_no;
	}

	
	
	
	
	
}
