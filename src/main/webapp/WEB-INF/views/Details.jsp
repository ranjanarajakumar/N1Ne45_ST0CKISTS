<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="decorator" content="userLayout" />
<title>Insert title here</title>
</head>
<body>

	<form:form>
	<body>
	<div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Part Details</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
	<table class="table">
	<tr><td>Part Number: </td><td>${part.partNumber}</td></tr>
	<tr><td>Description: </td><td>${part.partDescription}</td></tr>
	<tr><td>Color: </td><td>${part.partColor}</td></tr>
	<tr><td>Manufacturer: </td><td>${part.partManufacturer}</td></tr>
	</table><br>
	<form action="${pageContext.request.contextPath}/part/edit/${part.getPartNumber()}">
	<input type="submit" value ="Record Usage"/>
	</form>
	</div>
	</div>
	</div>
	
	</body>
	</form:form>
</body>
</html>