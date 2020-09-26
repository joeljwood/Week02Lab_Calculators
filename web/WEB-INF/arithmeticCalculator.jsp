<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 24, 2020, 9:29:32 AM
    Author     : Joel Wood
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <br>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="number" name="first_value" value="${firstValue}">
            <br>
            <label>Second:</label>
            <input type="number" name="second_value" value="${secondValue}">
            <br>
            <input type="submit" name="addition" value="+"
            <br>
            <input type="submit" name="subtraction" value="-"
            <br>
            <input type="submit" name="multiplication" value="*"
             <br>
            <input type="submit" name="modulus" value="%"
        </form>
            <br>
        
        <p>Result: ${message}</p>
        <a href="age"> Age Calculator</a>
        
    </body>
</html>
