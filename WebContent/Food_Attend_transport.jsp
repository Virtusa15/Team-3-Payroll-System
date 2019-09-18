<%@ page language="java" import="java.lang.*,java.util.*,dAO.*,bean.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<style>
  body{
	margin-left: 15%;
    margin-top: 10%;
   }
   .selectbox{
	margin-top: 33px;
    margin-left: 8px;
}
</style>
<body>
<a href="LogoutEmp" target="Target">Logout</a>
<form  action="ReportServlet" method="post">
<% 
String eid=(String)session.getAttribute("EMP_ID");
int Empid = Integer.parseInt(eid);
%>

<h2 ALIGN="CENTER">Food, Attendance, Transport Details</h2>
<table border="0">
<tbody>
	<tr>
        <th><label> Employee Id: </label></th>
        <td><input type="number" value="<%=Empid %>" name="EmpId" disabled></td>
    </tr>
    <tr>
    	<th><label> From Date: </label></th>
		 <td><input type="date" name="FromDate"></td>
	</tr>
 	<tr>
    	<th><label> To Date: </label></th>
		<td><input type="date" name="ToDate"></td>
	</tr>
	<tr>
    	<th><label> Attedance: </label></th>
		<td><select name="Attendance">
				<option value="select option">Select option</option>
  				<option value="Present">Present</option>
  				<option value="Absent">Absent</option>
			</select></td>
	</tr>
	<tr>
    	<th><label> Food: </label></th>
		<td><select name="Food">
				<option value="select option">Select option</option>
  				<option value="yes">yes</option>
  				<option value="no">no</option>
			</select></td>
	</tr>
	<tr>
    	<th><label> Transport: </label></th>
		<td><input type="number" name="Transport"></td>
	</tr>
</tbody>
</table>
<p align="center">

  <center><input  type="submit" value="Submit"></center>
  </p> 
  </form>


</body>
</html>