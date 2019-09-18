package bean;


import java.sql.Date;

public class InternetDetailsBO {
private int Emp_Id;
private Date From;
private Date To;
private int Internet;

public int getEmp_Id() {
return Emp_Id;
}
public void setEmp_Id(int Emp_Id) {
this.Emp_Id = Emp_Id;
}
public Date getFrom() {
return From;
}
public void setFrom(Date From) {
this.From = From;
}
public Date getTo() {
return To;
}
public void setTo(Date To) {
this.To = To;
}
public int getInternet() {
return Internet;
}
public void setInternet(int Internet) {
this.Internet = Internet;
}

}