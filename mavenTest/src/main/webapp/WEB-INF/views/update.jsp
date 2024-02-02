<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/signin">
		
		<h2>수정할 회원정보 입력</h2>
		이메일 : <input type="email" name="email"><br>
		비밀번호 : <input type="password" name="pin"><br>
		<button>정보확인</button>
	</form>
		
	<form method="post" action="/update">
		<h2>수정할 정보</h2>
		이름 : <input type="text" name="name"><br>
		연락처 : <input type="text" name="text"><br>
		비밀번호 변경 : <input type="password" name="newPin"><br>
		<button>수정완료</button>
	</form>
</body>
</html>