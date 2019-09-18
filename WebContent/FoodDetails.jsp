<%@ page language="java" import="java.lang.*,java.util.*,javax.servlet.*,dAO.*,bean.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<a href="LogoutEmp" target="Target">Logout</a>
<%
String eid=(String)session.getAttribute("EMP_ID");
int Empid = Integer.parseInt(eid);

EmpDetailsDAO ED= new EmpDetailsDAO();
EmpDetailsBO BO1 = new EmpDetailsBO();
BO1=ED.getEmpDetailsById(Empid);

PayslipDetailsDAO PD1=new PayslipDetailsDAO();
Food_Lop FP1=new Food_Lop();

//ReportsDAO RD1=new ReportsDAO();
/* FP1=PD1.getReportsbyId(Empid); */

FP1=PD1.getFoodLopDetbyId(Empid);
%>

<div align="center">
<caption><h2>Food Bill Details</h2></caption>
<table id="Food" border="1" cellpadding="5" class="table container">
    
    <tr>
        <th>Employee ID</th>
        <td><%=BO1.getEMP_ID() %></td>
    </tr>
    <tr>
        <th>Employee Name</th>
        <td><%=BO1.getEMP_NAME() %></td>
    </tr>
    <tr>
        <th>Food Count</th>
        <td><%=FP1.getFood() %></td>
    </tr>
    <tr>
        <th>Food Bill</th>
        <td><%=FP1.getFood()*50 %></td>
    </tr>
</table>
</div><br><br>

</body>
</html>