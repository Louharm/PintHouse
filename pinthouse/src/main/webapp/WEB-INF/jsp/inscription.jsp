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
        <form:label path="lastName">Nom de famille :</form:label>
        <form:input path="lastName"/>
        <br/>
        <form:label path="firstName">Prénom :</form:label>
        <form:input path="firstName"/>
        <br/>
        <form:label path="email">Adresse mail :</form:label>
        <form:input path="email"/>
        <br/>
        <form:label path="password">Mot de passe :</form:label>
        <form:password path="password"/>
        <br/>
        <form:label path="confirmPassword">Confirmer mot de passe :</form:label>
        <form:password path="confirmPassword"/>
        <br/>
        <form:label path="birthDate">Date de naissance :</form:label>
        <form:input path="birthDate"/>
        <br/>
        <form:label path="street">Rue :</form:label>
        <form:input path="street"/>
        <form:label path="numHouse">Numéro :</form:label>
        <form:input path="numHouse" class="petitChamp"/>
        <br/>
        <form:label path="city">Ville :</form:label>
        <form:input path="city"/>
        <form:label path="postCode">Code Postal :</form:label>
        <form:input path="postCode" class="petitChamp"/>
        <br/>
        <form:label path="country">Pays :</form:label>
        <form:select path="country">
            <form:options items="${countries}" itemValue="nameFr" itemLabel="nameFr"/>
        </form:select>
        <br/>
        <form:label path="phone">Numéro de GSM</form:label>
        <form:input path="phone"/>
        <br/>
        <form:button>S'inscrire</form:button>
    </form:form>
</div>
</body>
</html>
