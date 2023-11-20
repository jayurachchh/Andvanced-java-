import java.io.*;
import javax.servlet.*;
public class P27 extends GenericServlet  
{
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException	
	{
		response.setContentType("text/html");
		String s=getServletConfig().getInitParameter("user");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Demo Servlet</title></head>");
		out.println("<body><h1>Hello "+s+"</h1></body></html");
		out.close();
	}	
}
	
// 21. Implement Database Connection And Perform Database Related Operations In The Application. (CO5) 

// Xml File: 

// Java File:

//   OUTPUT  
