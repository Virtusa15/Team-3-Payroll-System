package dAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAOClass {  
		public static boolean validate(String EMP_ID,String PASSWORD){  
		boolean status=false;  
		try{
			Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection(
	                   "jdbc:mysql://localhost:3306/payroll", "root", "root");
		/*Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","payroll","payroll");  */
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from EMPLOYEE_INFO where EMP_ID=? and PASSWORD =?");  
		ps.setString(1,EMP_ID);  
		ps.setString(2,PASSWORD);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
		}  
