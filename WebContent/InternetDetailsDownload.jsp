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
InternetDetailsBO internetbo =new InternetDetailsBO();

ReportsDAO RD1=new ReportsDAO();
internetbo=RD1.getDetailsbyId(Empid);

Date FromDate=internetbo.getFrom();
Date ToDate=internetbo.getTo();
PD1.getInternetDetailsbyId(FromDate, ToDate, Empid);

%>

<div align="center">
<caption><h2>Internet Bill Details</h2></caption>
<table id="Internet" border="1" cellpadding="5" class="table container">
    
    <tr>
        <th>Employee ID</th>
        <td><%=internetbo.getEmp_Id() %></td>
    </tr>
    <tr>
        <th>Employee Name</th>
        <td><%=BO1.getEMP_NAME() %></td>
    </tr>
    <tr>
        <th>From Date</th>
        <td><%=internetbo.getFrom() %></td>
    </tr>
    <tr>
        <th>To Date</th>
        <td><%=internetbo.getTo() %></td>
    </tr>
    <tr>
        <th>Internet Bill</th>
        <td><%=internetbo.getInternet() %></td>
    </tr>
</table>
</div><br><br>
 <center><input type="button" id="btnExport" value="download" onclick="Export()" class="btn btn-primary" /></center><br><br><br><br>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.22/pdfmake.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/0.4.1/html2canvas.min.js"></script>
    <script type="text/javascript">
        function Export() {
            html2canvas(document.getElementById('Internet'), {
                onrendered: function (canvas) {
                    var data = canvas.toDataURL();
                    var docDefinition = {
                        content: [{
                            image: data,
                            width: 500
                        }]
                    };
                    pdfMake.createPdf(docDefinition).download("InternetBill.pdf");
                }
            });
        }
    </script>
</body>
</html>