<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/12/2023
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new product</h1>
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
               <td><input type="text" name="nameProduct" id="nameProduct"></td>
           </tr>
           <tr>
               <td>Price Product: </td>
               <td><input type="text" name="priceProduct" id="priceProduct"></td>
           </tr>
           <tr>
               <td>Description Product: </td>
               <td><input type="text" name="description" id="description"></td>
           </tr>
           <tr>
               <td>Company: </td>
               <td><input type="text" name="company" id="company"></td>
           </tr>
       </table>
   </fieldset>
</form>
</body>
</html>
