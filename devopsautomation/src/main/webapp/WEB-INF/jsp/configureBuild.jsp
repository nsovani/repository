<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Configure Jenkins Item</title>
		<s:head />
	</head>
	<body>
		Configure Jenkins parameters
		<s:form action="configureJenkins.action">
			<s:textfield label="IP or Hostname" name="url" />
			<s:textfield label="Port" name="port" />
			<s:textfield label="Protocol" name="protocol" />
			<s:textfield label="Username" name="username" />
			<s:password label="Password" name="password" />
			<s:password label="Configuration Name" name="configurationName" />
			<s:submit />
		</s:form>
		
	</body>
</html>