<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/inscription.css'/>" rel="stylesheet">
</head>
<body>
<h2><spring:message code="SingUp"/></h2>
<div id="form">
    <form:form id="formSignUp" method="POST" action="/pinthouse/inscription/send" modelAttribute="userForm">
        <form:label path="lastName"><spring:message code="LastName"/> :</form:label>
        <form:input path="lastName"/>
        <form:errors path="lastName"/>
        <br/>
        <form:label path="firstName"><spring:message code="FirstName"/> :</form:label>
        <form:input path="firstName"/>
        <form:errors path="firstName"/>
        <br/>
        <form:label path="username"><spring:message code="Mail"/> :</form:label>
        <form:input path="username"/>
        <form:errors path="username"/>
        <br/>
        <form:label path="password"><spring:message code="Password"/> :</form:label>
        <form:password path="password"/>
        <form:errors path="password"/>
        <br/>
        <form:label path="confirmPassword"><spring:message code="ConfirmPassword"/> :</form:label>
        <form:password path="confirmPassword"/>
        <form:errors path="confirmPassword"/>
        <br/>
        <form:label path="street"><spring:message code="Street"/> :</form:label>
        <form:input path="street"/>
        <form:errors path="street"/>
        <br/>
        <form:label path="numHouse"><spring:message code="Number"/> :</form:label>
        <form:input path="numHouse" class="petitChamp"/>
        <form:errors path="numHouse"/>
        <br/>
        <form:label path="city"><spring:message code="City"/> :</form:label>
        <form:input path="city"/>
        <form:errors path="city"/>
        <br/>
        <form:label path="postCode"><spring:message code="PostCode"/> :</form:label>
        <form:input path="postCode" class="petitChamp"/>
        <form:errors path="postCode"/>
        <br/>
        <form:label path="countryId"><spring:message code="Country"/> :</form:label>
        <form:select path="countryId">
            <form:options items="${countries}" itemValue="item" itemLabel="name"/>
        </form:select>
        <form:errors path="country"/>
        <br/>
        <form:label path="phoneNumber"><spring:message code="Phone"/> (<spring:message code="Format"/> : +00 000/00.00.00)</form:label>
        <form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/>
        <br/>
        <form:button><spring:message code="SingUp"/></form:button>
    </form:form>
</div>
</body>
</html>
