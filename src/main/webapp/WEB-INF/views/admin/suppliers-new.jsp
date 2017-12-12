<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>New Suppliers page</h3>
<form:form method="POST" modelAttribute="supplier"
	action="${pageContext.request.contextPath}/admin/suppliers/new">
	<div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Condensed Table</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
	<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered">
		<tbody>
			<tr>
				<td>Supplier ID</td>
				<td><form:input path="supplierID" /></td>
				<td><form:errors path="supplierID" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td>Supplier Name</td>
				<td><form:input path="supplierName" /></td>
				<td><form:errors path="supplierName" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td>Supplier Contact Name</td>
				<td><form:input path="supplierContactName" /></td>
				<td><form:errors path="supplierContactName"
						cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td>Supplier Contact Title</td>
				<td><form:input path="supplierContactTitle" /></td>
				<td><form:errors path="supplierContactTitle"
						cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td>Supplier Address</td>
				<td><form:input path="supplierAddress" /></td>
				<td><form:errors path="supplierAddress" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td>Supplier Postal Code</td>
				<td><form:input path="supplierPostalCode" /></td>
				<td><form:errors path="supplierPostalCode"
						cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td>Supplier Phone Number</td>
				<td><form:input path="supplierPhoneNumber" /></td>
				<td><form:errors path="supplierPhoneNumber"
						cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td>Supplier Fax</td>
				<td><form:input path="supplierFax" /></td>
				<td><form:errors path="supplierFax" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Create" class="blcass" /></td>
				<td></td>
				<td></td>
			</tr>
		</tbody>
	</table>
	</div>
	</div>
	</div>
</form:form>

</body>
</html>