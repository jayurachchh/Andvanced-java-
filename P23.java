import java.sql.*;  

public class P23
{ 
 public static void main(String args[]){  
     try
     {  
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from stu ");  
		System.out.println("sId\t sName\t sspi"); 
		while(rs.next()) 
		System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+" \t "+rs.getFloat(3)); 
		con.close();  
	}
	catch(Exception e)
	{ 
		System.out.println(e);
	}  
}

}  
