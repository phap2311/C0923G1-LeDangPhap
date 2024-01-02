<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/1/2024
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
</head>
<body>
<h1>Create new product</h1>

<p>
    <a href="/user">Back to product list</a>
</p>
<form action="/user?action=create"  method="post">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Id: </td>
                <td><input type="text" name="userId" ></td>
            </tr>
            <tr>
                <td>Name User: </td>
                <td><input type="text" name="userName "></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" ></td>
            </tr>
            <tr>
                <td>Country: </td>
                <td><input type="text" name="country" ></td>
            </tr>

            <tr>
                <td><button class="btn btn-success" role="button" type="submit">Create</button></td>

<%--                <td><input type="submit" value="Create "></td>--%>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
