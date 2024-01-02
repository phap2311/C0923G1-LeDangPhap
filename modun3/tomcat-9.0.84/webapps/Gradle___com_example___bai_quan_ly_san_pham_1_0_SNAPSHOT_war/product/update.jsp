<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/12/2023
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update new product</title>
</head>
<body>
<h1>Update product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
<fieldset>
    <legend>Product information</legend>
    <table>
        <tr>
            <td>Name Product: </td>
            <td><input type="text" name="nameProduct" id="nameProduct" value="${requestScope["product"].getNameProduct()}"></td>
        </tr>
        <tr>
            <td>Price Product: </td>
            <td><input type="text" name="priceProduct" id="priceProduct" value="${requestScope["product"].getPriceProduct()}"></td>
        </tr>
        <tr>
            <td>Description: </td>
            <td><input type="text" name="description" id="description" value="${requestScope["product"].getDescription()}"></td>
        </tr>
        <tr>
            <td>Company: </td>
            <td><input type="text" name="company" id="company" value="${requestScope["product"].getCompany()}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update product"></td>
        </tr>
    </table>
</fieldset>
</form>
</body>
</html>
