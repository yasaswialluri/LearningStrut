<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<s:form action="login">
<s:textfield label="Name" key="name"></s:textfield>

<s:submit value="login"></s:submit>
</s:form>
</body>
</html>