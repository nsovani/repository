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
		Configure Jenkins Item
		<s:form action="configureBuild.action">
		<s:textfield label="Item Name" name="itemName" />
			<s:select list="cvsChoices" name="cvsChoice" label="Select CVS"></s:select>
			<s:textfield label="CVS url" name="url" />
			<s:textfield label="Port" name="port" />
			<s:textfield label="POM Location" name="pomLocation" />
			<s:submit />
		</s:form>
	</body>
</html>