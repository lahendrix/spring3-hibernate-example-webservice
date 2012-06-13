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
        <title>Registration Page</title>
    </head>
    <body>

        <form:form action="add.htm" commandName="data">
            <table>
                <tr>
                    <td>Email :</td>
                    <td><form:input path="email" /></td>
                </tr>
 
                <tr>
                    <td>Data :</td>
                    <td><form:textarea path="data" /></td>
                </tr>
              
                <tr>
                    <td colspan="2"><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form:form>
        <c:if test="${fn:length(dataList) > 0}">
        <table cellpadding="5">
            <tr class="even">
                <th>Email</th>
                <th>About You</th>
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
