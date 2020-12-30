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
                    <h3>MON PANIER</h3> <p>(${basket.size()} produit(s))</p>
                </caption>
                <thead>
                    <th>Produit</th>
                    <th>Prix</th>
                    <th>Quantité</th>
                    <th>Total</th>
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
                        <td>Sous total : </td>
                        <td>${total} €</td>
                    </tr>
                </tbody>
            </table>

            <button>Valider ma commande</button>
        </div>
    </c:if>
    <c:if test="${basket.size() == 0}">
        <p>Votre panier est vide !</p>
    </c:if>
</body>
</html>
