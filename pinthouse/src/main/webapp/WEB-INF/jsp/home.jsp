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
                <li><button onclick="window.location.href ='<c:url value="/category/country"/>'">Pays</button></li>
                <li><button onclick="window.location.href ='<c:url value="/category/brewery"/>'">Brasserie</button></li>
                <li><button onclick="window.location.href ='<c:url value="/category/beerType"/>'">Type de bière</button></li>
                <li><button onclick="window.location.href ='<c:url value="/category/beerColor"/>'">Couleur de bière</button></li>
            </div>
        </ul>
    </div>

    <div class="AllBeersInStore">
            <c:forEach items="${beersList}" var="elem">
                <a href='<spring:url value="/beerDetails?name=${elem.name}"/>'>
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