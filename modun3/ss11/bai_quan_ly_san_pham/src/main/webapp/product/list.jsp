<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/12/2023
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>

<h1>product List</h1>
<p>
    <a href="product?action=create">Create new product</a>
</p>



<table border="1px">
    <tr>
        <td>Id</td>
        <td>Name Product</td>
        <td>Price Product</td>
        <td>Description Product</td>
        <td>Company</td>
        <td>Detail product</td>
        <td>Update</td>
        <td>Delete</td>

    </tr>
    <tbody>
    <c:forEach items = "${productList}" var = "product">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getNameProduct()}</td>
            <td>${product.getPriceProduct()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getCompany()}</td>
            <td><a href="/product?action=showDetail&id=${product.id}">detail</a></td>
            <td><a href="/product?action=update&id=${product.id}">update</a></td>
            <td><a href="/product?action=delete&id=${product.id}">delete</a></td>


        </tr>
       
    </c:forEach>
    </tbody>
</table>
<button><a href="/product?action=searchName">Search</a> </button>
</body>
</html>
