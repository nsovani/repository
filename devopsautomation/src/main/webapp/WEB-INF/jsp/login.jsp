<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Login</title>
		<s:head />
	</head>
	<body>
		<s:form action="login.action">
			<s:textfield label="User Name" name="userName" />
			<s:password label="Password" name="password" />
			<s:submit />
		</s:form>
	</body>
</html>