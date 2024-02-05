<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 메이븐 테스트 </title>
</head>
<body>
	<h1>${user }</h1>
	
		<a href="/signup" id="up">회원가입</a>
		<c:if test="${user == null }">
		<a href="/signin" id="in">로그인</a>
		</c:if>
		<c:if test="${user != null }">
		<a href="/update" id="new">회원정보 수정</a>
		</c:if>

</body>
</html>
<style>
	a{ text-decoration:none; color:white; font-size:40px; display:block; 
		padding:20px 40px; margin:0 auto; width:300px; text-align:center; 
	}
	#up{ background-color:#3498db; }
	#in{ background-color:#27ae60; }
	#new{ background-color:#187a2c; }
</style>







