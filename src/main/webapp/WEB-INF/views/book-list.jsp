<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Book List</title>
<style type="text/css">
	body{
		margin: 10% 30%
	}

table, th, td {
	border: 1px solid black;
}
td {
	padding-right: 30px;
}

</style>
</head>
<body>
	<c:url value="/book-save" var="urlSave"/>
	<c:url value="/book-view/" var="urlView"/>
	<c:url value="/book-update/" var="urlUpdate"/>
	<c:url value="/book-delete/" var="urlDelete"/>
	<h1>List Book:</h1>
	<a href="${urlSave}">Add Book</a>
	<br />
	<br />


	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Author</th>
			<th>Category</th>
			<th>View</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:if test="${not empty listBook}">
			<c:forEach var="book" items="${listBook}">
				<tr style="border: 1px black solid">
					<td>${book.bookId}</td>
					<td>${book.bookName}</td>
					<td>${book.author}</td>
					<td>${book.category}</td>
					<td> <a href="${urlView}/${book.bookId}">View</a></td>
					<td> <a href="${urlUpdate}/${book.bookId}">Edit</a></td>
					<td> <a href="${urlDelete}/${book.bookId}">Delete</a></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>

</body>
</html>