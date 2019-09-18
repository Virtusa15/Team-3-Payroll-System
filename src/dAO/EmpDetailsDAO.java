package dAO;

import java.sql.*;
import java.util.*;

import bean.EmpDetailsBO;



public class EmpDetailsDAO {
	public EmpDetailsBO  getEmpDetailsById(int Empid) {
		EmpDetailsBO BO1 = new EmpDetailsBO();
		 try{  
			 Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection(
	                   "jdbc:mysql://localhost:3306/payroll", "root", "root");
				/*PreparedStatement stmt=con.prepareStatement(  
						"select * from EMPLOYEE_INFO where EMP_ID="+Empid);
				ResultSet rs=stmt.executeQuery();*/
				PreparedStatement stmt1=con.prepareStatement(  
						"select * from EMPLOYEE_INFO where EMP_ID=?");
				stmt1.setInt(1,Empid);
				ResultSet rs=stmt1.executeQuery();
				
				
			
			  while(rs.next()) { 
				  BO1.setEMP_ID(rs.getInt(1));
				  BO1.setEMP_NAME(rs.getString(2));
				  BO1.setMOBILE_NUMBER(rs.getLong(3));
				  BO1.setEMP_EMAIL(rs.getString(4));
				  BO1.setDOB(rs.getDate(5));
				  BO1.setGENDER(rs.getString(6));
				  BO1.setPAN_NUMBER(rs.getString(7));
				  BO1.setADHAR_NUMBER(rs.getLong(8));
				  BO1.setBANK_ACNO(rs.getLong(9));
				  BO1.setDOJ(rs.getDate(10));
				  BO1.setDEPARTMENT(rs.getString(11));
				  BO1.setDESIGNATION(rs.getString(12));
				  BO1.setSALARY(rs.getFloat(13));
				  BO1.setEMP_ADDRESS(rs.getString(14));
				  BO1.setJOB_LOCATION(rs.getString(15));
				  BO1.setPASSWORD(rs.getString(16));
				  			 
			  }
			 
			}catch(Exception e){
				System.out.println(e);
				} 
		 return BO1;
	}
}
