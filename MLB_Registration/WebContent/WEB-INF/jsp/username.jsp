<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page	language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/jsp/include.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html> 
<head>
<title>Registration</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="<c:url value='/resources/css/mlb_style.css'/>" type="text/css"/>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-latest.min.js"/>"></script>


</head>
<body>

<form:form method="post" action="submitUserID" commandName="userIDForm">
	<div class="registerform">
		<form:label path="user_id">User ID:*<form:errors cssStyle="color:red;" path="user_id"/></form:label>
		<form:input path="user_id"/>
	</div>
</form:form>


</body>
</html>