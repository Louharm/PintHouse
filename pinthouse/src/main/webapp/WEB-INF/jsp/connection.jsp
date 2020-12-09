<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/connection.css'/>" rel="stylesheet">
</head>
<body>
<h2>Connexion</h2>
<div id="form">
    <form:form id="formSignUp" method="POST" action="/pinthouse/connection/send" modelAttribute="currentUser">
        <form:label path="email">Adresse mail :</form:label>
        <form:input path="email"/>
        <br/>
        <form:label path="password">Mot de passe :</form:label>
        <form:password path="password"/>
        <br/>
        <br/>
        <form:button>Se connecter</form:button>
    </form:form>
    <a class="linkToButton" method="POST" href="${pageContext.request.contextPath}/inscription">S'inscrire</a>
</div>
</body>
</html>
