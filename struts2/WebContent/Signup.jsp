<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Strutssss Signup</title>
</head>
<body>
<h2>Struts Signup test</h2>
<s:actionerror />
<s:form action="signup.action" method="post" >
    <s:textfield name="Name" key="label.username" size="20" />
    <s:password name="Password" key="label.password" size="20" />
    <s:submit method="execute" key="label.signup" align="center" />
</s:form>
<a href="Login.jsp">Login Here</a>
</body>
</html>