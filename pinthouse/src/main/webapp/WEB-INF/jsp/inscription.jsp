<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/inscription.css'/>" rel="stylesheet">
</head>
<body>
<h2>Inscription</h2>
<div id="form">
    <form:form id="formSignUp" method="POST" action="/pinthouse/inscription/send" modelAttribute="currentUser">
        <form:label path="lastname">Nom de famille :</form:label>
        <form:input path="lastname"/>
        <form:errors path="lastname"/>
        <br/>
        <form:label path="firstname">Prénom :</form:label>
        <form:input path="firstname"/>
        <form:errors path="firstname"/>
        <br/>
        <form:label path="username">Adresse mail :</form:label>
        <form:input path="username"/>
        <form:errors path="username"/>
        <br/>
        <form:label path="password">Mot de passe :</form:label>
        <form:password path="password"/>
        <form:errors path="password"/>
        <br/>
        <form:label path="confirmPassword">Confirmer mot de passe :</form:label>
        <form:password path="confirmPassword"/>
        <form:errors path="confirmPassword"/>
        <br/>
        <form:label path="street">Rue :</form:label>
        <form:input path="street"/>
        <form:errors path="street"/>
        <form:label path="numhouse">Numéro :</form:label>
        <form:input path="numhouse" class="petitChamp"/>
        <form:errors path="numhouse"/>
        <br/>
        <form:label path="city">Ville :</form:label>
        <form:input path="city"/>
        <form:errors path="city"/>
        <form:label path="postCode">Code Postal :</form:label>
        <form:input path="postCode" class="petitChamp"/>
        <form:errors path="postCode"/>
        <br/>
        <form:label path="country">Pays :</form:label>
        <form:select path="country">
            <form:options items="${countries}" itemValue="nameFr" itemLabel="nameFr"/>
        </form:select>
        <form:errors path="country"/>
        <br/>
        <form:label path="phonenumber">Numéro de GSM</form:label>
        <form:input path="phonenumber"/>
        <form:errors path="phonenumber"/>
        <br/>
        <form:button>S'inscrire</form:button>
    </form:form>
</div>
</body>
</html>
