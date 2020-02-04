$(document).ready(function(){
	
	var theaters_li   = $('.theaters > li');
	var theaters      = $('.theaters > li > ol');
	
	// 지역메뉴 클릭
	theaters_li.click(function(e){
		e.preventDefault();
		
		var i = $(this).index();
		
		// active						
		theaters_li.removeClass().eq(i).addClass('active');
		
		// on
		theaters.removeClass().eq(i).addClass('on');			
	});
	
	
	// 극장이름 클릭(동적이벤트 구현)
	$(document).on('click', '.theaters ol > li', function(e){			
		e.preventDefault();
		
		var theaters_all = $('.theaters ol > li');
		
		theaters_all.removeClass('chk');			
		$(this).addClass('chk');
		
		
		var theater_no    = $(this).attr('data-theater-no');			
		$('input[name=theater_no]').val(theater_no);
		
		var schedule_date = $('input[name=movie_date]').val();
		
		
		var url = "/jcinema/api/schedule/movies?theater_no="+theater_no+"&schedule_date="+schedule_date;  
		var movie_list = $('.rank > article > ul');
		
		
		
		movie_list.empty();
					
		$.get(url, function(data){

			var data = JSON.parse(data);
			
			$.each(data, function(i, value){
				
				var grade = null; 
				
				if(value.movie_grade == '0'){
					grade = 'gradeAll';
				}else if(value.movie_grade == '12'){
					grade = 'grade12';
				}else if(value.movie_grade == '15'){
					grade = 'grade15';
				}else if(value.movie_grade == '18'){
					grade = 'grade18';
				}else if(value.movie_grade == '19'){
					grade = 'grade19';
				}									
				
				movie_list.append(
					"<li data-movie-no='"+value.movie_no+"'>"+
					"<a href='#'>"+
					"<span class='grade "+grade+"'></span>"+
					"<span class='tit'>"+value.movie_title+"</span>"+
					"</a>"+
					"</li>"
				);
				
			});
		});
		
	});
	
	// 영화선택
	$(document).on('click', '.rank > article > ul > li', function(e){
		e.preventDefault();
		
		var movie_no = $(this).attr('data-movie-no');			
		var schedule_date = $('input[name=movie_date]').val();
		var schedule_theater_no = $('input[name=theater_no]').val();
		
		var showtime_section_div = $('.showtime > article > section > div');
		var showtime_nodata  = $('.showtime .nodata');
		
		var url = "/jcinema/api/movie-roundview";
		                   
		var param = {"schedule_date": schedule_date, 
					 "schedule_theater_no": schedule_theater_no, 
					 "schedule_movie_no": movie_no}; 
		
		
		$.get(url, param, function(data){
			
			var data = JSON.parse(data);
			
			if(data.length > 0){
				
				showtime_nodata.remove();
				showtime_section_div.empty();
				
				for(var a=0 ; a<data.length ; a++){
					
					showtime_section_div.append("<ul class='round_view'></ul>");
					
					var dataObj = data[a];
					
					for(var b=0 ; b<dataObj.length ; b++){
						
						showtime_section_div.children().last().append("<li>"+
																	   "<a href='#' data-theater-no='"+dataObj[b].schedule_theater_no+
																	   "' data-screen-no='"+dataObj[b].schedule_screen_no+
																	   "' data-movie-no='"+dataObj[b].schedule_movie_no+
																	   "' data-movie-date='"+dataObj[b].schedule_date+
																	   "' data-round-view='"+dataObj[b].schedule_round_view+"'>"+
																	   "<span>"+dataObj[b].schedule_round_view+"회차</span>"+
																	   "<span>"+dataObj[b].schedule_start_time.substring(0, 5)+" ~ "+dataObj[b].schedule_end_time.substring(0, 5)+"</span>"+
																	   "<span><em>24</em>석/<em>80</em>석</span>"+
																	   "</a>"+
																	   "</li>");
					}
				}
			}
		});			
	});
	
	// 영화상영 회차 클릭(동적태그 이벤트)		
	$(document).on('click', '.round_view > li > a', function(e){
		
		var theater_no = $(this).attr('data-theater-no');
		var screen_no  = $(this).attr('data-screen-no');
		var movie_date = $(this).attr('data-movie-date');
		var movie_no   = $(this).attr('data-movie-no');
		var round_view = $(this).attr('data-round-view');
		
		location.href = '/jcinema/ticketing/choice-seat?seat_theater_no='+theater_no+'&seat_screen_no='+screen_no+'&ticket_movie_date='+movie_date+'&ticket_movie_no='+movie_no+'&ticket_round_view='+round_view;
	});
	
	
	
	// 영화관 데이터 불러오기
	$.ajax({
		url: '/jcinema/api/theaters',
		type: 'get',
		dataType: 'json',
		success: function(data){
			
			$.each(data, function(k, values){
				
				
				if(k == '서울'){
					
					$.each(values, function(i, data){							
						theaters.eq(0).append("<li data-theater-no='"+data.theater_no+"'><a href='#'>"+data.theater_name+"</a></li>");
					});
					
					
				}else if(k == '경기/인천'){
					
					$.each(values, function(i, data){							
						theaters.eq(1).append("<li data-theater-no='"+data.theater_no+"'><a href='#'>"+data.theater_name+"</a></li>");
					});
					
				}else if(k == '충청/대전'){
					
					$.each(values, function(i, data){							
						theaters.eq(2).append("<li data-theater-no='"+data.theater_no+"'><a href='#'>"+data.theater_name+"</a></li>");
					});
					
				}else if(k == '전라/광주'){
					
					$.each(values, function(i, data){							
						theaters.eq(3).append("<li data-theater-no='"+data.theater_no+"'><a href='#'>"+data.theater_name+"</a></li>");
					});
					
				}else if(k == '경북/대구'){
					
					$.each(values, function(i, data){							
						theaters.eq(4).append("<li data-theater-no='"+data.theater_no+"'><a href='#'>"+data.theater_name+"</a></li>");
					});
					
				}else if(k == '경남/부산/울산'){
					
					$.each(values, function(i, data){							
						theaters.eq(5).append("<li data-theater-no='"+data.theater_no+"'><a href='#'>"+data.theater_name+"</a></li>");
					});
					
				}else if(k == '강원'){
					
					$.each(values, function(i, data){							
						theaters.eq(6).append("<li data-theater-no='"+data.theater_no+"'><a href='#'>"+data.theater_name+"</a></li>");
					});
					
				}else if(k == '제주'){
					
					$.each(values, function(i, data){							
						theaters.eq(7).append("<li data-theater-no='"+data.theater_no+"'><a href='#'>"+data.theater_name+"</a></li>");
					});
				}
				
			});
			
		}			
	});
	
	
});