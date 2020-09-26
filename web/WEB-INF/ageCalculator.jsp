<%-- 
    Document   : ageCalculator
    Created on : Sep 24, 2020, 9:29:03 AM
    Author     : Joel Wood
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <br>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="number" name="age_input" value="${age}">
            <br/><br/>
            <input type="submit" name="submit" value="Age next birthday"
              <br/><br/>
            <p>${message}</p>
        </form>
        <a href="arithmetic"> Arithmetic Calculator</a>
    </body>
</html>
