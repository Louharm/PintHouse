<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
</head>
<body>
    <c:if test="${basket.size() > 0}">
        <div id="table">
            <table>
                <caption>
                    <h3><spring:message code="Cart"/></h3> <p>(${basket.size()} <spring:message code="Product"/>(s))</p>
                </caption>
                <thead>
                    <th><spring:message code="Product"/></th>
                    <th><spring:message code="Price"/></th>
                    <th><spring:message code="Quantity"/></th>
                    <th><spring:message code="Total"/></th>
                </thead>
                <tbody>
                    <c:forEach items="${beers}" var="elem">
                        <tr class ="row">
                            <th>${elem.name}</th>
                            <th>${elem.price} €</th>
                            <th>${basket.get(elem.name)}</th>
                            <th>${elem.price * basket.get(elem.name)} €</th>
                        </tr>
                    </c:forEach>
                    <tr class="footer">
                        <td colspan="2"></td>
                        <td><spring:message code="SubTotal"/> : </td>
                        <td>${total} €</td>
                    </tr>
                </tbody>
            </table>

            <button><spring:message code="ValidateOrder"/></button>
        </div>
    </c:if>
    <c:if test="${basket.size() == 0}">
        <p><spring:message code="EmptyCart"/></p>
    </c:if>
</body>
</html>
