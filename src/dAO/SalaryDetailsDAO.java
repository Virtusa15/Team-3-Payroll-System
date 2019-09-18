package dAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dAO.*;
import bean.*;

public class SalaryDetailsDAO {
	public SalaryDetailsBO getSalaryDetails(String deg,int empid) {
		SalaryDetailsBO SD1 = new SalaryDetailsBO();
		try{  
			Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection(
	                   "jdbc:mysql://localhost:3306/payroll", "root", "root");
	           
				PreparedStatement stmt1=con.prepareStatement(  
						"select * from Salary_info where DESIGNATION=?");
				stmt1.setString(1,deg);
				ResultSet rs=stmt1.executeQuery();
				/*PreparedStatement stmt2=con.prepareStatement(  
						"select * from Salary_info where DESIGNATION=?");
				stmt2.setString(1,deg);
				ResultSet rs1=stmt2.executeQuery();*/
				
				 while(rs.next()) {
					 SD1.setDESIGNATION(rs.getString(1));
					 SD1.setBASIC_PAY(rs.getDouble(2));
					 SD1.setHRA(rs.getDouble(3));
					 SD1.setLEAVE_TRAVEL_ASSISTANCE(rs.getDouble(4));
					 SD1.setPHONE_INTERNET_REIMBURSEMENT(rs.getDouble(5));
					 SD1.setBONUS(rs.getDouble(6));
					 SD1.setCHILD_EDU_FEE(rs.getDouble(7));
					 SD1.setSPECIAL_ALLOWANCE(rs.getDouble(8));
					 SD1.setFOOD_REIMBURSEMENT(rs.getDouble(9));
					 SD1.setPF(rs.getDouble(10));
					 SD1.setESIC(rs.getDouble(11));
					 SD1.setFIXED_COMPENSATION(rs.getDouble(12));
					 SD1.setVAR_COMPENSATION(rs.getDouble(13));
					 SD1.setCOST_TO_COMPANY(rs.getDouble(14));
					 SD1.setTax(rs.getFloat(15));
					 SD1.setEMP_ID(rs.getInt(16));
					 SD1.setFROM_DATE(rs.getDate(17));
					 SD1.setTO_DATE(rs.getDate(18));
					 SD1.setLOPS(rs.getInt(19));
					 SD1.setFOOD_REIMBERSMNET(rs.getInt(20));
					 SD1.setTRANSPORT_REIMBERSMENT(rs.getDouble(21));
					 SD1.setINTERNET_REIMBERSMENT(rs.getDouble(22));
				 }
				 
				/* while(rs1.next()) {
					 SD1.setEMP_ID(rs1.getInt(1));
					 SD1.setFROM_DATE(rs1.getDate(2));
					 SD1.setTO_DATE(rs1.getDate(3));
					 SD1.setLOPS(rs1.getInt(4));
					 SD1.setFOOD_REIMBERSMNET(rs1.getInt(5));
					 SD1.setTRANSPORT_REIMBERSMENT(rs1.getDouble(6));
					 SD1.setINTERNET_REIMBERSMENT(rs1.getDouble(7));
				 }*/
		}catch(Exception e){
			System.out.println(e);
			} 
		return SD1;
	}
}
