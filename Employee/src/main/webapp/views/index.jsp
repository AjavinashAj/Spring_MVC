<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

div{
    background: olivedrab;
    width: auto;
    height: auto;
    margin: auto;
    padding: 25px;
    border-radius: 15px;
    box-shadow: 1px 3px 3px blue transparent;
    color: blue;
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<div bgcolor="yellow">
<font color="black">${msg}</font>
<h1>Employee Form</h1>
<form action="emp" method="post">
      <table>
      
             <tr>
                 <td>EmpId:</td>
                 <td><input type="number" name="id"/></td>
             </tr>
             <tr>
                 <td>EmpName:</td>
                 <td><input type="text" name="name"/></td>
                 
             </tr>
             <tr>
                 <td>Designation:</td>
                 <td><input type="text" name="desig"/>
             </tr>
             <tr>
                 <td>Salary</td>
                 <td><input type="text" name="sal"></td>
             </tr>
             <tr>
                 <td></td>
                 <td><input type="submit" value="SUBMIT"></td>
             </tr>
      </table>
</form>
</div>
</body>
</html>