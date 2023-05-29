<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="green">${rel}</font>
<font color="red">${msg}</font>
<font color="red">${mo}</font>
  <form action="mod" method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><input type="text" name="addr"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email"></td>
        </tr>
        <tr>
            <td>Phno:</td>
            <td><input type="text" name="phno"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="pwd"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Submit"></td>
        </tr>
    </table>
  </form>
</body>
</html>