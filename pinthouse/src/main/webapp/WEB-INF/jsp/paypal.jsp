<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>

</head>
<body>
    <form method="POST" action="https://www.sandbox.paypal.com/cgi-bin/webscr">
        <input hidden name="business" value="sellor@sellor.be"/>
        <input hidden name="password" value="EE0YhlP00fjYPECBSDs1TQ80Yn-_7u-gO4-cVqHJcVLgT5OyaTAGqDYI_oxaqkStNOQ47bi1KXBqYSy5"/>
        <input hidden name="cert_id" value="AWdWdJPWVwweq9Pb95QIIcVVYBdqVIZ9NkH0wXvCM98D9n9G6-h8hEMThP9qcTUkfJIlukVYLMoxVsiT"/>
        <input hidden name="cmd" value="_xclick"/>
        <input hidden name="amount" value="${total}"/>
        <input hidden name="item_name" value="Pinthouse"/>
        <input hidden name="return" value="http://localhost:8082/pinthouse/cart/paypal/success"/>
        <input hidden name="cancel_return" value="http://localhost:8082/pinthouse/cart"/>
        <input hidden name="currency_code" value="EUR"/>
        <input hidden name="lc" value="fr_BE"/>
        <button hidden id="orderButton"/>
    </form>
    <script>
        window.onload = () => {
            let intervalId = setInterval(() => {
                clearInterval(intervalId);
                document.getElementById("orderButton").click();
            }, 1000);
        }
    </script>
</body>
</html>
