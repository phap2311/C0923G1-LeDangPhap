<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/12/2023
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>productlist</h1>
<p>
    <a href="/product">Back to product list</a>

</p>
<table border="1px">
    <tr>
        <td>Id</td>
        <td>Name Product</td>
        <td>Price Product</td>
        <td>Description Product</td>
        <td>Company</td>
    </tr>
    <tr>
        <td>${product.getId()}</td>
        <td>${product.getNameProduct()}</td>
        <td>${product.getPriceProduct()}</td>
        <td>${product.getDescription()}</td>
        <td>${product.getCompany()}</td>
    </tr>


</table>
</body>
</html>
