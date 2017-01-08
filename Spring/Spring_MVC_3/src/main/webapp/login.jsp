<%@taglib prefix="core" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form method="post" commandName="loginForm">
<core:message code="loginWelcome"></core:message>
<br></br>

<core:hasBindErrors name="loginForm">
<font color="red">Please Fix all the errors</font>
</core:hasBindErrors>
<br></br>
	<core:message code="login.username" />
	: 
	<core:bind path="loginForm.username">
	<input type="text" name="username" value="${status.value}"/>
	${status.errorMessage}
	</core:bind>
	<br>

	<core:message code="login.password" />
	: 
	<core:bind path="loginForm.password">
	<input type="text" name="password" value="${status.value}"/>
	${status.errorMessage}
	</core:bind>
	<br> <input type="submit"
		value="Submit">
		
		</form:form>
