package dAO;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.Food_Lop;
import bean.ReportsBO;

public class PayslipDetailsDAO {
	 public int getInternetDetailsbyId(Date FromDate, Date ToDate, int EmpId) {
			int sum=0;
		   try{  
	        
			   Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection(
	                   "jdbc:mysql://localhost:3306/payroll", "root", "root");
			    
			  	PreparedStatement ps=con.prepareStatement("select sum(Internet) from internet_details where fromDate='?' and todate='?' and  EMP_ID=?"); 
			  	ps.setDate(1,(java.sql.Date) FromDate);
			  	ps.setDate(2, (java.sql.Date) ToDate);
			  	ps.setInt(3,EmpId);
			  	ResultSet rs=ps.executeQuery();
			  	
			  	while(rs.next()) {
			  		sum=rs.getInt(1);
			  	}
			  	con.close();    
			}
		   catch(Exception e){ 
			   e.printStackTrace();
		   }
		  return sum;
		}
	 public Food_Lop getFoodLopDetbyId(int EmpId) {
		 Food_Lop FP1=new Food_Lop();
		 try{  
		        
			   Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection(
	                   "jdbc:mysql://localhost:3306/payroll", "root", "root");
			    
			  	PreparedStatement ps=con.prepareStatement("select count(food) from reports_details where food='yes' and empid=?"); 
			  	ps.setInt(1,EmpId);
			  	ResultSet rs=ps.executeQuery();
			  	
			  	while(rs.next()) {
			  		FP1.setFood(rs.getInt(1));
			  	}
			  	
			  	PreparedStatement ps1=con.prepareStatement("select count(attendance) from reports_details where attendance='Absent' and empid=?"); 
			  	ps1.setInt(1,EmpId);
			  	ResultSet rs1=ps1.executeQuery();
			  	
			  	while(rs1.next()) {
			  		FP1.setAttendance(rs1.getInt(1));
			  	}
			  	con.close();    
			}
		   catch(Exception e){ 
			   e.printStackTrace();
		   }
		  return FP1;
		}
	public ArrayList<ReportsBO> getTransportDetails(int EmpId) {
		ArrayList<ReportsBO> reports = new ArrayList<ReportsBO>();
		
		try{  
	        
			   Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection(
	                   "jdbc:mysql://localhost:3306/payroll", "root", "root");
			    
			  	PreparedStatement ps=con.prepareStatement("select fromdate,todate, Transport from reports_details where transport!=0 and empid=?"); 
			  	ps.setInt(1,EmpId);
			  	ResultSet rs=ps.executeQuery();
			  	
			  	while(rs.next()) {
			  		ReportsBO reports1 = new ReportsBO();
			  		reports1.setFromDate(rs.getDate(1));
			  		reports1.setToDate(rs.getDate(2));
			  		reports1.setTransport(rs.getInt(3));
			  		reports.add(reports1);
			  	}
			  	
			  	con.close();    
			}
		   catch(Exception e){ 
			   e.printStackTrace();
		   }
		  return reports;
		}
}

