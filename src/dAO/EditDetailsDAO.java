package dAO;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.*;  
import javax.servlet.http.*;  
  

import javax.servlet.http.HttpSession;

import bean.EditEmpDO;

public class EditDetailsDAO {
	
	int count=0;
    public int getDBConnnection(EditEmpDO empDetObj,int EmpId) {
    	
		
	   try{  
        
		   Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/payroll", "root", "root"); 
		    
		  	PreparedStatement ps=con.prepareStatement("update employee_info set MOBILE_NUMBER=?,GENDER=?,PAN_NUMBER=?,ADHAR_NUMBER=?,EMP_ADDRESS=? where EMP_ID="+EmpId);
		   
			  ps.setLong(1, empDetObj.getMOBILE_NUMBER());
			/*  ps.setString(2,empDetObj.getEMP_EMAIL());*/
			 /* ps.setDate(3, empDetObj.getDOB()); */
			
			  ps.setString(2,empDetObj.getGENDER());
			  ps.setString(3, empDetObj.getPAN_NUMBER());
			  ps.setLong(4,empDetObj.getADHAR_NUMBER());
			/*  ps.setLong(6,empDetObj.getBANK_ACNO());*/
			
			  ps.setString(5,empDetObj.getEMP_ADDRESS());

			this.count= ps.executeUpdate();
			System.out.println(this.count);
		     	
		  	con.close();  
		  
		}
	   catch(Exception e){ 
		   e.printStackTrace();
	   }
	 
	return this.count;
	
	
	  
	}
	  	
}



