<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="decorator" content="userLayout" />
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" modelAttribute="part"
	action="${pageContext.request.contextPath}/part/search/results">
	<h2>Search Page</h2>
		<table>
			<tr>
				<td><input id="chkNumber" type="checkbox"/></td>
				<td>Part Number:</td>
				<td><input id="txtNumber" type="text" /></td>
			</tr>
			<tr>
				<td><input id="chkDescription" type="checkbox"/></td>
				<td>Description:</td>
				<td><input id="txtDescription" type="text" /></td>
			</tr>
			<tr>
				<td><input id="chkColor"  type="checkbox"/></td>
				<td>Color:</td>
				<td><input id="txtColor" type="text" /></td>
			</tr>
			<tr>
				<td><input id="chkManufacturer" type="checkbox"/></td>
				<td>Manufacturer:</td>
				<td><input name="txtManufacturer" type="text" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Search"></td>
			</tr>
					</table>
				<hr>
<table>
<tr>
<th> # </th>
<th> Part Number </th>
<th> Description </th>
<th> Color </th>
<th> Manufacturer </th>
<th>Details</th>
</tr>
</table>
<table>
<c:forEach var="part" varStatus="idx" items="${pList}">

<tr>
<td> # </td>
<td> ${part.partNumber} </td>
<td> ${part.partDescription} </td>
<td> ${part.partColor} </td>
<td> ${part.partManufacturer} </td>
<td align="center"><a href="${pageContext.request.contextPath}/part/details/${part.partNumber}.html">View Details</a></td>
<td align="center"><a href="${pageContext.request.contextPath}/part/thistory/${part.partNumber}.html">View Transaction History</a></td>
</tr>
</c:forEach>
</table>
</form:form>


</body>
</html>