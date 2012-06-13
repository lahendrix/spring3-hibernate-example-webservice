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

        <form:form action="add.htm" commandName="dog">
            <table>
                <tr>
                    <td>User Name :</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Password :</td>
                    <td><form:password path="password" /></td>
                </tr>
                <tr>
                    <td>Gender :</td>
                    <td><form:radiobutton path="gender" value="M" label="M" />
                    <form:radiobutton path="gender" value="F" label="F" /></td>
                </tr>
                <tr>
                    <td>Country :</td>
                    <td><form:select path="country">
                    <form:option value="0" label="Select" />
                    <form:option value="India" label="India" />
                    <form:option value="USA" label="USA" />
                    <form:option value="UK" label="UK" />
                    </form:select></td>
                </tr>
                <tr>
                    <td>About you :</td>
                    <td><form:textarea path="aboutYou" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><form:checkbox path="mailingList"
                    label="Would you like to join our mailinglist?" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Register"></td>
                </tr>
            </table>
        </form:form>
        <c:if test="${fn:length(dogList) > 0}">
        <table cellpadding="5">
            <tr class="even">
                <th>Name</th>
                <th>Gender</th>
                <th>Country</th>
                <th>About You</th>
            </tr>
            <c:forEach items="${dogList}" var="dog" varStatus="status">
            <tr class="<c:if test="${status.count % 2 == 0}">even</c:if>">
                <td>${dog.name}</td>
                <td>${dog.gender}</td>
                <td>${dog.country}</td>
                <td>${dog.aboutYou}</td>
            </tr>
            </c:forEach>
        </table>
        </c:if>
    </body>
</html>
