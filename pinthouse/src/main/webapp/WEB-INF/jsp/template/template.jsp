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
    <h1>Pinthouse</h1>
    <div id="button">
        <button>Connexion</button>
        <button>Inscription</button>
        <img src='<spring:url value="/images/panier.png"/>' alt="langues"/>
    </div>
</div>
<div>
    <tiles:insertAttribute name="main-content"/>
</div>
<div id="foot">
    <div id="footLeft">
        <a>About us</a>
        <a>Contact</a>
    </div>
    <img id="footRight" src='<spring:url value="/images/translate.png"/>' alt="langues"/>
</div>
</body>
</html>