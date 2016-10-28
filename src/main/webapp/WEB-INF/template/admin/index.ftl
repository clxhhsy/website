<@layout.extends name="/layout/_layout.ftl">
    <@layout.put block="custom_style">
    <#-- 页面样式css -->
    <link rel="stylesheet" href="${basePath}/static/css/style.css">
    </@layout.put>
    <@layout.put block="menu">
        <#include "header.ftl">
    </@layout.put>
    <@layout.put block="content">
        <#include "../copyright.ftl">
    </@layout.put>
    <@layout.put block="custom_script">
    <#-- 页面脚本js -->
    <script src="${basePath}/static/js/self/login.js"></script>
    </@layout.put>
</@layout.extends>