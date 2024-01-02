<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/12/2023
  Time: 8:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<h1>Delete Customer</h1>
<p>
    <a href="/product">Back to Product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
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
            <tr>
                <td></td>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/product">Back to product list</a> </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
