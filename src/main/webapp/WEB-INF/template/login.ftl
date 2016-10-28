<!doctype html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="renderer" content="webkit">
    <title>后台管理系统登录</title>
    <link href="${basePath}/static/favicon.ico" rel="shortcut icon"/>
    <link rel="icon" href="${basePath}/static/favicon.ico" type="image/x-icon"/>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${basePath}/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="${basePath}/static/css/font-awesome.min.css">
    <link rel="stylesheet" href="${basePath}/static/css/animate.css">
    <link rel="stylesheet" href="${basePath}/static/css/style.css">
</head>
<body class="blue-bg">
<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div>
        <h1 class="logo-name">
            <img src="/static/images/logo-white.png">
        </h1>
    </div>
    <span id="errMsg"></span>
    <form id="loginForm" class="m-t" role="form" action="/admin/login" method="post">
        <div class="form-group">
            <input type="text" class="form-control" name="userName" id="userName" placeholder="请输入用户名" required
                   autocomplete="off">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="userPassword" id="userPassword" placeholder="请输入密码"
                   required autocomplete="off">
        </div>
        <div class="form-group">
            <div class="row">
                <div class="col-xs-8 col-sm-8 col-md-8">
                    <input type="text" id="captcha" maxlength="4" id="captcha" name="captcha" class="form-control"
                           placeholder="验证码" required>
                </div>
                <div class="col-xs-4 col-sm-4 col-md-4">
                    <img src="/admin/validateCode.png" alt="验证码"
                         style="cursor:pointer;vertical-align:text-bottom;"
                         onclick="this.src='/admin/validateCode.png?'+new Date().getTime();">
                </div>
            </div>
        </div>
        <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>
    </form>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${basePath}/static/js/jquery/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${basePath}/static/js/bootstrap/bootstrap.min.js"></script>
<script src="${basePath}/static/js/plugins/jqueryValidate/jquery.validate.min.js"></script>
<script src="${basePath}/static/js/common/common.js"></script>
<script src="${basePath}/static/js/common/jquery.validate.extend.js"></script>
<script src="${basePath}/static/js/crypto-js.js"></script>
<script src="${basePath}/static/js/self/login.js"></script>
</body>
</html>
