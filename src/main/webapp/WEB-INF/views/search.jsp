<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"
>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="decorator" content="default" />
<title>Insert title here</title>
</head>
<body>
<div class="navbar navbar-inner block-header">
           <div class="muted pull-left">Browse Catalog</div>
    </div>
	<div class="block-content collapse in">
        <div class="span12">
        <!-- Search By PartNumber -->
             <form class="form-horizontal" role="form"  method="post" action="${pageContext.request.contextPath}/part/search/">
                 <fieldset>
                 <legend>Search for the part</legend>
				 <div class="control-group">
                     <label class="control-label" for="focusedInput">PartNumber</label>
                        <div class="controls">
                            <input class="input-xlarge focused" id="txtPartNumber" name="txtPartNumber" placeholder="PartNumber"type="text" value="">
                            <button id="searchByPartNumber"><spring:message code="button.searchByPartNumber"/></button>
                        </div>
                        
                        <label class="control-label" for="focusedInput">PartDescription</label>
                        <div class="controls">
                            <input class="input-xlarge focused" id="txtPartDescription" name="txtPartDescription" placeholder="Description"type="text" value="">
                            <button id="searchByPartDescription"><spring:message code="button.searchByPartDescription"/></button>
                        </div>
                        
                         <label class="control-label" for="focusedInput">PartColor</label>
                        <div class="controls">
                            <input class="input-xlarge focused" id="txtPartColor" name="txtPartColor" placeholder="Color"type="text" value="">
                            <button id="searchByPartColor"><spring:message code="button.searchByPartColor"/></button>
                        </div>
                        <label class="control-label" for="focusedInput">PartManufacturer</label>
                        <div class="controls">
                            <input class="input-xlarge focused" id="txtPartManufacturer" name="txtPartManufacturer" placeholder="Manufacturer"type="text" value="">
                            <button id="searchByPartManufacturer"><spring:message code="button.searchByPartManufacturer"/></button>
                        </div>                        
                 </div>
				 </fieldset>
			</form>
					                
			</div>
			</div>
	
    <form:form method="GET" modelAttribute="part" >	
	<c:if test="${not empty partList}">
    <table>
        <tr>
            <th><spring:message code="part.partNumber"/></th>
            <th><spring:message code="part.partDescription"/></th>
            <th><spring:message code="part.partColor" /></th>
            <th><spring:message code="part.Manufacturer" /></th>
        </tr>
        <c:forEach items="${partList}" var="part">
            <tr>
                <td align="center"><a href="<c:url value="/part/search/${part.partNumber}"/>">${part.partName}</a></td>
                <td align="center">${part.partNumber}</td>
                <td align="center">${part.partDescription}</td>
                <td align="center">${part.partColor}</td>
                <td align="center">${part.partManufacturer}</td>
                <td align="center"><a href="${pageContext.request.contextPath}/part/details/${part.partNumber}">View Details</a></td>
				<td align="center"><a href="${pageContext.request.contextPath}/part/thistory/${part.partNumber}">View Transaction History</a></td>
            </tr>
        </c:forEach>
    </table>
    </c:if>
   </form:form>

</body>
</html>