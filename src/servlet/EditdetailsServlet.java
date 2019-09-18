package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

import dAO.EditDetailsDAO;
import bean.EditEmpDO;

public class EditdetailsServlet extends HttpServlet {
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	     PrintWriter out=response.getWriter();
		String Empid=request.getParameter("EmpId");
		int EmpId=Integer.parseInt(Empid);
		
		 String number=request.getParameter("Mobile Number");
		 long mobile_Number=Long.parseLong(number);
		 
		 String email=request.getParameter("Email Id"); 
		
		 //DOB convertion string to date
		 /*String dob=request.getParameter("Date of Birth");
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd"); 
		 Date datedob=null;
		 try {
		    datedob = formatter.parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //DOB convertion util date to sql date
		 java.sql.Date sqlDateDOB = new java.sql.Date(datedob.getTime());*/
		 
		
		 String gender=request.getParameter("Gender");
		 
		 String pan=request.getParameter("PAN Number");
		 
		 String aadhar_Number=request.getParameter("ADHAR Number");
		 long aadhar=Long.parseLong(aadhar_Number);
		 
		 String account_Number=request.getParameter("Bank A/C no");
		 long bank_Account_Number=Long.parseLong(account_Number);
		 
		 String address=request.getParameter("Employee Address");
		
		 
		 
		 EditEmpDO empDetObj=new EditEmpDO();
		 /*empDetObj.setEMP_ID(EmpId);*/
	
		 empDetObj.setMOBILE_NUMBER(mobile_Number);
		 empDetObj.setEMP_EMAIL(email);
	 
		 /*empDetObj.setDOB(sqlDateDOB);*/
	 
		 empDetObj.setGENDER(gender);
		 empDetObj.setPAN_NUMBER(pan);
		 empDetObj.setADHAR_NUMBER(aadhar);
		 empDetObj.setBANK_ACNO(bank_Account_Number);
	 
		 empDetObj.setEMP_ADDRESS(address);
		 
	
	 EditDetailsDAO editDetailsobj=new EditDetailsDAO();
	// editDetailsobj.getDBConnnection(empDetObj,EmpId);
	 int count= editDetailsobj.getDBConnnection(empDetObj,EmpId);
	 System.out.println("servlet"+count);
	 if(count == 1) {
		 out.print("<html><body><h2 style=color:green;font-size:30px;margin:10%>successfully edited</h2></body></html>");
	 }else {
		 out.print("<html><body><h2 style=color:red;font-size:30px;margin:10%>Error in editing</h2></body></html>");
	 }
	}

}
