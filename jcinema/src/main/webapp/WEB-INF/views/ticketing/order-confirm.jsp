<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
<div id="sub" class="order-confirm">
    <nav class="sub-menu"></nav>
    <section>
        <div class="movie-info">
            <h1>주문/결제</h1>
            <article>
                <div>
                    <img src="/jcinema/poster/${movieInfo.movie_poster}" alt="">
                    <table>
                        <tr>
                            <th class="tit" colspan="4">${movieInfo.movie_title}</th>
                        </tr>
                        <tr>
                            <th>상영일</th>
                            <td>${movieInfo.schedule_date}</td>
                            <th>상영시간</th>
                            <td>${movieInfo.schedule_start_time} ~ ${movieInfo.schedule_end_time}</td>
                        </tr>
                        <tr>
                            <th>상영관</th>
                            <td>${movieInfo.theater_name} ${movieInfo.screen_name}</td>
                            <th>관람인원</th>
                            <td>성인1</td>
                        </tr>
                        <tr>
                            <th>좌석</th>
                            <td colspan="3">${seat}</td>                                    
                        </tr>
                    </table>
                    <h2>10,000<i>원</i></h2>

                </div>
                <div>
                    <strong>총주문금액</strong>
                    <h3>10,000<i>원</i></h3>
                </div>
            </article>

        </div>
    </section>
    <section>
        <div class="dc-coupon">
            <h1>할인/쿠폰 사용</h1>

            <a href="#">L.POINT</a>
            <article>
                <p>
                    L.POINT 내용
                </p>
            </article>

            <a href="#">관람권/할인권/쿠폰</a>
            <article>
                <p>
                    관람권/할인권/쿠폰 내용
                </p>
            </article>

            <a href="#">포인트/기타할인</a>
            <article>
                <p>
                    포인트/기타할인 내용
                </p>
            </article>

            <a href="#" class="on">그 외 결제수단</a>
            <article class="on">
                <p>
                    그 외 결제수단 내용
                </p>
            </article>
        </div>
    </section>
    <section>
        <div class="back">
            <a href="#">이전단계</a>
        </div>
    </section>
    <section>
        <div class="total-price">
            <div class="order">
                <span>주문금액</span>
                <p>
                    <strong>영화예매</strong>
                    <em>10,000원</em>
                </p>
                <h5>10,000<em>원</em></h5>
            </div>
            <div class="discount">
                <span>할인금액</span>
                <p style="visibility: hidden;">
                    <strong>영화예매</strong>
                    <em>10,000원</em>
                </p>
                <h5>0<em>원</em></h5>
            </div>
            <div class="pay">
                <span>총 결제 금액</span>
                <h4>10,000<i>원</i></h4>
                <a href="#">결제하기</a>
            </div>
        </div>
    </section>
</div>
<%@ include file="../_footer.jsp" %>