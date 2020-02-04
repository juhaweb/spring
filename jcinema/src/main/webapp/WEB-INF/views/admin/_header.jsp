<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JCINEMA::관리자</title>
    <link rel="shortcut icon" href="/jcinema/admin/img/favicon.ico"/>    
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/jcinema/admin/css/style.css"> 

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>    
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <script src="/jcinema/admin/js/sideMenu.js"></script>
    <script src="/jcinema/admin/js/admin.js"></script>
    <!-- 
        디자인 컨셉
        http://demo.cssmoban.com/cssthemes4/cpts_637_bxl/sample.html#
        http://www.scuolaparitariaprovolo.it/admin/login.php
     -->
</head>
<body>
    <div id="wrapper-admin">
        <header>
            <div class="container">
                <a class="logo" href="/jcinema/admin/index"><img src="/jcinema/admin/img/admin_logo.png" alt=""></a>
            </div>
        </header>
        