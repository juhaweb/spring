<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JCINEMA ADMIN 로그인</title>
    <link rel="shortcut icon" href="./img/favicon.ico"/>    
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/jcinema/admin/css/style.css">    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>    
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <script src="/jcinema/admin/js/sideMenu.js"></script>
</head>
<body>
    <div id="wrapper-admin-login">
        <section>
            <img src="/jcinema/admin/img/admin_login_logo.png" alt="">

            <h3>LOGIN</h3>
            <div>
                <label for="uid">아이디</label>
                <input type="text" name="uid" id="uid">

                <label for="pass">비밀번호</label>
                <input type="password" name="pass" id="pass">
                <button type="submit">로그인</button>                
            </div>
            <p>
                아이디와 비밀번호는 관리자에게 문의하세요.
            </p>
            
        </section>

    </div>
    
</body>
</html>