<#macro page>
<html>
<head>
    <title>${title}</title>
    <link href="http://cdn.sojson.com/sojson/favicon.ico" rel="shortcut icon"/>
    <link rel="icon" href="http://cdn.sojson.com/sojson/favicon.ico" type="image/x-icon"/>
</head>
<body>
    <#include "header.ftl" >
<div class="table">
    <img src="validateCode.png" alt="验证码" style="cursor:pointer;vertical-align:text-bottom;"
         onclick="this.src = this.src+'?'+new Date().getTime()">
</div>
<h1>${title}</h1>
    <#nested >
    <#include "footer.ftl">
    <#include "copyright.ftl">
</body>
</html>
</#macro>

<#macro otherExample p1 p2>
<p>The param were :　${p1} , ${p2}</p>
</#macro>