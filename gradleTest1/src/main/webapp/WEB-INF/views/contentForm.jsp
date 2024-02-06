<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- path에 이름이 맞게 들어가야 작동이 된다. 이름이 다르게 들어가면 작동이 안된다. -->
	<form:form modelAttribute="contentDto" method="get" action="/create">
		작성자 : <form:input path="writer"/>
			<form:errors path="writer" style="color:green;"/>
		<br>
		내용 : <form:input path="content"/>
			<form:errors path="content" style="color:red;"/>
		<br>
		<button>작성</button>
	</form:form>
</body>
</html>