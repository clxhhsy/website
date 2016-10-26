<!doctype html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="renderer" content="webkit">
    <title>后台管理系统登录</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">
    <link href="/static/favicon.ico" rel="shortcut icon"/>
    <link rel="icon" href="/static/favicon.ico" type="image/x-icon"/>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/css/font-awesome.min.css">
    <link rel="stylesheet" href="/static/css/animate.css">
    <link rel="stylesheet" href="/static/css/style.css">
</head>
<body class="gray-bg">
<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div>
        <div>
            <h1 class="logo-name">H+</h1>
        </div>
        <form class="m-t" role="form" action="">
            <div class="form-group">
                <div class="input-group input-group-md">
                    <span class="input-group-addon">
                        <i class="fa fa-user fa-lg"></i>
                    </span>
                    <input type="text" class="form-control" placeholder="请输入用户名" required="" autocomplete="off">
                </div>
            </div>
            <div class="form-group">
                <div class="input-group input-group-md">
                    <span class="input-group-addon">
                        <i class="fa fa-lock fa-lg"></i>
                    </span>
                    <input type="password" class="form-control" placeholder="请输入密码" required="" autocomplete="off">
                </div>
            </div>
            <div class="form-group">
                <div class="row">
                    <div class="col-xs-8 col-sm-8 col-md-8">
                        <input type="text" id="patchca" name="patchca" class="form-control" placeholder="验证码">
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
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="/static/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="/static/js/bootstrap.min.js"></script>
</body>
</html>
