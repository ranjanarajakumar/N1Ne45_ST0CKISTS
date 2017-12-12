<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="decorator" content="userLayout" />
<title>Insert title here</title>
</head>
<body>
<div class="navbar navbar-inner block-header">
           <div class="muted pull-left">Search Panel</div>
    </div>
	<div class="block-content collapse in">
        <div class="span12">
	<form:form method="POST" modelAttribute="searchPart" class="form-horizontal"
		action="${pageContext.request.contextPath}/part/search">
		
		<table>
			<tr>
				<td><input id="chkNumber" type="checkbox" class="span6"/></td>
				<td>Part Number:</td>
				<td><form:input path="partNumber" /></td>
				<td><form:errors path="partNumber" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><input id="chkDescription" type="checkbox" class="span6"/></td>
				<td>Description:</td>
				<td><form:input path="description" /></td>
				<td><form:errors path="description" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><input id="chkColor" type="checkbox" class="span6"/></td>
				<td>Color:</td>
				<td><form:input path="color" /></td>
				<td><form:errors path="color" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<td><input id="chkManufacturer" type="checkbox" class="span6"/></td>
				<td>Manufacturer:</td>
				<td><form:input path="manufacturer" /></td>
				<td><form:errors path="manufacturer" cssStyle="color: red;" /></td>
			</tr>
			<tr>
				<%-- <td colspan="3"><a href="${pageContext.request.contextPath}/part/search/results"> Search </a><br/></td> --%>

				<td colspan="4" align="center"><input type="submit"
					value="Search" class="btn btn-inverse"></td>
			</tr>
		</table>
		<hr>
	</form:form>
	</div>
</div>
	<c:if test="${fn:length(searchPart.errorMsg) gt 0}">
		<h4 style="color:red;style:bold">${searchPart.errorMsg}</h4>
	</c:if>
	<c:if test="${fn:length(searchPart.parts) gt 0}">
	<div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Search Results</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
		<table class="table table-striped">
			<tr>
				<th>#</th>
				<th>Part Number</th>
				<th>Description</th>
				<th>Color</th>
				<th>Manufacturer</th>
				<th>Details</th>
				<th>Transaction History</th>
			</tr>
			<c:forEach var="part" varStatus="idx" items="${searchPart.parts}">
				<tr>
					<td>#</td>
					<td>${part.partNumber}</td>
					<td>${part.partDescription}</td>
					<td>${part.partColor}</td>
					<td>${part.partManufacturer}</td>
					<td align="center"><a
						href="${pageContext.request.contextPath}/part/details/${part.partNumber}.html">View
							Details</a></td>
					<td align="center"><a
						href="${pageContext.request.contextPath}/part/thistory/${part.partNumber}.html">View
							Transaction History</a></td>
				</tr>
			</c:forEach>
		</table>
		</div>
		</div>
		</div>
	</c:if>

</body>
</html>