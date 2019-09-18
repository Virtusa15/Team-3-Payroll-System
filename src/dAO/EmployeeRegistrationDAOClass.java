package dAO;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import bean.EmployeeRegistrationBeanClass;

public class EmployeeRegistrationDAOClass {
	
	

    public int getDBConnnection(EmployeeRegistrationBeanClass emp_Reg) {
    	int row=0;
	   try{  
        
		   Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/payroll", "root", "root");
		    
		  	PreparedStatement ps=con.prepareStatement("insert into employee_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
		     ps.setInt(1, emp_Reg.getEMP_ID());
		     ps.setString(2, emp_Reg.getEMP_NAME());
		     ps.setLong(3,emp_Reg.getMOBILE_NUMBER());
		      ps.setString(4, emp_Reg.getEMP_EMAIL());
		     ps.setDate(5, emp_Reg.getDOB());
		     ps.setString(6,emp_Reg.getGENDER());
			  ps.setString(7, emp_Reg.getPAN_NUMBER());
			  ps.setLong(8,emp_Reg.getADHAR_NUMBER());
			  ps.setLong(9,emp_Reg.getBANK_ACNO());
			  ps.setDate(10,emp_Reg.getDOJ());
			  ps.setString(11, emp_Reg.getDEPARTMENT());
			  ps.setString(12, emp_Reg.getDESIGNATION());
			  ps.setDouble(13,emp_Reg.getSALARY());
			  ps.setString(14,emp_Reg.getEMP_ADDRESS());
			  ps.setString(15,emp_Reg.getJOB_LOCATION());
			  ps.setString(16,emp_Reg.getPASSWORD());
			 
			  row=ps.executeUpdate();
			  	System.out.println(row+" row(s) inserted");

		  	con.close();  
		  
		}
	   catch(Exception e){ 
		   e.printStackTrace();
	   }
	   return row;  
	}
    
        
	
	

}
