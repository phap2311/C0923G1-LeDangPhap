<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
<head>
    <title>Customer List</title>
    <style>
        h1{
            text-align: left;
        }
        table{

            border: darkcyan;
        }
        th, td {
            border-bottom: 1px solid;
            text-align: left;
        }
    </style>

</head>
<body>

<h1>Danh sách khách hàng</h1>
<table>

    <tr>
        <th >Tên</th>
        <th >Ngày sinh</th>
        <th >Địa chỉ</th>
        <th >Hình ảnh</th>
    </tr>
<c:forEach items="${ds}" var="i">
       <tr>
           <td>${i.getNameCustomer()}</td>
           <td>${i.getBirthday()}</td>
           <td>${i.getAddress()}</td>
           <td>
               <img src="${i.getCusImage()}"  width="50px" height="50px">
           </td>
       </tr>
</c:forEach>
</table>



</body>
</html>