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

import dAO.LoginDAOClass;  
  
  
public class LoginServlet extends HttpServlet {  

	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String EMP_ID=request.getParameter("EMP_ID");  
    String PASSWORD=request.getParameter("PASSWORD");  
    
 
    HttpSession session=request.getSession();  
    session.setAttribute("EMP_ID",EMP_ID);  
   
   if(LoginDAOClass.validate(EMP_ID, PASSWORD)){  
        RequestDispatcher rd=request.getRequestDispatcher("Welcome.html");
        rd.forward(request,response);
        
    }
    else{  
        out.print("Sorry username or password error");  
        RequestDispatcher rd=request.getRequestDispatcher("Login.html");  
        rd.include(request,response);  
    }  
          
    out.close();  
   
    }  
}  
