<%@ page language="java" import="java.lang.*,java.util.*,java.sql.*,dAO.*,bean.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<a href="LogoutEmp" target="Target">Logout</a>
<%
String eid=(String)session.getAttribute("EMP_ID");
int Empid = Integer.parseInt(eid);
/* out.println(Empid); */

EmpDetailsDAO ED= new EmpDetailsDAO();
EmpDetailsBO BO1 = new EmpDetailsBO();

BO1=ED.getEmpDetailsById(Empid);

String Deg=BO1.getDESIGNATION();

SalaryDetailsDAO SD = new SalaryDetailsDAO();
SalaryDetailsBO SD1 = new SalaryDetailsBO();
SD1=SD.getSalaryDetails(Deg,Empid);

PayslipDetailsDAO PD1=new PayslipDetailsDAO();
Food_Lop FP1=new Food_Lop();

FP1=PD1.getFoodLopDetbyId(Empid);

/* out.println("welcome,");
out.println(BO1.getEMP_NAME());
  */
 double earnings=SD1.getBASIC_PAY()+SD1.getSPECIAL_ALLOWANCE()+SD1.getBONUS();
 double deductions=SD1.getPF()+SD1.getESIC()+SD1.getTax()+(FP1.getFood()*50)+(FP1.getAttendance()*300);
%>
<section id="tblCustomers" class="table container">
<center><caption><h2>PaySlip</h2></caption></center>
<table  border="1" cellpadding="5" class="table ">
    
    <tr>
       <tr>
        <th s>Employee ID</th>
        <td><%=BO1.getEMP_ID() %></td>
      
          <th >Employee Name</th>
        <td><%=BO1.getEMP_NAME() %></td>
          <th></th>
        <td>   </td>
         <tr>
        <th>Department</th>
        <td><%=BO1.getDEPARTMENT() %></td>
        <th>PF No.</th>
        <td>   </td>
          <th></th>
        <td>   </td>
        </tr>
        
         <tr>
        <th>Location</th>
        <td><%=BO1.getJOB_LOCATION() %></td>
        <th>Designation</th>
        <td> <%=BO1.getDESIGNATION() %>  </td>
         <th>ESI No.</th>
        <td>   </td>
        </tr>
        
         <tr>
        <th>Date of Birth</th>
        <td><%=BO1.getDOB() %></td>
        <th>Bank A/c No</th>
        <td> <%=BO1.getBANK_ACNO() %>  </td>
         <th>PAN No.</th>
        <td><%=BO1.getPAN_NUMBER() %>   </td>
        </tr>
        
        <tr>
        <th>Date of Joining</th>
        <td><%=BO1.getDOJ() %></td>
        <th>Gender</th>
        <td> <%=BO1.getGENDER() %> </td>
         <th>EPS No.</th>
        <td>  </td>
        </tr>
        
        <tr>
        <th>UAN</th>
        <td></td>
         <th>Global Date of Joining</th>
        <td><%=BO1.getDOJ() %></td>
         <th></th>
        <td></td>
        </tr>
    </table>
    <table border="1" cellpadding="5" class="table ">
     <tr>
        
         <th>Earnings</th>
          <th>Amount</th>
          <th>YTD</th>
          <th>Deductions</th>
         <th>Amount</th>
         <th>YTD</th>
       
        </tr>
        <tr>
        <td>Basic</td>
         <td><%=SD1.getBASIC_PAY() %></td>
         <td><%=SD1.getBASIC_PAY() %></td>
          <td>Provident Fund</td>
         <td><%=SD1.getPF() %></td>
         <td><%=SD1.getPF() %></td>
       
        </tr>
        
          <tr>
        <td>Special Allowance</td>
         <td><%=SD1.getSPECIAL_ALLOWANCE() %></td>
         <td><%=SD1.getSPECIAL_ALLOWANCE() %></td>
          <td>ESI</td>
         <td><%=SD1.getESIC() %></td>
         <td><%=SD1.getESIC() %></td>
       
        </tr>
         <tr>
        <td>Bonus</td>
         <td><%=SD1.getBONUS() %></td>
         <td><%=SD1.getBONUS() %></td>
          <td>Professional Tax</td>
         <td><%=SD1.getTax() %></td>
         <td><%=SD1.getTax() %></td>
       
        </tr>
         <tr>
        <td>-</td>
         <td>-</td>
         <td>-</td> 
          <td>LOP Loss</td>
         <td><%=FP1.getAttendance()*300 %></td>
         <td><%=FP1.getAttendance()*300 %></td>
        </tr>
        <tr>
        <td>-</td>
         <td>-</td>
         <td>-</td> 
          <td>Food Bill</td>
         <td><%=FP1.getFood()*50 %></td>
         <td><%=FP1.getFood()*50  %></td>
        </tr>
         <tr>
        <th>Total Earnings</th>
         <td><%=earnings %></td>
          <td><%=earnings %></td>
          <th>Total Deductions</th>
         <td><%=deductions %></td>
         <td><%=deductions %></td>
        
        </tr>
       </table>
       <table class="table">
         <tr>
        <th>Net Pay</th>
        </tr>
        <tr>
         <th>Rs.<%=earnings-deductions %></th>
          
       
        </tr>
    </table>
     <table class="table">
         <tr>
        <th>Days In Month(A)</th>
         <th>Food(B)</th>
           <th>LOP Days(C)</th>
            <th>Net Days Worked<br>(E=A-C)</th>
        </tr>
        <tr>
       <td>31</td>
        <td><%= SD1.getFOOD_REIMBERSMNET() %></td>
         <td><%=FP1.getAttendance() %></td>
          <td><%= ((31)-(FP1.getAttendance())) %></td> 
        </tr>
        
    </table>
    </section>
</body>
</html>