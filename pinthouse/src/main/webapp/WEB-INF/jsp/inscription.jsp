<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
</head>
<body>
Inscription :
<form:form id="formSignUp" method="POST" action="/pinthouse/inscription/send" modelAttribute="currentUser">
    <form:label path="lastName">Nom de famille :</form:label>
    <form:input path="lastName"/>
    <form:label path="firstName">Prénom :</form:label>
    <form:input path="firstName"/>
    <form:label path="email">Adresse mail :</form:label>
    <form:input path="email"/>
    <form:label path="password">Mot de passe :</form:label>
    <form:password path="password"/>
    <form:label path="confirmPassword">Confirmer mot de passe :</form:label>
    <form:password path="confirmPassword"/>
    <form:label path="birthDate">Date de naissance :</form:label>
    <form:input path="birthDate"/>
    <form:label path="street">Rue :</form:label>
    <form:input path="street"/>
    <form:label path="numHouse">Numéro de maison :</form:label>
    <form:input path="numHouse"/>
    <form:label path="city">Ville :</form:label>
    <form:input path="city"/>
    <form:label path="postCode">Code Postal :</form:label>
    <form:input path="postCode"/>
    <form:label path="country">Pays :</form:label>
    <form:input path="country"/>
    <form:label path="phone">Numéro de GSM</form:label>
    <form:input path="phone"/>
    <form:button>Send</form:button>
</form:form>
</body>
</html>
