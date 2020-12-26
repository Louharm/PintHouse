<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/home.css'/>" rel="stylesheet">
</head>
<body>
    <div id="menu">
        <ul>
            <div id="category">
                <li><a href='<spring:url value="/category?name=country"/>'>Pays</a></li>
                <li><a href='<spring:url value="/category?name=brewery"/>'>Brasserie</a></li>
                <li><a href='<spring:url value="/category?name=beerType"/>'>Type de bière</a></li>
                <li><a href='<spring:url value="/category?name=beerColor"/>'>Couleur de bière</a></li>
            </div>
        </ul>
    </div>

    <div class="inStore">
        <c:forEach items="${beersList}" var="beer">
            <div class="beer">
                <img src="" alt="Image de biere">
                <h3>${beer.name}</h3>
            </div>
        </c:forEach>
    </div>
    liste des bières
</body>
</html>