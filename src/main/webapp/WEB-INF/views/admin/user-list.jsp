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
<h3> User List Page </h3>
	<div class="block">
		<em><a href="${pageContext.request.contextPath}/admin/home/registration"> Add New User</a></em>                            	
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">User List</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
	<c:if test="${fn:length(userList) gt 0 }">
	<table class="table table-hover">
	<thead>
	<tr class="listHeading">
	<th>User ID </th>
	<th>User Name</th>
	<th>User LastName </th>
	<th>User Email</th>
	<th>Active</th>
	<th><spring:message code="caption.delete"/></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="user" items="${userList}">
	<tr class="listRecord">
	<td>${user.id}</td>
	<td>${user.username}</td>
	<td>${user.lastName}</td>
	<td>${user.email}</td>
	<td>${user.active}</td>
	<td><a
	     href="${pageContext.request.contextPath}/admin/home/delete/${user.getId()}.html">Delete</a> </td> 
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