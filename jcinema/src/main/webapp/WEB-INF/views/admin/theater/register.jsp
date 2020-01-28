<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
<%@ include file="../_aside.jsp" %>
        <section id="sub" class="theater-register">

            <nav>
                <h3>영화관 등록</h3>
                <p>영화관 관리 > 영화관 등록</p>
            </nav>
                                
            <article>
                <form action="#">
                    <div class="field">
                        <label for="theater_city">지역</label>
                        <select name="theater_city" id="theater_city">
                            <option>선택</option>
                            <option value="02">서울</option>
                            <option value="03">경기/인천</option>
                            <option value="04">충청/대전</option>
                            <option value="05">전라/광주</option>
                            <option value="06">경북/대구</option>
                            <option value="07">경남/부산/울산</option>
                            <option value="08">강원</option>
                            <option value="09">제주</option>
                        </select>
                    </div>

                    <div class="field">
                        <label for="theater_name">영화관 이름</label>
                        <input type="text" name="theater_name"/>
                        <span>지점명 예) 서면점, 남포점, 오투점</span>
                    </div>
                    <div class="field">
                        <label for="theater_tel">영화관 연락처</label>
                        <input id="theater_tel" type="tel" name="theater_tel" />
                        <span>지역번호 포함 예) 051-512-0012</span>
                    </div>
                    <div class="field">
                        <label for="theater_addr">영화관 주소</label>
                        <input type="text" name="theater_addr">
                        <span>우편번호 생략</span>
                    </div>                            
                    <div class="field">
                        <label for="theater_screen_count">상영관 수</label>
                        <input type="text" name="theater_screen_count">
                        <span>숫자만 기입</span>
                    </div>

                    <button type="submit" class="btnRegister">등록하기</button>
                </form>
            </article>

            

        </section>
    </div>
</div>

<%@ include file="../_footer.jsp" %>