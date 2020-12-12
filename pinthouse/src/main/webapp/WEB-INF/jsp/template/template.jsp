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
    <h1><a method="POST" href="${pageContext.request.contextPath}/home">Pinthouse</a></h1>
    <div id="button">
        <a method="POST" href="${pageContext.request.contextPath}/authenticated">Connexion</a>
        <a method="POST" href="${pageContext.request.contextPath}/inscription">Inscription</a>
        <a method="POST" href="${pageContext.request.contextPath}/cart"><img src='<spring:url value="/images/cart.png"/>' alt="langues"/></a>
    </div>
</div>
<div>
    <tiles:insertAttribute name="main-content"/>
</div>
<div id="foot">
    <div id="footLeft">
        <a method="POST" href="${pageContext.request.contextPath}/aboutUs">About us</a>
        <a method="POST" href="${pageContext.request.contextPath}/contact">Contact</a>
    </div>
    <img id="footRight" src='<spring:url value="/images/translate.png"/>' alt="langues" method="POST" action = "/pinthouse/language"/>
</div>
</body>
</html>