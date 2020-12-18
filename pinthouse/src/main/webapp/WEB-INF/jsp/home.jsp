<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/home.css'/>" rel="stylesheet">
</head>
<body>
    Welcome in our wonderful world !
    <div id="menu">
        <ul>
            <div id="category">
                <li>
                    Pays
                    <ul>
                        <c:forEach items="${countryList}" var="country">
                            <li value="${country.nameEn}"><a>${country.nameFr}</a></li>
                        </c:forEach>
                    </ul>
                </li>
                <li>
                    Brasserie
                    <ul>
                        <c:forEach items="${breweryList}" var="brewery">
                            <li value="${brewery.nameEn}"><a>${brewery.nameFr}</a></li>
                        </c:forEach>
                    </ul>
                </li>
            </div>
        </ul>
    </div>
</body>
</html>
