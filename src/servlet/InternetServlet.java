package servlet;

import java.io.*;
import java.text.*;
import java.util.Date;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

import bean.InternetDetailsBO;
import dAO.ReportsDAO;


public class InternetServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       
   
   

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");   
PrintWriter out = response.getWriter();
HttpSession session=request.getSession(); 

String eid=(String)session.getAttribute("EMP_ID");
int Empid = Integer.parseInt(eid);

/*String EMP_ID = request.getParameter("EmpID");
int emp_id = Integer.parseInt(EMP_ID);*/
String From=request.getParameter("FromDate");
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
Date Fromdate=null;
try {
	Fromdate = formatter.parse(From);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//DOB convertion util date to sql date
java.sql.Date sqlFromDate = new java.sql.Date(Fromdate.getTime());


String To=request.getParameter("ToDate");

Date Todate=null;
try {
Todate = formatter.parse(To);
} catch (ParseException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
java.sql.Date sqlToDate = new java.sql.Date(Todate.getTime());

String internet =request.getParameter("Internet");
int Internet=Integer.parseInt(internet);

InternetDetailsBO internetbo =new InternetDetailsBO();
internetbo.setEmp_Id(Empid);
internetbo.setFrom(sqlFromDate);
internetbo.setTo(sqlToDate);
internetbo.setInternet(Internet);

ReportsDAO reportsdao = new ReportsDAO();
int count=reportsdao.InternetDetailsUpdate(internetbo,Empid);
if(count == 1) {
	 out.print("<html><body><h2 style=color:green;font-size:30px;margin:10%>successfully Updated</h2></body></html>");
}else {
	 out.print("<html><body><h2 style=color:red;font-size:30px;margin:10%>Error</h2></body></html>");
}


}
}
   /*PrintWriter out = response.getWriter();
   HttpSession session=request.getSession(); 
   
   String eid=(String)session.getAttribute("EMP_ID");
   int Empid = Integer.parseInt(eid);
   
   String EMP_ID=request.getParameter("EmpId");
   int emp_id=Integer.parseInt(EMP_ID);
   
   String From=request.getParameter("From");
   SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
   Date Fromdate=null;
   try {
	   Fromdate = formatter.parse(From);
   } catch (ParseException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
   }
   	java.sql.Date sqlFromDate = new java.sql.Date(Fromdate.getTime());

   	String To=request.getParameter("To");
   
   	Date Todate=null;
   	try {
   		Todate = formatter.parse(To);
   	} catch (ParseException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}
   	java.sql.Date sqlToDate = new java.sql.Date(Todate.getTime());

   	String internet =request.getParameter("Internet");
   	int Internet=Integer.parseInt(internet);

   	InternetDetailsBO internetbo =new InternetDetailsBO();
   	internetbo.setEmp_Id(Empid);
   	internetbo.setFrom(sqlFromDate);
   	internetbo.setTo(sqlToDate);
   	internetbo.setInternet(Internet);

   	ReportsDAO reportsdao = new ReportsDAO();
   	reportsdao.InternetDetailsUpdate(internetbo,Empid);

  }*/

