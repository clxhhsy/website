<!doctype html>
<html lang="zh_CN">
<head>
    <@layout.block name="title">
    <title>首页</title>
    </@layout.block>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="renderer" content="webkit">
    <link href="${basePath}/static/favicon.ico" rel="shortcut icon"/>
    <link rel="icon" href="${basePath}/static/favicon.ico" type="image/x-icon"/>

    <#include "global_css.ftl">
    <!-- custom style -->
    <@layout.block name="custom_style">
    </@layout.block>
</head>
<body>

    <@layout.block name="menu"></@layout.block>
    <@layout.block name="content"></@layout.block>
    <#include "global_js.ftl">
    <@layout.block name="custom_script"></@layout.block>
</body>
</html>