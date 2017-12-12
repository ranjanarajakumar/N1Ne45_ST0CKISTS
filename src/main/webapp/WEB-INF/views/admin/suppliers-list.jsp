<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Suppliers</title>
</head>
<body>
	<br>
	<em><a href="${pageContext.request.contextPath}/admin/suppliers/new">Add a
		new supplier</a></em>
	<br>
	<div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Suppliers List</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
	<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered">
		<tr class="listHeading">
			<th>Supplier Id</th>
			<th>Supplier Name</th>
			<th>Supplier Contact Name</th>
			<th>Supplier Contact Title</th>
			<th>Supplier Address</th>
			<th>Supplier Postal Code</th>
			<th>Supplier Phone Number</th>
			<th>Supplier Fax</th>
			<th><spring:message code="caption.edit" /></th>
			<th><spring:message code="caption.delete" /></th>
			<th><spring:message code="caption.report" /></th>
		</tr>

		<c:forEach var="supplier" items="${suppliersList}">
			<tr class="listRecord">
				<td align="left">${supplier.supplierID}</td>
				<td align="left">${supplier.supplierName}</td>
				<td align="left">${supplier.supplierContactName}</td>
				<td align="left">${supplier.supplierContactTitle}</td>
				<td align="left">${supplier.supplierAddress}</td>
				<td align="left">${supplier.supplierPostalCode}</td>
				<td align="left">${supplier.supplierPhoneNumber}</td>
				<td align="left">${supplier.supplierFax}</td>
				<td align="center"><a
					href="${pageContext.request.contextPath}/admin/suppliers/edit/${supplier.supplierID}">Edit</a></td>
				<td><a
					href="${pageContext.request.contextPath}/admin/suppliers/delete/${supplier.supplierID}">Delete</a></td>
					<td><a
					href="${pageContext.request.contextPath}/admin/suppliers/report/${supplier.supplierID}">ReorderReport</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	</div>
	</div>
</body>
</html>