<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/12/2023
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product detail</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name Product: </td>
        <td>${requestScope["product"].getNameProduct()}></td>
    </tr>
    <tr>
        <td>Price Product: </td>
        <td>${requestScope["product"].getPriceProduct()}></td>
    </tr>
    <tr>
        <td>Description: </td>
        <td>${requestScope["product"].getDescription()}></td>
    </tr>
    <tr>
        <td>Company: </td>
        <td>${requestScope["product"].getCompany()}></td>
    </tr>

</table>
</body>
</html>
