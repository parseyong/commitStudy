<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적 입력</title>
</head>
<body>
	<h1>성적 입력</h1>
	<form:form action="calculateAvg" modelAttribute="testScore">
		<p>
			<label>국어 성적: <br>
			<form:input path="korean" />
			<form:errors path="korean" />
			</label>
			
		</p>
		
		<p>
			<label>영어 성적: <br>
				<form:input path="english" />
				<form:errors path="english" />
			</label>
			
		</p>
		<p>
			<label>수학 성적: <br>
				<form:input path="math" />
				<form:errors path="math" />
			</label>
			
		</p>
		<p>
			<label>과학 성적: <br>
				<form:input path="science" />
				<form:errors path="science" />
			</label>
			
		</p>
		<input type="submit" value="계산하기">
	</form:form>
</body>
</html>