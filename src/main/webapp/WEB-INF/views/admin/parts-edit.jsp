<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Edit Parts page</h3>

<form:form method="POST" modelAttribute="parts"
	action="${pageContext.request.contextPath}/admin/parts/edit/${parts.partNumber}">
<div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Bordered Table</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
	<table class="table table-bordered">
		<tbody>
		<form:hidden path=""/>
		<tr>
				<td><spring:message code="PartNumber" /></td>
				<td><form:input path="PartNumber" readonly="true" /></td>
				<td><form:errors path="PartNumber" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartName" /></td>
				<td><form:input path="PartName" /></td>
				<td><form:errors path="PartName" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartUnitPrice" /></td>
				<td><form:input path="PartUnitPrice" /></td>
				<td><form:errors path="PartUnitPrice" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartDescription" /></td>
				<td><form:input path="PartDescription" /></td>
				<td><form:errors path="PartDescription" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartColor" /></td>
				<td><form:input path="PartColor" /></td>
				<td><form:errors path="PartColor" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartDimension" /></td>
				<td><form:input path="PartDimension" /></td>
				<td><form:errors path="PartDimension" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartSupplierID" /></td>
				<td><form:input path="PartSupplierID" readonly="true" /></td>
				<td><form:errors path="PartSupplierID" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartManufacturer" /></td>
				<td><form:input path="PartManufacturer" /></td>
				<td><form:errors path="PartManufacturer" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartQuantityPerUnit" /></td>
				<td><form:input path="PartQuantityPerUnit" /></td>
				<td><form:errors path="PartQuantityPerUnit" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartUnitInStock" /></td>
				<td><form:input path="PartUnitInStock" /></td>
				<td><form:errors path="PartUnitInStock" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartUnitOnOrder" /></td>
				<td><form:input path="PartUnitOnOrder" /></td>
				<td><form:errors path="PartUnitOnOrder" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartReorderLevel" /></td>
				<td><form:input path="PartReorderLevel" /></td>
				<td><form:errors path="PartReorderLevel" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartMinimumReorderQuantity" /></td>
				<td><form:input path="PartMinimumReorderQuantity" /></td>
				<td><form:errors path="PartMinimumReorderQuantity" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartShelfLocation" /></td>
				<td><form:input path="PartShelfLocation" /></td>
				<td><form:errors path="PartShelfLocation" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="PartDiscontinued" /></td>
				<td><form:input path="PartDiscontinued" /></td>
				<td><form:errors path="PartDiscontinued" cssStyle="color: red;" /></td>
			</tr>
			<tr>
			<td><input type="submit" value="Update" /></td>
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