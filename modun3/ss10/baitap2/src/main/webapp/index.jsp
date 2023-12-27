<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Simple Calculator</h1>
<br/>

<form action="calculate" method="post">
    <legend>Calculator</legend>
    <table>
        <tr>
            <td>First operand</td>
            <td><input name="firstOperand" type="text"/></td>
        </tr>
        <tr>
            <td>Operator</td>
            <td>
                <select name="operator">
                    <option value="+">Addition</option>
                    <option value="-">Subtraction</option>
                    <option value="*">Multiplication</option>
                    <option value="/">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Second operand</td>
            <td><input name="secondOperand" type="text"></td>
        </tr>
        <tr>
            <td>
                <button>calculate</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>