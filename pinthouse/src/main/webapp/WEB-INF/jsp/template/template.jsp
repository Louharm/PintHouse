<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/template.css'/>" rel="stylesheet">
    <title>${title}</title>
    <spring:url var="localeFr" value="">
        <spring:param name="locale" value="fr"/>
    </spring:url>
    <spring:url var="localeEn" value="">
        <spring:param name="locale" value="en"/>
    </spring:url>
</head>
<body>
<div id="head">
    <h1><a href='<spring:url value="/home"/>'>Pinthouse</a></h1>
    <div id="button">
        <sec:authorize access="!isAuthenticated()">
            <a href='<spring:url value="/authenticated"/>'><spring:message code="SignIn"/></a>
            <a href='<spring:url value="/inscription"/>'><spring:message code="SingUp"/></a>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <a href='<spring:url value="/logout"/>'><spring:message code="LogOut"/></a>
            <spring:message code="Hello"/> ${pageContext.request.userPrincipal.principal.firstName}
        </sec:authorize>
        <a href='<spring:url value="/cart"/>'><img src='<spring:url value="/images/cart.png"/>' alt="Panier"/></a>
    </div>
</div>
<div id="body">
    <tiles:insertAttribute name="main-content"/>
</div>
<div id="foot">
    <div id="footLeft">
        <a href='<spring:url value="/aboutUs"/>'><spring:message code="InfoEntreprise"/></a>
        <a href='<spring:url value="/contact"/>'><spring:message code="Contact"/></a>
    </div>
    <div id="footRight">
        <a href="${localeFr}">
            <img src='<spring:url value="/images/localeFr.png"/>' alt="Francais"/>
        </a>
        <a href="${localeEn}">
            <img src='<spring:url value="/images/localeEn.png"/>' alt="Anglais"/>
        </a>
    </div>
</div>
</body>
</html>