<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<html>
	<body>
<table border="1">
	<tbody>
		<tr>
			<td>${submittedBook.name}</td><td> is the Book's name.</td>
		</tr>
		<tr>
			<td>${submittedBook.price}</td><td> is the Book's price.</td>
		</tr>
		<tr>
			<td>${submittedBook.author}</td><td> is the Author's name.</td>
		</tr>
		<tr>
			<td>${submittedBook.email}</td><td> is the Author's email id.</td>
		</tr>
		<tr>
			<td><fmt:formatDate value="${submittedBook.date}" pattern="dd-MMM-yyyy"/></td><td> is the creation date.</td>
		</tr>
	</tbody>
</table>
	</body>
</html>
