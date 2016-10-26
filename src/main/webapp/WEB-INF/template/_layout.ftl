<#macro page>
<html>
<head>
    <title>${title}</title>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="renderer" content="webkit">
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
<body>
    <#include "header.ftl" >
<h1>${title}</h1>
    <#nested >
    <#include "footer.ftl">
    <#include "copyright.ftl">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="/static/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="/static/js/bootstrap.min.js"></script>
</body>
</html>
</#macro>

<#macro otherExample p1 p2>
<p>The param were :　${p1} , ${p2}</p>
</#macro>
