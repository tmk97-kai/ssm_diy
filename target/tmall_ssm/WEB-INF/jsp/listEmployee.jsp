<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>age</td>
        <td>name</td>
        <td>sex</td>
        <td>address</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.age}</td>
            <td>${c.name}</td>
            <td>${c.sex}</td>
            <td>${c.address}</td>

        </tr>
    </c:forEach>
</table>