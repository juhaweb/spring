<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
<%@ include file="../_aside.jsp" %>

        <section id="sub" class="theater-register-screen">

            <nav>
                <h3>상영관 등록</h3>
                <p>영화관 관리 > 상영관 등록</p>
            </nav>
                                
            <article>
                
                <form action="#">
                    <div class="field">
                        <label for="theater_city">영화관</label>
                        <select name="theater_city" id="theater_city">
                            <option>지역 선택</option>
                            <option>서울</option>
                            <option>경기/인천</option>
                            <option>충청/대전</option>
                            <option>전라/광주</option>
                            <option>경북/대구</option>
                            <option>경남/부산/울산</option>
                            <option>강원</option>
                            <option>제주</option>
                        </select>

                        <select name="theater_name" id="theater_name">
                            <option>영화관 선택</option>
                            <option>광복</option>
                            <option>김해부원</option>
                            <option>대영</option>
                            <option>동래</option>
                            <option>동부산 아울렛</option>
                            <option>서면(전포동)</option>
                            <option>센텀시티</option>
                            <option>오투(부산대)</option>
                        </select>
                    </div>

                    <div class="field-with-line">
                        <label for="theater_name">1관 이름</label>
                        <input type="text" name="theater_name"/>
                        <span>상영관 이름 예) '1관', 'IMAX관'</span>                                
                    </div>
                    <div class="field">
                        <label for="theater_name">총 좌석수</label>
                        <input type="text" name="theater_name"/>
                        <span>숫자만 기입 예) 80, 100, 120</span>
                    </div>

                    <div class="field-with-line">
                        <label for="theater_name">2관 이름</label>
                        <input type="text" name="theater_name"/>
                        <span>상영관 이름 예) '2관', 'IMAX관'</span>                                
                    </div>
                    <div class="field">
                        <label for="theater_name">총 좌석수</label>
                        <input type="text" name="theater_name"/>
                        <span>숫자만 기입 예) 80, 100, 120</span>
                    </div>

                    <div class="field-with-line">
                        <label for="theater_name">3관 이름</label>
                        <input type="text" name="theater_name"/>
                        <span>상영관 이름 예) '3관', 'IMAX관'</span>                                
                    </div>
                    <div class="field">
                        <label for="theater_name">총 좌석수</label>
                        <input type="text" name="theater_name"/>
                        <span>숫자만 기입 예) 80, 100, 120</span>
                    </div>

                    <div class="field-with-line">
                        <label for="theater_name">4관 이름</label>
                        <input type="text" name="theater_name"/>
                        <span>상영관 이름 예) '4관', 'IMAX관'</span>                                
                    </div>
                    <div class="field">
                        <label for="theater_name">총 좌석수</label>
                        <input type="text" name="theater_name"/>
                        <span>숫자만 기입 예) 80, 100, 120</span>
                    </div>

                    <div class="field-with-line">
                        <label for="theater_name">5관 이름</label>
                        <input type="text" name="theater_name"/>
                        <span>상영관 이름 예) '5관', 'IMAX관'</span>                                
                    </div>
                    <div class="field">
                        <label for="theater_name">총 좌석수</label>
                        <input type="text" name="theater_name"/>
                        <span>숫자만 기입 예) 80, 100, 120</span>
                    </div>

                    <button type="submit" class="btnRegister">등록하기</button>
                </form>
            </article>
            
            <p class="ico info">
                <strong>Tip!</strong>
                영화관을 먼저 등록해야 상영관을 등록 할 수 있습니다.
            </p>
            

        </section>
    </div>
</div>
<%@ include file="../_footer.jsp" %>