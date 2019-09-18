<%@ page language="java" import="java.lang.*,java.util.*,dAO.*,bean.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
  body{
	margin-left: 25%;
    margin-top: 15%;
   }
   .selectbox{
	margin-top: 33px;
    margin-left: 8px;
}
</style>
<body>
<a href="LogoutEmp" target="Target">Logout</a>
<form action="InternetServlet" method="post">
<%
String eid =(String)session.getAttribute("EMP_ID");
int Empid = Integer.parseInt(eid);

%>
<h2 ALIGN="CENTER">Internet Details</h2>
<table border="0">
<tbody>
	<tr>
     <th><label>Emp ID:</label></th>
 	   <td><input type="number" name="EmpId" value="<%= Empid %>" readonly></td>
    </tr>
    <tr>
    	<th><label>Enter From Date:</label></th>
  		 <td><input type="date" name="FromDate"></td>
	</tr>
 	<tr>
    	<th><label>Enter To Date:</label></th>
  		 <td><input name="ToDate" type="date"></td>
	</tr>
	<tr>
    	<th><label>Internet:</label></th>
         <td><input name="Internet" type="number"></td>
	</tr>
</tbody>
</table>
<p align="center">

  <center><input  type="submit" value="Submit"></center>
  
</form>

</body>
</html>



<%-- <%@ page language="java" import="java.lang.*,java.util.*,dAO.*,bean.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
  body{
	margin-left: 25%;
    margin-top: 15%;
   }
   .selectbox{
	margin-top: 33px;
    margin-left: 8px;
}
</style>
<body>



<% 
String eid=(String)session.getAttribute("EMP_ID");
int Empid = Integer.parseInt(eid);
EmpDetailsDAO ED= new EmpDetailsDAO();
EmpDetailsBO BO1 = new EmpDetailsBO();
BO1=ED.getEmpDetailsById(Empid);
%>

<h2 ALIGN="CENTER">Internet Details</h2>
<table border="0">
<tbody>
	<tr>
     <th><label>Emp ID:</label></th>
 	   <td><input type="number" name="EmpId" value="<%= Empid %>" readonly></td>
    </tr>
    <tr>
    	<th><label>Enter From Date:</label></th>
  		 <td><input name="From" type="date"></td>
	</tr>
 	<tr>
    	<th><label>Enter To Date:</label></th>
  		 <td><input name="To" type="date"></td>
	</tr>
	<tr>
    	<th><label>Internet:</label></th>
         <td><input name="Internet" type="number"></td>
	</tr>
</tbody>
</table>
<p align="center">
<form action="InternetServlet" method="post">
  <center><input  type="submit" value="Submit"></center>
  
</form>


</body>
</html> --%>

