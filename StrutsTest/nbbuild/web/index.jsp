<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Basic Struts Application</title>
</head>
<body>
<!--  Create form to Login-->
<s:form action="Login" class="mypack.LoginAction">
 										<!-- Define action to map with struts.xml -->
<s:textfield name="name" label="Name"/>
<s:password name="password" label="Password"/>
<s:submit value="Login"/>
</s:form>
</body>
</html>