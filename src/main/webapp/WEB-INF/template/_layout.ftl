<#macro page>
    <html>
    <head>
        <title>${title}</title>
    </head>
    <body>
        <h1>${title}</h1>
        <#nested >
    </body>
    </html>
</#macro>

<#macro otherExample p1 p2>
    <p>The param were :　${p1} , ${p2}</p>
</#macro>