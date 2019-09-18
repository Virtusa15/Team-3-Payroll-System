package bean;

import java.sql.Date;

public class ReportsBO {
	private int EmpId;
	private Date FromDate;
	private Date ToDate;
	private String Attendance;
	private String Food;
	private int Transport;
	
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	/*public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}*/
	public Date getFromDate() {
		return FromDate;
	}
	public void setFromDate(Date FromDate) {
		this.FromDate = FromDate;
	}
	public Date getToDate() {
		return ToDate;
	}
	public void setToDate(Date ToDate) {
		this.ToDate = ToDate;
	}
	public String getAttendance() {
		return Attendance;
	}
	public void setAttendance(String Attendance) {
		this.Attendance = Attendance;
	}
	public String getFood() {
		return Food;
	}
	public void setFood(String Food) {
		this.Food = Food;
	}
	public int getTransport() {
		return Transport;
	}
	public void setTransport(int Transport) {
		this.Transport = Transport;
	}
	
}
