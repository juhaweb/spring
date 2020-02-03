<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
<srcipt src="/jcinema/js/choiceMovie.js"></srcipt>

<div id="sub" class="choice-movie">

    <nav class="sub-menu"></nav>
         
    <div class="theater">
        <article>
                                 
            <a class="side-banner left"  href="#"><img src="/jcinema/img/ticketing_side_banner_event.png" alt=""></a>
            <a class="side-banner right" href="#"><img src="/jcinema/img/ticketing_side_banner_event.png" alt=""></a> 
            
            <div class="calendar">
                
                <input type="text" name="movie_date"/> 
				<input type="text" name="theater_no"/> 
				<input type="text" name="movie_no"/> 
				
		          <nav>
		            <span class="month">12</span>
		            <span class="year">2020 January</span>
		          </nav>
		
		          <div>
		            <ul>
		              <li class="day on"><a href="#"><em></em><span></span></a></li>
		              <li class="day"><a href="#"><em></em><span></span></a></li>
		              <li class="day"><a href="#"><em></em><span></span></a></li>
		              <li class="day"><a href="#"><em></em><span></span></a></li>
		              <li class="day"><a href="#"><em></em><span></span></a></li>
		              <li class="sat"><a href="#"><em></em><span></span></a></li>
		              <li class="sun"><a href="#"><em></em><span></span></a></li>
		              <li class="day"><a href="#"><em></em><span></span></a></li>
		              <li class="day"><a href="#"><em></em><span></span></a></li>
		              <li class="day"><a href="#"><em></em><span></span></a></li>
		              <li class="day"><a href="#"><em></em><span></span></a></li>
		              <li class="day"><a href="#"><em></em><span></span></a></li>
		              <li class="sat"><a href="#"><em></em><span></span></a></li>
		              <li class="sun"><a href="#"><em></em><span></span></a></li>
		            </ul>                              
                </div>
            </div>

            <section>
                <div class="region">
                    <div>
                        <h3>영화관</h3>
                        <span><strong>·&nbsp;최대 1개</strong>까지 선택 가능</span>
                    </div>
                    <div>
                        <h4>MY 영화관</h4>
                        <p>
							로그인 후 확인하실 수 있습니다.
                            <a class="login" href="#">로그인</a>
                        </p>
                    </div>
                    <article>
                        <h4>전체영화관</h4>
                        <ul class="theaters">
                <li class="active">
                  <a href="#">서울(24)</a>
                  <ol class="on"></ol>
                </li>
                <li>
                  <a href="#">경기/인천(44)</a>
                  <ol></ol>
                </li>
                <li>
                  <a href="#">충청/대전(10)</a>
                  <ol></ol>
                </li>
                <li>
                  <a href="#">전라/광주(9)</a>
                  <ol></ol>
                </li>
                <li>
                  <a href="#">경북/대구(16)</a>
                  <ol></ol>
                </li>
                <li>
                <a href="#">경남/부산/울산(22)</a>
                <ol></ol>
                </li>
                <li>
                  <a href="#">강원(3)</a>
                  <ol></ol>
                </li>
                <li>
                  <a href="#">제주(3)</a>
                  <ol></ol>
                </li>
              </ul>
                    </article>
                </div>
                <div class="rank">
                    <div>
                        <h3>영화</h3>
                        <span><strong>·&nbsp;최대 1개</strong>까지 선택 가능</span>
                    </div>
                    <div>
                        <p>
                            <a class="on" href="#">예매순</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="#">평점순</a>
                        </p>
                    </div>
                    <article>
                        <ul>                                    
                        </ul>
                    </article>
                </div>
            </section>
        </article>
    </div>

    <div class="showtime">
        <article>
            <div class="info">
                <em>상영일</em>
                <span class="infoDate">2020.02.03(월)</span>
                <em>영화관</em>
                <span class="infoTheater">영화관을 선택하세요.</span>
                <em>영화</em>
                <span class="infoMovie">영화를 선택하세요.</span>
            </div>
            <section>
                <h1>상영시간<span>예고편 상영 등으로 시작이 10여분 정도 차이 날 수 있습니다.</span></h1>

                <p class="nodata">상영시간이 조회되지 않았습니다. </p>

                <div>
                    
                </div>

            </section>               
            

        </article>
    </div>

</div>

<%@ include file="../_footer.jsp" %>