<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/home.css'/>" rel="stylesheet">
    <link type="text/css" href="<spring:url value='/css/category.css'/>" rel="stylesheet">
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
    <div id="list">
        <ul>
            <c:forEach items="${listElemCategory}" var="elem">
                <li><a href='<spring:url value="/category?name=${category}&elemCategory=${elem.nameEn}"/>'>${elem.nameFr}</a></li>
            </c:forEach>
        </ul>
    </div>
    <div class="AllBeersInStore">
        <c:forEach items="${beersList}" var="elem">
            <a href='<spring:url value="/beerDetails/"/> '>
                <div class="beerDisplay">
                    <h4>${elem.name}</h4>
                    <img src="" alt="Image de biere">
                    <p>${elem.breweryName}</p>
                    <p>${elem.beerTypeName}</p>
                    <p>${elem.countryName}</p>
                    <p>${elem.beerColor}</p>
                    <p>${elem.alcoholPerc}%</p>
                    <p id="priceTag">${elem.price}€</p>
                </div>
            </a>
        </c:forEach>
    </div>
</body>
</html>
