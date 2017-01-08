<%@taglib prefix="core" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="post" enctype="multipart/form-data" commandName="registrationForm">

<core:hasBindErrors name="registrationForm">
<font color="red">Please Fix all the errors</font>
</core:hasBindErrors><br>
<core:message code="registration.firstName">
</core:message>:
<core:bind path="registrationForm.firstName">
<input type="text" name="firstName" value="${status.value}"/>${status.errorMessage}
</core:bind>
<br>

<core:message code="registration.lastName">
</core:message>:
<core:bind path="registrationForm.lastName">
<input type="text" name="lastName" value="${status.value}"/>${status.errorMessage}
</core:bind>
<br>
<core:message code="registration.resume">
</core:message>:
<core:bind path="registrationForm.resume">
<input type="file" name="resume" value="${status.value}"/>${status.errorMessage}
</core:bind>
<br>

<input type="submit" value="Submit"/>

</form:form>