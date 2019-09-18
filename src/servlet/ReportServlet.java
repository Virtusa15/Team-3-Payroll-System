package servlet;

import java.io.*;
import java.text.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Integer.*;

import bean.ReportsBO;
import dAO.ReportsDAO;



public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
			response.setContentType("text/html");  
		      

		    HttpSession session=request.getSession(); 
		    PrintWriter out=response.getWriter();

		    String eid=(String)session.getAttribute("EMP_ID");
		    int Empid = Integer.parseInt(eid);
		   
		    
		     String From=request.getParameter("FromDate");
			 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd"); 
			 Date FromDate=null;
			 try {
				 FromDate= formatter.parse(From);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 //DOB convertion util date to sql date
			 java.sql.Date sqlFromDate = new java.sql.Date(FromDate.getTime());
		      
			 String To=request.getParameter("ToDate");
			 Date ToDate=null;
			 try {
				 ToDate= formatter.parse(To);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 //DOB convertion util date to sql date
			 java.sql.Date sqlToDate = new java.sql.Date(ToDate.getTime());
		    
			 String Attendance=request.getParameter("Attendance");
		 
			 String Food=request.getParameter("Food");
			 
			 String transport=request.getParameter("Transport");
			 int Transport=Integer.parseInt(transport);
			 
			 ReportsBO reportsbo = new ReportsBO();
			 reportsbo.setEmpId(Empid);
			 reportsbo.setFromDate(sqlFromDate);
			 reportsbo.setToDate(sqlToDate);
			 reportsbo.setAttendance(Attendance);
			 reportsbo.setFood(Food);
			 reportsbo.setTransport(Transport);
			 
			 ReportsDAO reportsdao =new ReportsDAO();
			int count= reportsdao.reportsupdate(reportsbo,Empid);
			if(count == 1) {
				 out.print("<html><body><h2 style=color:green;font-size:30px;margin:10%>success</h2></body></html>");
			 }else {
				 out.print("<html><body><h2 style=color:red;font-size:30px;margin:10%>Error</h2></body></html>");
			 }
		     
	}

}
