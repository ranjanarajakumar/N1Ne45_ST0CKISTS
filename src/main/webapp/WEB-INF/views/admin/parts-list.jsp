<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> Products List Page </h3>
	<em><a href="${pageContext.request.contextPath}/admin/parts/create"> Add a new Product</a></em>
	<div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Part List</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
	<c:if test="${fn:length(partsList) gt 0 }">
	<table>
	<thead>
	<tr class="listHeading">
	<th>Product Number </th>
	<th>Product Name</th>
	<th>Product Unit Price </th>
	<th>Product Description</th>
	<th>Product Color</th>
	<th>Product Dimension</th>
	<th>Product SupplierID</th>
	<th>Product Manufacturer</th>
	<th>Product QuantityPerUnit</th>
	<th>Product UnitsInStock</th>
	<th>Product UnitOnOrder</th>
	<th>Product Reorder Level</th>
	<th>Product Min.Reorder Quantity</th>
	<th>Product Shelf Location</th>
	<th>Product Discontinued</th>
	<th><spring:message code="caption.edit"/></th>
	<th><spring:message code="caption.delete"/></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="parts" items="${partsList}">
	<tr class="listRecord">
	<td>${parts.getPartNumber()}</td>
	<td>${parts.getPartName()}</td>
	<td>${parts.getPartUnitPrice()}</td>
	<td>${parts.getPartDescription()}</td>
	<td>${parts.getPartColor()}</td>
	<td>${parts.getPartDimension()}</td>
	<td>${parts.getPartSupplierID()}</td>
	<td>${parts.getPartManufacturer()}</td>
	<td>${parts.getPartQuantityPerUnit()}</td>
	<td>${parts.getPartUnitInStock()}</td>
	<td>${parts.getPartUnitOnOrder()}</td>
	<td>${parts.getPartReorderLevel()}</td>
	<td>${parts.getPartMinimumReorderQuantity()}</td>
	<td>${parts.getPartShelfLocation()}</td>
	<td>${parts.getPartDiscontinued()}</td>
	<td align="center"><a 
	     href="${pageContext.request.contextPath}/admin/parts/edit/${parts.getPartNumber()}.html">Edit</a> </td>
	<td><a
	     href="${pageContext.request.contextPath}/admin/parts/delete/${parts.getPartNumber()}.html">Delete</a> </td> 
	</tr>
	</c:forEach>
	</tbody>
	</table>
	</c:if>
	</div>
	</div>
	</div>

</body>
</html>