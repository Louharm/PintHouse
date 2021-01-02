<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/connection.css'/>" rel="stylesheet">
</head>
<body>
<h2><spring:message code="SignIn"/></h2>
<div id="form">
    <form:form id="formSignUp" method="POST" modelAttribute="currentUser">
        <form:label path="username"><spring:message code="Mail"/> :</form:label>
        <form:input path="username"/>
        <br/>
        <form:label path="password"><spring:message code="Password"/> :</form:label>
        <form:password path="password"/>
        <br/>
        <br/>
        <form:button><spring:message code="SignIn"/></form:button>
    </form:form>
    <a href='<spring:url value="/inscription"/>' class="linkToButton"><spring:message code="SingUp"/></a>
</div>
</body>
</html>