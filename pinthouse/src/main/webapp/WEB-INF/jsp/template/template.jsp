<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/template.css'/>" rel="stylesheet">
    <title>${title}</title>
</head>
<body>
<div id="head">
    <h1><a href='<spring:url value="/home"/>'>Pinthouse</a></h1>
    <div id="button">
        <sec:authorize access="!isAuthenticated()">
            <a href='<spring:url value="/authenticated"/>'>Connexion</a>
            <a href='<spring:url value="/inscription"/>'>Inscription</a>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <a href='<spring:url value="/logout"/>'>Déconnexion</a>
            Bonjour, ${pageContext.request.userPrincipal.principal.firstName}
        </sec:authorize>
        <a href='<spring:url value="/cart"/>'><img src='<spring:url value="/images/cart.png"/>' alt="langues"/></a>
    </div>
</div>
<div>
    <tiles:insertAttribute name="main-content"/>
</div>
<div id="foot">
    <div id="footLeft">
        <a href='<spring:url value="/aboutUs"/>'>About us</a>
        <a href='<spring:url value="/contact"/>'>Contact</a>
    </div>
    <img id="footRight" src='<spring:url value="/images/translate.png"/>' alt="langues" method="POST" action = "/pinthouse/language"/>
</div>
</body>
</html>