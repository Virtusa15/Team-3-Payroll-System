package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.EmployeeRegistrationBeanClass;
import dAO.EmployeeRegistrationDAOClass;

public class EmployeeRegistrationServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException { 
		  PrintWriter out=response.getWriter();
		  
		 
		   String id=request.getParameter("EMP_ID");
	      int employee_Id=Integer.parseInt(id); 
		 
		 String employee_Name=request.getParameter("EMP_NAME");
		 
		 String number=request.getParameter("MOBILE_NUMBER");
		 long mobile_Number=Long.parseLong(number);
		 
		 String email=request.getParameter("EMP_EMAIL");
		 
		 String dob=request.getParameter("DOB");
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd"); 
		 Date datedob=null;
		 try {
		    datedob = formatter.parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //DOB convertion util date to sql date
		 java.sql.Date sqlDateDOB = new java.sql.Date(datedob.getTime());
		 
		 String gender=request.getParameter("GENDER");
		 
		 String pan=request.getParameter("PAN_NUMBER");
		 
		 String aadhar_Number=request.getParameter("ADHAR_NUMBER");
		 Long aadhar=Long.parseLong(aadhar_Number);
		 
		 String account_Number=request.getParameter("BANK_ACNO");
		 Long bank_Account_Number=Long.parseLong(account_Number);
		 
		 String doj=request.getParameter("DOJ");
		 Date datedoj=null;
		 try {
			    datedoj = formatter.parse(doj);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 java.sql.Date sqlDateDOJ = new java.sql.Date(datedoj.getTime());
		 
		 String department_Name=request.getParameter("DEPARTMENT");
		     
		 String designation=request.getParameter("DESIGNATION");
		 //DOB convertion string to date
		
		 String Salary=request.getParameter("SALARY");
		 double M_Salary=Double.parseDouble(Salary); 
		 
		 String address=request.getParameter("EMP_ADDRESS");
		 
		 String job_Location=request.getParameter("JOB_LOCATION");
		 
		 String password=request.getParameter("PASSWORD");
		 
		 
		 
	 EmployeeRegistrationBeanClass empBeanObj=new EmployeeRegistrationBeanClass();
	 empBeanObj.setEMP_ID(employee_Id);
	 empBeanObj.setEMP_NAME(employee_Name);
	 empBeanObj.setMOBILE_NUMBER(mobile_Number);
	 empBeanObj.setEMP_EMAIL(email);
	 empBeanObj.setDOB(sqlDateDOB);
	 empBeanObj.setGENDER(gender);
	 empBeanObj.setPAN_NUMBER(pan);
	 empBeanObj.setADHAR_NUMBER(aadhar);
	 empBeanObj.setBANK_ACNO(bank_Account_Number);
	 empBeanObj.setDOJ(sqlDateDOJ);
	 empBeanObj.setDEPARTMENT(department_Name);
	 empBeanObj.setDESIGNATION(designation);
	 empBeanObj.setSALARY(M_Salary);
	 empBeanObj.setEMP_ADDRESS(address);
	 empBeanObj.setJOB_LOCATION(job_Location);
	 empBeanObj.setPASSWORD(password);
	 
	  
	
}
}
