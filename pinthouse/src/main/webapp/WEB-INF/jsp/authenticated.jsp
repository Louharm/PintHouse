<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
</head>
<body>
    <p>c'est une page accessible à seulement qques élus ;)</p>
    <p>Bravo ${pageContext.request.userPrincipal.principal.firstname}</p>
</body>
</html>