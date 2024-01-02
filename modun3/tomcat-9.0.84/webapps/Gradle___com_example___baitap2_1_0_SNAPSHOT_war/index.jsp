<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Simple Calculator</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form method="post" action="/calculate">
    <legend>Calculator</legend>
    <table>
        <tr>
            <td>First operand</td>
          <td><input name="first-operand" type="text"/></td>
        </tr>
        <tr>
            <td>Operator</td>
            <td>
                <select name="operator">
                    <option value="+">Addition</option>
                    <option value="-">Addition</option>
                    <option value="*">Addition</option>
                    <option value="/">Addition</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Second operand</td>
            <td><input name="secondOperand" type="text" ></td>
        </tr>
        <tr>
            <td>
                <button type="submit" value="Calculate">calculate</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>