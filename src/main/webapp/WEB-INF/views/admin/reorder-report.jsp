<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory Reorder Report for Supplier</title>
</head>
<body>
<form:form method="GET" commandName="PartsList"
	action="${pageContext.request.contextPath}/suppliers/report/${supplier.supplierID}">
	<%-- 	<c:if test="${fn:length(partslist)gt 0}"> --%>
	<div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Inventory Reorder Report for Supplier</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
	<table class="table table-bordered">	
			<tr class="listHeading">
				<th>Part No.</th>
				<th>Unit.Price</th>
				<th>Qty</th>
				<th>Reorder Qty</th>
				<th>Min.Ord.Qty</th>
				<th>Ord.Qty</th>
				<th>Price</th>
			</tr>
		
			<c:forEach var="part" items="${partsList}">
				<tr class="ListRecord">
					<td align="left">${part.partNumber}</td>
					<td align="left">${part.partUnitPrice}</td>
					<td align="left">${part.partUnitInStock}</td>
					<td align="left">${part.partReorderLevel}</td>
					<td align="left">${part.partMinimumReorderQuantity}</td>
					<td align="left">${part.getOrderquality()}</td>
					<td align="left">${part.partUnitPrice}</td>
				</tr>
			</c:forEach>
	
		<tr>
			<c:set var="total" value="${0}" />
			<c:forEach var="part" items="${partsList}">
				<c:set var="total"
					value="${total + part.getPartUnitPrice()*part.getOrderquality()}" />
			</c:forEach>
			<td align="left">Total:  ${total}</td>
		</tr>
<tr>
			<td>&nbsp;</td>
			<td colspan="2" align="left"><br></br> <em><a
				href="${pageContext.request.contextPath}/admin/suppliers/list">Return To Suppliers List
					</a></em></td>
		</tr>
	</table>
	</div>
	</div>
	</div>
	
	<%-- 	</c:if> --%>
</form:form>

</body>
</html>