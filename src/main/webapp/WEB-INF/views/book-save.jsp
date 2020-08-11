<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Add Book</title>
<style type="text/css">
	body{
		margin: 10% 30%
	}
</style>
</head>
<body>
	

	<h1>Add new Book:</h1>
	<c:url value="/saveBook" var="saveBook"/>
	<form:form action="${saveBook}" method="POST"
		modelAttribute="book">
    	BookName: <form:input path="bookName" /> <br/> <br/>
    	Author: <form:input path="author" /> <br/> <br/>
    	Category: <form:input path="category" /> <br/> <br/>
		<button type="submit">Submit</button>
	</form:form>

</body>
</html>