<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
</head>
<body>
    <p><spring:message code = "ThanksYou"/>${pageContext.request.userPrincipal.principal.firstName}</p>
</body>
</html>