<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/1/2024
  Time: 10:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Kết quả tìm kiếm cho Country: ${country}</h3>
<table border="1px">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name User</th>
        <th>Email</th>
        <th>Country</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${userList}" var="user" varStatus="loop">
        <tr>

            <td>${user.id}</td>
            <td>${user.nameUser}</td>
            <td>${user.email}</td>
            <td>${user.country}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
