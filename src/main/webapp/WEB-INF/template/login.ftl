<!doctype html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>后台管理系统登录</title>
    <link href="http://cdn.sojson.com/sojson/favicon.ico" rel="shortcut icon"/>
    <link rel="icon" href="http://cdn.sojson.com/sojson/favicon.ico" type="image/x-icon"/>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
    <style>
        body {
            margin: 0;
            padding: 0;
        }

        .form-signin {
            max-width: 400px;
        }

        input {
            margin-bottom: 3px;
        }

        .login_box {
            position: absolute;
            top: 20%;
            -webkit-transform: translateY( -20%);
            -moz-transform: translateY( -20%);
            -ms-transform: translateY( -20%);
            -o-transform: translateY( -20%);
            transform: translateY( -20%);
        }
        #login_form{
            background: rgba(255,255,255,0.8);
        }
    </style>
</head>
<body>
<div class="container login_box">
    <div style="text-align: center;">
        <h3>
            <img src="/static/images/logo-white.png" alt="Logo"/>
        </h3>
    </div>
    <form class="form-signin" role="form" id="login_form">
        <div class="form-group">
            <input type="input" class="form-control" placeholder="请输入用户名" required autofocus>
        </div>
        <div class="form-group">
            <input type="password" class="form-control" placeholder="请输入密码" required>
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    </form>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>