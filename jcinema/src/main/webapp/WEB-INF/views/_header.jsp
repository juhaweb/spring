<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>제이시네마</title>
    <link rel="shortcut icon" href="/jcinema/img/favicon.ico"/>    
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="/jcinema/css/sub_member.css">
    <link rel="stylesheet" href="/jcinema/css/sub.css">    
    <link rel="stylesheet" href="/jcinema/css/style.css"/>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>    
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <script src="/jcinema/js/user.js"></script>
    <script src="/jcinema/js/topBannerBg.js"></script>
    <script src="/jcinema/js/ticketCalendar.js"></script>
    
</head>
<body>
    <div id="wrapper">
        <div id="top-banner">
            <canvas id="canvas"></canvas>
            <div>
                <a href="#" class="image"><img id="topBannerImg" src="/jcinema/img/top_banner_poster2.jpg" alt=""></a>
                <a href="#" class="close"><img src="/jcinema/img/banner-close.png" alt=""></a>
            </div>
        </div>

        <header>
            <div class="service">
                <article>
                    <p>
                        <a href="#">모바일 APP</a>
                        <a href="#">좋아요</a>
                        <a href="#">구독하기</a>
                    </p>
                    <p>
                        <a href="/jcinema/member/login">로그인</a>
                        <a href="/jcinema/member/logout">로그아웃</a>
                        <a href="/jcinema/member/register">회원가입</a>
                        <a href="/jcinema/member/my-cinema">멤버십</a>
                        <a href="#">고객센터</a>
                    </p>
                </article>
            </div>
            <div class="logo">
                <article>
                    <a href="#"><img src="/jcinema/img/logo.gif" alt="jcinema logo"></a>
                </article>                
            </div>
            <div class="gnb">
                <article>
                    <ul>
                        <li class="on"><a href="/jcinema/ticketing/choice-movie">예매</a></li>
                        <li><a href="/jcinema/ticketing/choice-seat">영화</a></li>
                        <li><a href="/jcinema/ticketing/order-confirm">영화관</a></li>
                        <li><a href="/jcinema/ticketing/order-result">이벤트</a></li>
                        <li><a href="/jcinema/member/my-cinema">제이몰</a></li>
                        <li><a href="/jcinema/member/register">VOD</a></li>
                    </ul>

                </article>
            </div>
        </header>

