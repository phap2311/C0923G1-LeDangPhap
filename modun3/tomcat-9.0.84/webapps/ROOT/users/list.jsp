<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/12/2023
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
            integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
            integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
            crossorigin="anonymous"></script>
</head>
<body>
<h1>User List</h1>
<p><a href="user?action=create" role="button">Create</a> </p>
<form action="/user?action=searchCountry" method="post">
    <input type="text" id="country" name="country">
    <input type="submit" value="Tìm kiếm">
</form>
<c:if test="${ms != null}">
    <div class="alert alert-success" role="alert">
        <strong>${ms}</strong>
    </div>
</c:if>
<table class="table">
<thead>
    <tr>
        <th>Id</th>
        <th>Name User</th>
        <th>Email</th>
        <th>Country</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
</thead>
    <tbody>
    <c:forEach items="${userList}" var="user" varStatus="loop">
        <tr>

            <td>${user.id}</td>
            <td>${user.nameUser}</td>
            <td>${user.email}</td>
            <td>${user.country}</td>
            <td><a href="user?action=edit&id=${user.id}">edit</a></td>
            <td><a href="user?action=delete&id=${user.id}">delete</a></td>

            </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
