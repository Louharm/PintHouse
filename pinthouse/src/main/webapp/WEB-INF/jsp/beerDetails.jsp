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
            <p>${beer.breweryName}</p>
            <p>${beer.description}</p>
            <ul>
                <li>${beer.countryName}</li>
                <li>${beer.beerColor}</li>
                <li>${beer.beerTypeName}</li>
                <li>${beer.alcoholPerc}%</li>
                <li>${beer.capacityCl}CL</li>
            </ul>
        </div>
        <div id="right-column">
            <p>${beer.price}€</p>
            <form:form id="quantityBeer" method="post" action="/pinthouse/beerDetails/send" modelAttribute="commandLine">
                <form:label path="quantity">Quantité</form:label>
                <form:input path="quantity"/>
                <form:errors path="quantity"/>
                <br/>
                <form:button>Ajouter</form:button>
            </form:form>
        </div>
    </div>
</body>
</html>
