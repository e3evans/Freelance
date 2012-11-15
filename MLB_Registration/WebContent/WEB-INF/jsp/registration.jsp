<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page	language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Registration</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
*{ margin:0; padding:0;}
body{ font:100% normal Arial, Helvetica, sans-serif; background:#000000;}
form,select,textarea{margin:0; padding:0; color:#ffffff;}

div.registerform {
margin:0 auto;
width:500px;
background:#222222;
position:relative;
top:50px;
border:1px solid #262626;
}

div.registerform h1 { 
color:#ffffff;
font-size:18px;
text-transform:uppercase;
padding:5px 0 5px 5px;
border-bottom:1px solid #161712;
border-top:1px solid #161712; 
}

div.registerform label {
width:100%;
display: block;
background:#1C1C1C;
border-top:1px solid #262626;
border-bottom:1px solid #161712;
padding:10px 0 10px 0;
}

div.registerform label span {
display: block;
color:#bbbbbb;
font-size:12px;
float:left;
width:100px;
text-align:right;
padding:5px 20px 0 0;
}

div.registerform .input_text {
padding:10px 10px;
width:200px;
background:#262626;
color:red;
border-bottom: 1px double #171717;
border-top: 1px double #171717;
border-left:1px double #333333;
border-right:1px double #333333;
}

div.registerform .message{
padding:7px 7px;
width:350px;
background:#262626;
border-bottom: 1px double #171717;
border-top: 1px double #171717;
border-left:1px double #333333;
border-right:1px double #333333;
overflow:hidden;
height:150px;
}

div.registerform .button
{
margin:0 0 10px 0;
padding:4px 7px;
background:#CC0000;
border:0px;
position: relative;
top:10px;
left:382px;
width:100px;
border-bottom: 1px double #660000;
border-top: 1px double #660000;
border-left:1px double #FF0033;
border-right:1px double #FF0033;
}
</style>
</head>
<body>

<form:form method="post" action="submitRegistration">
	<div class="registerform">
		<form:label path="user_role">Role:</form:label><form:input path="user_role"/>
		<form:label path="company">Company / Team Name:</form:label><form:input path="company"/>
		<form:label path="firstname">First Name:</form:label><form:input path="firstname"/>
		<form:label path="lastname">Last Name:</form:label><form:input path="lastname"/>
		<form:label path="address1">Address 1:</form:label><form:input path="address1"/>
		<form:label path="address2">Address 2:</form:label><form:input path="address2"/>
		<form:label path="city">City:</form:label><form:input path="city"/>
		<form:label path="state">State:</form:label><form:input path="state"/>
		<form:label path="country">Country:</form:label><form:input path="country"/>
		<form:label path="postalcode">Postal Code:</form:label><form:input path="postalcode"/>
		<form:label path="phone">Phone Number:</form:label><form:input path="phone"/>
		<form:label path="mobile">Mobile Number:</form:label><form:input path="mobile"/>
		<form:label path="fax">Fax Number:</form:label><form:input path="fax"/>
		<form:label path="email">Email:</form:label><form:input path="email"/>
		<form:label path="confirmemail">Confirm E-mail:</form:label><form:input path="confirmemail"/>
		<form:label path="altemail">Alternate E-mail:</form:label><form:input path="altemail"/>
		<form:label path="secret">Secret Question:</form:label><form:input path="secret"/>
		<form:label path="secretanswer">Secret Answer:</form:label><form:input path="secretanswer"/>
		<input type="submit" class="button" value="Submit Form" />
	</div>
</form:form>





</body>
</html>