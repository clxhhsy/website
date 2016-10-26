<#import "_layout.ftl" as u>
<@u.page>
<p>${exampleObject.name} by ${exampleObject.developer}</p>
    <#list systems>
    <ul>
        <#items as system>
            <li>${system_index+1}.${system.name} from ${system.developer}</li>
        </#items>
    </ul>
    </#list>
    <@u.otherExample p1=11 p2=22 />
</@u.page>
