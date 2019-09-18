package dAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.ReportsBO;
import bean.InternetDetailsBO;

public class ReportsDAO {
	
    public int reportsupdate(ReportsBO rep_det,int EmpId) {
    	int count=0;
		
	   try{  
        
		   Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/payroll", "root", "root");
		    
		  	PreparedStatement ps=con.prepareStatement("insert into reports_details values(?,?,?,?,?,?)"); 
		  	ps.setInt(1, EmpId);
		  /*	ps.setString(2,rep_det.getFrom());
		  	ps.setString(3,rep_det.getTo());*/
		  	ps.setDate(2,rep_det.getFromDate());
		  	ps.setDate(3,rep_det.getToDate());
		  	ps.setString(4, rep_det.getAttendance());
		  	ps.setString(5, rep_det.getFood());
		  	ps.setInt(6, rep_det.getTransport());
		  	count=ps.executeUpdate();
		  	
		  	con.close();  
		  
		}
	   catch(Exception e){ 
		   e.printStackTrace();
	   }
	return count;
	  
	}
    public int InternetDetailsUpdate(InternetDetailsBO int_det,int EmpId) {
           int count=0;
    	  try{  
    	       
    		  Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection(
	                   "jdbc:mysql://localhost:3306/payroll", "root", "root");  
    	   
    	  PreparedStatement ps1=con.prepareStatement("insert into internet_details values(?,?,?,?)");
    	  ps1.setInt(1, EmpId);
    	  ps1.setDate(2,int_det.getFrom());
    	  ps1.setDate(3,int_det.getTo());
    	  ps1.setInt(4,int_det.getInternet());
    	  count=ps1.executeUpdate();

    	  }
    	  catch(Exception e){
    	  e.printStackTrace();
    	  }
		return count;

    	    }
	
	public InternetDetailsBO getDetailsbyId(int EmpId) {
		InternetDetailsBO IB1=new InternetDetailsBO();
		 try{  
   		  Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection(
	                   "jdbc:mysql://localhost:3306/payroll", "root", "root"); 
	           
	           PreparedStatement stmt1=con.prepareStatement(  
						"select * from internet_details where EMP_ID=?");
				stmt1.setInt(1,EmpId);
				ResultSet rs=stmt1.executeQuery();
				
				
				
				while(rs.next()) {
					IB1.setEmp_Id(rs.getInt(1));
					IB1.setFrom(rs.getDate(2));
					IB1.setTo(rs.getDate(3));
					IB1.setInternet(rs.getInt(4));
				}
				
	}
	  catch(Exception e){
	  e.printStackTrace();
	  }
   return IB1;
	}
	
	public ReportsBO getReportsbyId(int EmpId) {
		ReportsBO RB1=new ReportsBO();
		try{  
	   		  Class.forName("com.mysql.jdbc.Driver");
		           Connection con = DriverManager.getConnection(
		                   "jdbc:mysql://localhost:3306/payroll", "root", "root"); 
		           
		           PreparedStatement stmt1=con.prepareStatement(  
							"select * from reports_details where EMP_ID=?");
					stmt1.setInt(1,EmpId);
					ResultSet rs=stmt1.executeQuery();
			
					while(rs.next()) {
						RB1.setEmpId(rs.getInt(1));
						RB1.setFromDate(rs.getDate(2));
						RB1.setToDate(rs.getDate(3));
						RB1.setAttendance(rs.getString(4));
						RB1.setFood(rs.getString(5));
						RB1.setTransport(rs.getInt(6));
					}		
		}
		  catch(Exception e){
		  e.printStackTrace();
		  }
	   return RB1;
		}
}

