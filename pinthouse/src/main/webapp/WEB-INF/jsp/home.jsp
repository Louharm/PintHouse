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
                <li><a>Pays</a></li>
                <li><a>Brasserie</a></li>
                <li><a>Type de bière</a></li>
                <li><a>Couleur de bière</a></li>
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