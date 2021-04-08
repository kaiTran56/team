<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>

	<h1>
		<spring:message code="userForm.title" />
	</h1>

	<form:form modelAttribute="newUser">

		<p>
			<spring:message code="user.name" text="HelloWorld!: " />
			<form:input path="name" />
			<form:errors path="name" cssClass="error" />
		</p>
		<p>
			<spring:message code="user.email" text="Email: " />
			<form:input path="email" />
			<form:errors path="email" cssClass="error" />
		</p>
		<p>
			Birthday:
			<form:input path="birthday" />
			<form:errors path="birthday" cssClass="error" />
		</p>
		<p>
			Age:
			<form:input path="age" />
			<form:errors path="age" cssClass="error" />
		</p>
		<p>
			Role:
			<form:select path="role">
				<form:option value="">Select Option</form:option>
				<form:options items="${roles}" />
			</form:select>
		</p>
		<p>
			Address:
			<form:input path="addr.street" />
		</p>
		<p>
			State:
			<form:input path="addr.state" />
		</p>
		<p>
			Zipcode:
			<form:input path="addr.zipcode" /> <form:errors path ="addr.zipcode" cssClass="error"/>
		</p>
		<input type="submit" value="Add">
	</form:form>
</body>
</html>