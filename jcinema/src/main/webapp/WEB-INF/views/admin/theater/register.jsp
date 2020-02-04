<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
<div>
    <div class="container">
        <%@ include file="../_aside.jsp" %>
        <section id="sub" class="movie-register">

            <nav>
                <h3>영화등록</h3>
                <p>영화관리 > 영화등록</p>
            </nav>
                                
            <article>
                <form action="/jcinema/admin/movie/register" method="post">
                    <div class="field">
                        <label for="movie_title">영화제목</label>
                        <input id="movie_title" type="text" name="movie_title" />
                    </div>
                    <div class="field">
                        <label for="movie_grade">영화등급</label>
                        <select name="movie_grade" id="movie_grade">
                            <option value="0">전체관람가</option>
                            <option value="12">12세 이상 관람가</option>
                            <option value="15">15세 이상 관람가</option>
                            <option value="18">청소년 관람불가</option>
                            <option value="19">미성년자 관람불가</option>
                        </select>
                    </div>
                    <div class="field">
                        <label for="movie_company">제작사</label>
                        <input id="movie_company" type="text" name="movie_company" />
                    </div>
                    <div class="field">
                        <label for="movie_release_date">개봉일</label>
                        <input id="movie_release_date" type="date" name="movie_release_date" />
                    </div>
                    <div class="field">
                        <label for="movie_genre">장르</label>
                        <input id="movie_genre" type="text" name="movie_genre" />
                    </div>
                    <div class="field">
                        <label for="movie_country">제작국</label>
                        <input id="movie_country" type="text" name="movie_country" />
                    </div>
                    <div class="field">
                        <label for="movie_running_time">러닝타임</label>
                        <input id="movie_running_time" type="text" name="movie_running_time" />
                        <span>분 단위로 입력 예) 100, 120, 160, 180</span>
                    </div>
                    <div class="field">
                        <label for="movie_homepage">공식 홈페이지</label>
                        <input id="movie_homepage" type="text" name="movie_homepage" />
                    </div>
                    <div class="field">
                        <label for="movie_poster">영화 공식 포스터</label>
                        <input id="movie_poster" type="file" name="movie_poster" />
                    </div>                        
                    <div class="field">
                        <label for="movie_director">영화감독</label>
                        <input id="movie_director" type="text" name="movie_director" />
                    </div>
                    <div class="field">
                        <label for="movie_actor">영화배우</label>
                        <input id="movie_actor" type="text" name="movie_actor" />
                        <span>쉼표 구분 입력 예) 정우성, 장동건, 이정재, 김태희, 한예슬</span>
                    </div>
                    <div class="field">
                        <label for="movie_desc">영화설명</label>
                        <textarea name="movie_desc" id="movie_desc" cols="100" rows="16"></textarea>
                    </div>
                    <button type="submit" class="btnRegister">등록하기</button>
                </form>
            </article>
        </section>
    </div>
</div>
<%@ include file="../_footer.jsp" %>