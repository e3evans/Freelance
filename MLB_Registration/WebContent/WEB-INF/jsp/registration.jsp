<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page	language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/jsp/include.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html> 
<head>
<title>Registration</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="<c:url value='/resources/css/mlb_style.css'/>" type="text/css"/>


</head>
<body>

<form:form method="post" action="submitRegistration" commandName="registrationForm">
	<div class="registerform">
		<form:label path="user_role">Role:*<form:errors cssStyle="color:red;" path="user_role"/></form:label>
		<form:select path="user_role" size="5"><form:options items="${roleList}"/></form:select>
		<form:label path="company">Company / Team Name:*<form:errors cssStyle="color:red" path="company" /></form:label><form:input path="company"/>
		<form:label path="firstname">First Name:*<form:errors cssStyle="color:red" path="firstname" /></form:label><form:input path="firstname"/>
		<form:label path="lastname">Last Name:*<form:errors cssStyle="color:red" path="lastname" /></form:label><form:input path="lastname"/>
		<form:label path="address1">Address 1:*<form:errors cssStyle="color:red" path="address1" /></form:label><form:input path="address1"/>
		<form:label path="address2">Address 2:</form:label><form:input path="address2"/>
		<form:label path="city">City:*<form:errors cssStyle="color:red" path="city" /></form:label><form:input path="city"/>
		<form:label path="state">State:</form:label><form:input path="state"/>
		<form:label path="country">Country:*<form:errors cssStyle="color:red" path="country" /></form:label><form:input path="country"/>
		<form:label path="postalcode">Postal Code:</form:label><form:input path="postalcode"/>
		<form:label path="phone">Phone Number:</form:label><form:input path="phone"/>
		<form:label path="mobile">Mobile Number:</form:label><form:input path="mobile"/>
		<form:label path="fax">Fax Number:</form:label><form:input path="fax"/>
		<form:label path="email">Email:*<form:errors cssStyle="color:red" path="email" /></form:label><form:input path="email"/>
		<form:label path="confirmemail">Confirm E-mail:*<form:errors cssStyle="color:red" path="confirmemail" /></form:label><form:input path="confirmemail"/>
		<form:label path="altemail">Alternate E-mail:</form:label><form:input path="altemail"/>
		<form:label path="secret">Secret Question:*<form:errors cssStyle="color:red" path="secret" /></form:label><form:input path="secret"/>
		<form:label path="secretanswer">Secret Answer:*<form:errors cssStyle="color:red" path="secretanswer" /></form:label><form:input path="secretanswer"/>
		<input type="submit" class="button" value="Submit Form" />
	</div>
</form:form>





</body>
</html>