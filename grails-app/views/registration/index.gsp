<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
	<meta name="layout" content="main"/>
	<title> %Blog Name% | Registration</title>
</head>
<body>
	<div class="registerForm">
		<g:form controller="registration" action="create">
			<label for="email">Email: </label>
			<g:textfield name="email" maxlength="50" />
			
			<label for="username">Username: </label>
			<g:textfield name="username" maxlength="20" />
			
			<label for="password">Password: </label>
			<g:passwordfield name="username" maxlength="20" />

			<input type="button" value="Create account">
  	</form>
 	</div>
</body>
</html>