package servlet;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  
  
  
public class AdminServlet extends HttpServlet {  

	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String Admin_ID=request.getParameter("Admin_ID");  
    String PASSWORD=request.getParameter("PASSWORD");  
    //System.out.println(Admin_ID);
 
    HttpSession session=request.getSession();  
    session.setAttribute("Admin_ID",Admin_ID);  
          
    if(Admin_ID.equals("4444") && PASSWORD.equals("admin")){  
        RequestDispatcher rd=request.getRequestDispatcher("Registration.html");
        rd.forward(request,response);     
    }  
		
    else{ 
    	out.print("Sorry username or password error"); 
    	RequestDispatcher rd=request.getRequestDispatcher("AdminLogin.html");
		 rd.include(request,response); 
		 }
          
    out.close();  
   
    }  
}  
