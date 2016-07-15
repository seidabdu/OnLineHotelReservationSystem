<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<form:form method="post" commandName="book">
			<table>
				<tr>
					<td>Name:</td><td><form:input path="name" /></td>
					<td><font color="red"><form:errors path="name" /></font></td>
				</tr>
				<tr>
					<td>Price:</td><td><form:input path="price"/></td>
					<td><font color="red"><form:errors path="price" /></font></td>
				</tr>
				<tr>
					<td>Author:</td><td><form:input path="author"/></td>
					<td><font color="red"><form:errors path="author"  /> </font></td>
				</tr>
				<tr>
					<td>Email:</td><td><form:input path="email"/></td>
					<td><font color="red"><form:errors path="email" /></font></td>
				</tr>
				<tr>
					<td>Date:</td><td><form:input path="date"/></td>
					<td><font color="red"><form:errors path="date" /></font></td>
				</tr>
				</table>
				<input name="submitBook" type="submit" value="Create"  />
		</form:form>
	</body>
</html>
