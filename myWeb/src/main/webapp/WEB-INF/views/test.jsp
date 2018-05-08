<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<td>ID<hr><br>
			<c:forEach items="${model}" var="vo">
				<c:out value="${vo.id }"></c:out><hr>
			</c:forEach>
			</td>
			<td>JOB_TITLE<hr><br>
			<c:forEach items="${model}" var="vo">
				<c:out value="${vo.title }"></c:out><hr>
			</c:forEach>
			</td>
			<td>MIN_SALARY<hr><br>
			<c:forEach items="${model}" var="vo">
				<c:out value="${vo.min }"></c:out><hr>
			</c:forEach>
			</td>
			<td>MAX_SALARY<hr><br>
			<c:forEach items="${model}" var="vo">
				<c:out value="${vo.max }"></c:out><hr>
			</c:forEach>
			</td>
		<tr>
	</table>

</body>
</html>