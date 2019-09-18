<%@ page language="java" import="java.lang.*,java.util.*,javax.servlet.*,dAO.*,bean.*,java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<a align="right" href="LogoutEmp" target="Target">Logout</a>
<%
String eid=(String)session.getAttribute("EMP_ID");
int Empid = Integer.parseInt(eid);

EmpDetailsDAO ED= new EmpDetailsDAO();
EmpDetailsBO BO1 = new EmpDetailsBO();
BO1=ED.getEmpDetailsById(Empid);

PayslipDetailsDAO PD1=new PayslipDetailsDAO();
ReportsBO RB1=new ReportsBO();

try{  
    
	   Class.forName("com.mysql.jdbc.Driver");
    Connection con1 = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/payroll", "root", "root");
	    
	  	PreparedStatement ps=con1.prepareStatement("select fromdate,todate, Transport from reports_details where transport!=0 and empid=?"); 
	  	ps.setInt(1,Empid);
	  	ResultSet rs=ps.executeQuery();
	  	
	  	%>
	  	<div align="center">
	  	<caption><h2>Transport Bill Details</h2></caption>
	 <table id="Transport" border="1" cellpadding="5" class="table container">
	      <thead>
	        <tr>
	  	<th>Employee Id</th>
	  	 <td><%=BO1.getEMP_ID() %></td>
	          	 <th>Employee name</th>
	          	
	          	 <td><%=BO1.getEMP_NAME()%></td>
	          	 </tr>
	          <tr>
	          
	             <th>From Date</th>
	             <th>To Date</th>
	             <th>Transport</th>
	          </tr>
	      </thead>
	      <tbody>
	        <%while(rs.next())
	        {
	            %>
	            <tr>
	                <td><%=rs.getDate("FromDate") %></td>
	                <td><%=rs.getDate("ToDate") %></td>
	                <td><%=rs.getInt("Transport") %></td>
	            </tr>
	            <%}%>
	           </tbody>
	        </table><br>
	    <%}
	    catch(Exception e){
	        out.print(e.getMessage());%><br><%
	    }
	
	    %>
<center><input type="button" id="btnExport" value="download" onclick="Export()" class="btn btn-primary" /></center><br><br><br><br>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.22/pdfmake.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/0.4.1/html2canvas.min.js"></script>
    <script type="text/javascript">
        function Export() {
            html2canvas(document.getElementById('Transport'), {
                onrendered: function (canvas) {
                    var data = canvas.toDataURL();
                    var docDefinition = {
                        content: [{
                            image: data,
                            width: 500
                        }]
                    };
                    pdfMake.createPdf(docDefinition).download("Transport.pdf");
                }
            });
        }
    </script>
</body>
</html>