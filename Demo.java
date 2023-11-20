import java.sql.*;  

public class Demo
{ 
 public static void main(String args[]){  
     try
     {  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","");  
		if(con==null)
		{
		System.out.println("Connectin invaild");
		}
		else
	{
		System.out.println("Connection Sucessful");
	}
		// Statement stmt=con.createStatement();  
		// ResultSet rs=stmt.executeQuery("select * from emp");  
		// System.out.println("Id\t Name\t designation\t Salary"); 
		// while(rs.next()) 
		// System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"      \t"   +rs.getString(4));  
		// con.close();  
	}
	catch(Exception e)
	{ 
		System.out.println(e);
	}  
 }
}  