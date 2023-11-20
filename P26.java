import java.io.*;
import javax.servlet.*;
public class P26 extends GenericServlet  
{
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException	
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Demo Servlet</title></head>");
		out.println("<body><h1>Hello World</h1></body></html");
		out.close();
	}	
}