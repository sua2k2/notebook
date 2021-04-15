<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron">
		<h1>${title}</h1>
		<p>${feeling}</p>
	</div>
	<div>
		<form:form method="POST" modelAttribute="Notebook">
			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="memo">
					메모 </label>
				<form:textarea id="memo" path="memo" />
				<input type="submit" id="btnAdd" class="btn btn-primary" value="저장" />
			</div>
		</form:form>
	</div>
</body>
</html>