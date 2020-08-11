<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Book</title>
<style type="text/css">
	body{
		margin: 10% 30%
	}
	</style>
</head>
<body>

	<h1>View Book:</h1>	
	Book ID: ${book.bookId} <br/>
	Book Name: ${book.bookName} <br/>
	Author: ${book.author} <br/>
	Category: ${book.category} <br/>
</body>
</html>