<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/cart.css'/>" rel="stylesheet">
</head>
<body>
    <c:if test="${basket.size() > 0}">
        <div id="tableCart">
            <table>
                <caption>
                    <h3><spring:message code="Cart"/></h3> <p>(${basket.size()} <spring:message code="Product"/>(s))</p>
                </caption>
                <thead>
                    <th id="titleProduct"><spring:message code="Product"/></th>
                    <th id="titlePrice"><spring:message code="Price"/></th>
                    <th id="titleQuantity"><spring:message code="Quantity"/></th>
                    <th id="titleTotal"><spring:message code="Total"/></th>
                </thead>
                <tbody>
                    <c:forEach items="${beers}" var="elem">
                        <tr class ="row">
                            <td>${elem.name}</td>
                            <td>${elem.price} €</td>
                            <td>
                                <button onclick="window.location.href ='<c:url value="/cart/less/${elem.name}"/>'">-</button>
                                ${basket.get(elem.name)}
                                <button onclick="window.location.href ='<c:url value="/cart/plus/${elem.name}"/>'">+</button>
                            </td>
                            <td>
                                <script>
                                    document.write((${elem.price * basket.get(elem.name)}).toFixed(2));
                                </script>
                                €
                            </td>
                            <td class="deleteButton"><button onclick="window.location.href ='<c:url value="/cart/delete/${elem.name}"/>'"><spring:message code="Remove"/></button></td>
                        </tr>
                    </c:forEach>
                    <tr class="footer">
                        <td id="emptyCase" colspan="2"></td>
                        <td><spring:message code="SubTotal"/> : </td>
                        <td>
                            <script>
                                document.write((${total}).toFixed(2));
                            </script>
                            €
                        </td>
                    </tr>
                </tbody>
            </table>
            <button onclick="window.location.href ='<c:url value="cart/paypal"/>'"><spring:message code="ValidateOrder"/></button>
        </div>
    </c:if>
    <c:if test="${basket.size() == 0}">
        <p><spring:message code="EmptyCart"/></p>
    </c:if>
</body>
</html>
