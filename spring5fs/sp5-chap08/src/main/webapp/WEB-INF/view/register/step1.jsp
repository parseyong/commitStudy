<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<title><spring:message code="member.register"/></title>
</head>
<body>
	<h2>약관내용</h2>
	<p><spring:message code="term.agree"/></p>
	<form action="step2" method="post">
	<label>
		<input type="checkbox" name="agree" value="true"> 약관 동의
	</label>
	<input type="submit" value="다음 단계" />
	</form>
</body>
</html>