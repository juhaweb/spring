<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../_header.jsp" %>
<script src="/jcinema/js/choiceSeat.js"></script>

<div id="sub" class="choice-seat">
    <nav class="sub-menu"></nav>
    <section>
        <div class="seat-setting">
            <h1>인원/좌석선택</h1>
            <div>
                <div>
                    <span>성인</span>
                    <select class="adult">
                        <option>0</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                    <span>청소년</span>
                    <select class="teenager">
                        <option>0</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                    <span>시니어</span>
                    <select class="senior">
                        <option>0</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                    <span>장애인</span>
                    <select class="disPerson">
                        <option>0</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                </div>
                <div>
                    <span>좌석 붙임 설정</span>
                    <img src="../img/ico_exclamation.gif" alt="!" title="좌석 붙임 설정 기능 이건 도저히 못하겠다.">
                    <em>·&nbsp;인원은 최대 5명까지 선택 가능합니다.</em>
                </div>
            </div>
        </div>    
    </section>
    <section>
        <div class="seat-area">
            <div class="screen"><em>Screen</em></div>

            <article>
                <ul>
                <c:forEach varStatus="status" var="seatList" items="${totalSeatList}">
                	<li>
                		<span class="tit">${status.index[status.index].seat_row}</span>
                        <c:forEach varStatus="status" var="svo" items="${seatList}">
                        <a href="#" class="seat" data-seat="${svo.seat_row}${svo.seat_column}" title="좌석">${status.count}</a>
                        </c:forEach>
                    </li>
                </c:forEach>
                </ul>
            </article>
            <p>
                · 선택한 좌석을 다시 클릭하면 취소됩니다.<br>
                · SWEET SPOT은 최적의 화면과 사운드를 즐길 수 있는 좌석입니다.<br>
                (스크린 가운데에서 상영관 뒤 벽까지 직선 거리의 2/3 지점)
            </p>

            <ol>
                <li><i class="bg_seat_exit"></i>출입문</li>
                <li><i class="bg_seat_selected"></i>선택좌석</li>
                <li><i class="bg_seat_available"></i>선택가능</li>
                <li><i class="bg_seat_reserved"></i>예매완료</li>
                <li><i class="bg_seat_not"></i>선택불가</li>
            </ol>
        </div>                
    </section>
    <section>
        <div class="seat-info">
            <ol>
                <li><i class="bg_seat_sweet"></i>SWEET SPOT</li>
                <li><i class="bg_seat_couple"></i>CINE COUPLE</li>
                <li><i class="bg_seat_family"></i>CINE FAMILY</li>
                <li><i class="bg_seat_comfort"></i>CINE COMFORT(리클라이너)</li>
                <li><i class="bg_set_disable"></i>장애인석</li>
                <li><i class="bg_set_foot"></i>발받침</li>
            </ol>
        </div>
    </section>
    <section>
        <div class="back-and-pay">
            <a href="#">영화선택</a>
            <a href="#">일반결제</a>
        </div>
    </section>
    <section>
        <div class="total-info">
            <div>
                <span>영화</span>
                <article>
                    <img class="poster" src="/jcinema/poster/${movieInfo.movie_poster} alt="">
                    <p class="movie-info">
                        <strong>${movieInfo.movie_title}</strong>
                        <b>${movieInfo.movie_genre}</b>
                        <em>${movieInfo.movie_grade}</em>
                    </p>
                </article>
                
            </div>
            <div>
                <span>예매정보</span>
                <table>
                    <tr>
                        <td>상영일</td>
                        <td>${movieInfo.schedule_date}</td>
                    </tr>
                    <tr>
                        <td>상영시간</td>
                        <td>${movieInfo.schedule_start_time}~${movieInfo.schedule_end_time}</td>
                    </tr>
                    <tr>
                        <td>상영관</td>
                        <td>${movieInfo.theater_name}</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>${movieInfo.screen_name}</td>
                    </tr>
                    <tr>
                        <td>좌석</td>
                        <td class="result_seat">0</td>
                    </tr>
                </table>
                <h2>28,000<span>원</span></h2>
            </div>
            <div>
                <span>총 결제 금액</span>
                <table>
                    <tr>
                        <td>영화예매</td>
                        <td class="right">￦28,000</td>
                    </tr>
                </table>                        
                <h2>28,000<span>원</span></h2>
            </div>
        </div>
    </section>
</div>
<%@ include file="../_footer.jsp" %>