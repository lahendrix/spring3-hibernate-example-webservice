<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <style type="text/css">
            .even {
                background-color: silver;
            }
        </style>
        <title>Data</title>
    </head>
    <body>
        <c:if test="${fn:length(dataList) > 0}">
        <table cellpadding="5">
            <tr class="even">
                <th>Email</th>
                <th>Data</th>
            </tr>
            <c:forEach items="${dataList}" var="data" varStatus="status">
            <tr class="<c:if test="${status.count % 2 == 0}">even</c:if>">
                <td>${data.email}</td>
                <td>${data.data}</td>
            </tr>
            </c:forEach>
        </table>
        </c:if>
    </body>
</html>
