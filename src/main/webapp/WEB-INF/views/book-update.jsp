<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Edit book</title>
<style type="text/css">
	body{
		margin: 10% 30%
	}
</style>
</head>
<body>
	<a href="<c:url value="/book-list" />">List Book</a>
	<br />

	<h1>Edit Book</h1>
	<c:url value="/updateBook" var="updateBook" />
	<form:form action="${updateBook}" method="POST" modelAttribute="book">
	    Id: <form:input path="bookId" readonly="true" /> <br/> <br/>
    	Name: <form:input path="bookName" /> <br/> <br/>
    	Author: <form:input path="author" /> <br/> <br/>
    	Category: <form:input path="category" /> <br/> <br/>
		<button type="submit">Submit</button>
	</form:form>

</body>
</html>