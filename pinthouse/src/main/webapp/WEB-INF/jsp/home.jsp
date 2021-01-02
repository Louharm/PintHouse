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
                <li><button onclick="window.location.href ='<c:url value="/category/country"/>'"><spring:message code="Country"/></button></li>
                <li><button onclick="window.location.href ='<c:url value="/category/brewery"/>'"><spring:message code="Brewery"/></button></li>
                <li><button onclick="window.location.href ='<c:url value="/category/beerType"/>'"><spring:message code="BeerType"/></button></li>
                <li><button onclick="window.location.href ='<c:url value="/category/beerColor"/>'"><spring:message code="BeerColor"/></button></li>
            </div>
        </ul>
    </div>

    <div class="AllBeersInStore">
            <c:forEach items="${beersList}" var="elem">
                <button onclick="window.location.href ='<c:url value="/beerDetails/${elem.name}"/>'">
                    <div class="beerDisplay">
                        <h4>${elem.name}</h4>
                        <img src="" alt="Image de biere">
                        <p>${elem.brewery}</p>
                        <p>${elem.beerType}</p>
                        <p>${elem.country}</p>
                        <p>${elem.beerColor}</p>
                        <p>${elem.alcoholPerc}%</p>
                        <p id="priceTag">${elem.price}€</p>
                    </div>
                </button>
            </c:forEach>
    </div>
</body>
</html>