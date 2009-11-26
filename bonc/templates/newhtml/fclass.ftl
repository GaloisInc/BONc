<#include "macros.ftl"/>
<h2>${qualifiedclass}</h2>

<h3>Description</h3>
<p>${class.comment!"No description"}</p>

<#if class.classInterface??>
<#assign ci=class.classInterface/>
<#if (ci.parents?size > 0)>
<h3>Parents:</h3>
<p><#list ci.parents as parent><@type type=parent/><#if parent_has_next>, </#if></#list></p>
</#if>
</#if>
<#assign children=STUtil.getAllDescendants(class,st)/>
<#if (children?size > 0)>
<h3>Children:</h3>
<p><#list children as child><@pclass class=child/><#if child_has_next>, </#if></#list></p>
</#if>