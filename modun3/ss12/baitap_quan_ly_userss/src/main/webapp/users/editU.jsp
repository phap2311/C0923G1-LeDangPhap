<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/1/2024
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

<link rel="stylesheet" href="/static/css/bootstrap.css">
</head>
<body>
<div class="container">

    <div class="row justify-content-center mt-4">
        <form class="col-md-6" action="/user?action=create" method="post">
            <h1 class="">Create User</h1>
            <div class="form-group">
                <label for="txtId">ID</label>
                <input type="text" class="form-control" name="userId" id="txtId">
            </div>
            <div class="form-group">
                <label for="txtName">User Name</label>
                <input type="text" class="form-control" name="userName" id="txtName">
            </div>



            <div class="form-group">
                <label for="txtEmail">Email</label>
                <input type="text" class="form-control" name="email" id="txtEmail">
            </div>
            <div class="form-group">
                <label for="txtCountry">Country</label>
                <input type="text" class="form-control" name="country" id="txtCountry">
            </div>
            <div class="form-group mt-2">
                <button class="btn btn-success" role="button" type="submit">Create</button>
                <button class="btn btn-warning" role="button">Cancel</button>
            </div>
        </form>

    </div>
</div>
</body>
</html>
