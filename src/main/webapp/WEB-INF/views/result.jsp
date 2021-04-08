<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Detail Information:</p>
	<p>User: ${savedUser.name}</p>
	<p>User: ${savedUser.email}</p>
	<p>User: ${savedUser.age}</p>
	<p>User: ${savedUser.birthday}</p>
	<p>User: ${savedUser.role}</p>
	<p>User: ${savedUser.addr.street}</p>
	<p>User: ${savedUser.addr.state}</p>
	<p>User: ${savedUser.addr.zipcode}</p>

</body>
</html>