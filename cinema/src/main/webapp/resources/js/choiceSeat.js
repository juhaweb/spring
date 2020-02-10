$(function(){

		// 80개의 좌석 객체
		var seat = $('.seat-area .seat');
		// 선택된 좌석 가격 가져가기 
		var btnNext = $('.back-and-pay > a:nth-child(2)');
		// 상태변수 하나 둘거임
		var isSelected = false;
	
		btnNext.click(function(){
			if(!isSelected){
				alert('좌석을 선택하세요');
				return false;
			}
			var seatValue = $('.result_seat').text();
			location.href="/jcinema/ticketing/order-confirm?seat="+seatValue;
		
		});

	
		// 1개 좌석 클릭
		seat.click(function(){

		// 클릭하면 위에 선언된 상태변수를 true로 바꿔줌.
		isSelected = true;
		
		var dataSeat = $(this).attr('data-seat');
		
		// result_seat에 클릭한 dataSeat 넣기 
		$('.result_seat').text(dataSeat);
		return false;
		});
	

});