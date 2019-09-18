<%@ page language="java" import="java.lang.*,java.util.*,javax.servlet.*,dAO.EmpDetailsDAO,bean.EmpDetailsBO" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body>
<a href="LogoutEmp" target="Target">Logout</a>
<form action="EditDetails.jsp">

<%
String eid=(String)session.getAttribute("EMP_ID");
int Empid = Integer.parseInt(eid);
EmpDetailsDAO ED= new EmpDetailsDAO();
EmpDetailsBO BO1 = new EmpDetailsBO();
BO1=ED.getEmpDetailsById(Empid);

%> 
<div align="center">
<caption><h2>Personal Details</h2></caption>
<table border="1" cellpadding="5" class="table container">
    
    <tr>
        <th>EMPLOYEE ID</th>
        <td><%=BO1.getEMP_ID() %></td>
    </tr>
    <tr>
        <th>EMPLOYEE NAME</th>
        <td><%=BO1.getEMP_NAME() %></td>
    </tr>
    <tr>
        <th>MOBILE NUMBER</th>
        <td><%=BO1.getMOBILE_NUMBER() %></td>
    </tr>
    <tr>
        <th>EMAIL</th>
        <td><%=BO1.getEMP_EMAIL() %></td>
    </tr>
    <tr>
        <th>DATE OF BIRTH</th>
        <td><%=BO1.getDOB() %></td>
    </tr>
    <tr>
        <th>GENDER</th>
        <td><%=BO1.getGENDER() %></td>
    </tr>
    <tr>
        <th>PAN NUMBER</th>
        <td><%=BO1.getPAN_NUMBER() %></td>
    </tr>
    <tr>
        <th>ADHAR NUMBER</th>
        <td><%=BO1.getADHAR_NUMBER() %></td>
    </tr>
    <tr>
        <th>BANK ACCOUNT NUMBER</th>
        <td><%=BO1.getBANK_ACNO() %></td>
    </tr>
    <tr>
        <th>DATE OF JOIN</th>
        <td><%=BO1.getDOJ() %></td>
    </tr>
    <tr>
        <th>DEPARTMENT</th>
        <td><%=BO1.getDEPARTMENT() %></td>
    </tr>
    <tr>
        <th>DESIGNATION</th>
        <td><%=BO1.getDESIGNATION() %></td>
    </tr>
    <tr>
        <th>MONTHLY SALARY</th>
        <td><%=BO1.getSALARY() %></td>
    </tr>
    <tr>
        <th>ANNUAL SALARY</th>
        <td><%=BO1.getSALARY()*12 %></td>
    </tr>
    <tr>
        <th>EMPLOYEE ADDRESS</th>
        <td><%=BO1.getEMP_ADDRESS()%></td>
    </tr>
    <tr>
        <th>JOB LOCATION</th>
        <td><%=BO1.getJOB_LOCATION() %></td>
    </tr>
</table>
</div>

<p align="center">
  <input  type="submit" value="Edit">
  </p>
</form>
</body>
</html>
