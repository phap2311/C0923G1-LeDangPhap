<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>

</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="/calculator" method="post">
    <label>Product Description</label>
    <input type="text" name="ProductDescription" placeholder="PRODUCTDESCRIOTION">
    <label>List Price:</label>
    <input type="text" name="listPrice" placeholder="lISTPRICE" value="0">
    <label>Discount Percent: </label>
    <input type="text" name="discountPercent" placeholder="DISCOUNTPERCENT" value="0">
    <label>Discount Amount</label>
    <input type="submit" id="submit" value="discountAmount">

</form>

</body>
</html>