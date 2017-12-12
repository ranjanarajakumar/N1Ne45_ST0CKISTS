<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="decorator" content="userLayout" />
<title>Insert title here</title>
</head>
<body>

	<div class="control-group">
        <label class="control-label" for="date01">Start Date</label>
            <div class="controls">
                 <input type="text" class="input-xlarge datepicker" id="date01" value="02/16/12">
        </div>
        <label class="control-label" for="date01">End Date</label>
            <div class="controls">
                 <input type="text" class="input-xlarge datepicker" id="date01" value="02/16/12">
      <p class="help-block">Please enter search period</p>
      <input type="submit" value ="View"/>
        </div>       
  </div>
  

	<hr>
	 <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Transaction History</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
			<table class="table">
		<tr>
		<th> # </th>
		<th> Part Number </th>
		<th> Description </th>
		<th> Color </th>
		<th> Manufacturer </th>
		<th>Details</th>
		</tr>
		
		<c:forEach var="orders" varStatus="idx" items="${oList}">
		<tr>
		<td> # </td>
		<td> ${orders.orderID} </td>
		<td> ${orders.orderEmployeeID} </td>
		<td> ${orders.orderSupplierID} </td>
		<td> ${orders.orderDate} </td>
		<td> ${orders.orderRequiredDate} </td>
		<td> ${orders.orderArrivalDate} </td>
		</tr>
		</c:forEach>
		</table>
		</div>
		</div>
		</div>

</body>
</html>