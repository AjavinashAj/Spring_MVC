<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color='green'>${avi}</font>
  <font color='green'>${msg}</font>
  <font color='green'>${sst}</font>
  <font color='green'>${ms}</font>
  <h3> User Form</h3>
  <form action="abc" method="post">
   <table>
         <tr>
             <td>Name:</td>
             <td><input type="text" name="name"/></td>
         </tr>
         <tr>
             <td> Email:</td>
             <td><input type="text" name="email"/><td>
             
         </tr>
         <tr>
             <td>PhNo:</td>
             <td><input type="number" name="phno"/>
         </tr>
         <tr>
             <td></td>
             <td><input type="submit" value="Submit"/></td>
         </tr>
   </table>
  </form>
</body>
</html>