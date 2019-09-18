<%@ page language="java" import="java.lang.*,java.util.*,dAO.*,bean.*" contentType="text/html; charset=ISO-8859-1"
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
<% 
String eid=(String)session.getAttribute("EMP_ID");
int Empid = Integer.parseInt(eid);
EmpDetailsDAO ED= new EmpDetailsDAO();
EmpDetailsBO BO1 = new EmpDetailsBO();
BO1=ED.getEmpDetailsById(Empid);
%>
<h2 ALIGN="CENTER">Edit Details</h2>

<form action="EditdetailsServlet" method="post">
<table border="0" align="center" class="table container">
<tbody>
<%--  <tr>
        <th><label for="Employee Id">Employee Id: </label></th>
        <td><%=BO1.getEMP_ID() %></td>
    </tr> --%>
   <tr>
        <th><label for="Employee Id">Employee Id: </label></th>
        <td><input type="number" name="EmpId" value="<%=BO1.getEMP_ID() %>" readonly></td>
    </tr>
    <tr>
        <th><label for="Employee Name">Employee Name: </label></th>
        <td><input type="text" name="Employee Name" value="<%=BO1.getEMP_NAME() %>" readonly></td>
    </tr>
     <tr>
        <th><label for="Mobile Number">Mobile Number: </label></th>
        <td><input id="Mobile Number" maxlength="10" name="Mobile Number" type="text" /></td>
    </tr>

    <tr>
        <th><label for="Email Id">Email Id: </label></th>
        <td><input id="Email Id" maxlength="50" name="Email Id" type="text" value="<%=BO1.getEMP_EMAIL() %>" readonly/></td>
    </tr>
    <tr>
        <th><label for="Date of Birth">Date of Birth: </label></th>
        <td><input type="date" name="Date of Birth" value="<%=BO1.getDOB() %>" readonly></td>
        <%-- <td><%=BO1.getDOB() %></td> --%>
    </tr>
    <tr>
        <th><label for="Gender">Gender: </label></th>
        <td><input id="Gender" maxlength="10" name="Gender" type="text" /></td>
    </tr>
    <tr>
        <th><label for="PAN Number">PAN Number: </label></th>
        <td><input id="PAN Number" maxlength="20" name="PAN Number" type="text" /></td>
    </tr>
    <tr>
        <th><label for="ADHAR Number">ADHAR Number: </label></th>
        <td><input id="ADHAR Number" maxlength="20" name="ADHAR Number" type="text" /></td>
    </tr>
    <tr>
        <th><label for="Bank A/C no">Bank A/C no: </label></th>
        <td><input id="Bank A/C no" maxlength="20" name="Bank A/C no" type="text" value="<%=BO1.getBANK_ACNO() %>" readonly /></td>
    </tr>
    <tr>
        <th><label for="Date of Join">Date of Join: </label></th>
        <td><input type="date" name="Date of Join" value="<%=BO1.getDOJ() %>" readonly></td>
    </tr>
    <tr>
        <th><label for="Department">Department: </label></th>
        <td><input type="text" name="Department" value="<%=BO1.getDEPARTMENT()%>" readonly></td>
    </tr>
    <tr>
        <th><label for="Designation">Designation: </label></th>
        <td><input type="text" name="Designation" value="<%=BO1.getDESIGNATION() %>" readonly></td>
    </tr>
    <tr>
        <th><label for="Monthly Salary">Monthly Salary: </label></th>
        <td><input type="number" name="Monthly Salary" value="<%=BO1.getSALARY() %>" readonly></td>
    </tr>
    <tr>
        <th><label for="Annual Salary">Annual Salary: </label></th>
        <td><input type="number" name="Annual Salary" value="<%=BO1.getSALARY()*12 %>" readonly></td>
    </tr>
    <tr>
        <th><label for="Employee Address">Employee Address: </label></th>
        <td><input id="Employee Address" maxlength="20" name="Employee Address" type="text" /></td>
    </tr>
    <tr>
        <th><label for="Job Location">Job Location: </label></th>
        <td><input type="text" name="Job Location" value="<%=BO1.getJOB_LOCATION() %>" readonly></td>
    </tr>

</tbody>
</table>
 <p align="center">
<form  action="EditdetailsServlet" method="post">
  <input  type="submit" value="Submit">
  </p> 
  </form>
</body>
</html>