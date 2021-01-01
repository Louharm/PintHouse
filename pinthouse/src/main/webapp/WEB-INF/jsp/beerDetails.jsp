<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/home.css'/>" rel="stylesheet">
    <link type="text/css" href="<spring:url value='/css/beerDetails.css'/>" rel="stylesheet">
</head>
<body>
    <div id="row">
        <div id="left-column">
            <img id="img-beer" src="https://openclipart.org/image/2400px/svg_to_png/194077/Placeholder.png" alt="Place">
        </div>
        <div id="center-column">
            <h3>${beer.name}</h3>
            <p>${beer.brewery}</p>
            <p>${beer.description}</p>
            <ul>
                <li>${beer.country}</li>
                <li>${beer.beerColor}</li>
                <li>${beer.beerType}</li>
                <li>${beer.alcoholPerc}%</li>
                <li>${beer.capacityCl}CL</li>
            </ul>
        </div>
        <div id="right-column">
            <p>${beer.price}€</p>
            <form:form  id="quantityBeer"
                        method="post"
                        action="/pinthouse/beerDetails/${beer.name}/send"
                        modelAttribute="commandLine">
                <br/>
                <form:label path="quantity"><spring:message code="Quantity"/> : </form:label>
                <form:input type="number" min="1" path="quantity"/>
                <form:errors path="quantity"/>
                <br/>
                <form:button><spring:message code="Add"/></form:button>
            </form:form>
        </div>
    </div>
</body>
</html>
