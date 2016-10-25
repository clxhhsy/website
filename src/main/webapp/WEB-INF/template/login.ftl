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
    <link href="/static/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/static/css/style.css">
</head>
<body>
<div class="box">
    <div class="login-box">
        <div class="login-title text-center">
            <h3>
                <img src="/static/images/logo-white.png">
            </h3>
        </div>
        <div class="login-content ">
            <div class="form">
                <form action="#" method="post">
                    <div class="form-group">
                        <div class="col-xs-12  ">
                            <i class="fa fa-user fa-lg"></i>
                            <input class="form-control" type="text" placeholder="请输入用户名">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-12  ">
                            <i class="fa fa-lock fa-lg"></i>
                            <input type="password" id="password" name="password" class="form-control"
                                   placeholder="请输入密码">
                        </div>
                    </div>
                    <div class="form-group" >
                        <div class="col-xs-12" style="padding-top:20px; float:left;">
                            <div class="col-xs-8" style="padding:0;">
                                <input type="text" id="patchca" name="patchca" class="form-control" placeholder="验证码">
                            </div>
                            <div class="col-xs-4" >
                                <img src="/admin/validateCode.png" alt="验证码"
                                     style="cursor:pointer;vertical-align:text-bottom;"
                                     onclick="this.src='/admin/validateCode.png?'+new Date().getTime();">
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-12" style="padding-top:20px; float:left;">
                            <button type="submit" class="btn btn-lg btn-primary btn-block">登录</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>
