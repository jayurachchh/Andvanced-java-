import java.sql.*;  

public class P20
{ 

 public static void main(String args[]){  
     try
     {  
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
		Connection con=DriverManager.getConnection("jdbc:Odbc:dsn");  
		if(con==null)
		{
		System.out.println("Connectin invaild");
		}
		else
	{
		System.out.println("Connection Sucessful");
	}
	catch(Exception e)
	{ 
		System.out.println(e);
	}  
}

}  