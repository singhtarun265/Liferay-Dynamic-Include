<%@ include file="/init.jsp"%>

<p>
	<b><liferay-ui:message key="customliferaydynamicincludeweb.caption" /></b>
</p>

<div class="row pre-div">
	<liferay-util:dynamic-include
		key="custom.liferay.dynamic.include.web#view.jsp#pre" />

</div>
<div class="row main-div">
	<p>Main Content here</p>
</div>
<div class="row post-div">
	<liferay-util:dynamic-include
		key="custom.liferay.dynamic.include.web#view.jsp#post" >
		
		<%@ include file="/testpost.jsp"%>
		</liferay-util:dynamic-include>

</div>