<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/1/2024
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user?action=delete&id=${user.id}" method="post">
    <table>

        <tr>
            <td>Name User: </td>
            <td><input type="text" name="nameUser" value="${user.getNameUser()}"> </td>
        </tr>
        <tr>
            <td>Email: </td>
            <td><input type="text" name="email" value="${user.getEmail()}"> </td>
        </tr>
        <tr>
            <td>Country: </td>
            <td><input type="text" name="country" value="${user.getCountry()}"> </td>
        </tr>
        <tr>
            <td><input type="submit" value="delete"> </td>
        </tr>
    </table>
</form>
</body>
</html>
