import java.sql.*;
import java.util.Scanner;

public class MySQLJDBCDelete {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int id;
			int no;
			Class.forName("com.mysql.jdbc.Driver");
			String dbPath = "jdbc:mysql://localhost/empDb";
			Connection con = DriverManager.getConnection(dbPath, "root", "");
			Statement st = con.createStatement();
			System.out.println("\nDelete Employee:");
			System.out.print("ID: ");
			id = sc.nextInt();
			String sqlQuery = "DELETE FROM  `EmpDb`.`empinfo` WHERE  `empinfo`.`ID` =" + id + ";";
			no = st.executeUpdate(sqlQuery);
			if(no > 0)
				System.out.println("\n" + no + "Record(s) Deleted.");
			else
				System.out.println("Error Occured.");
			con.close();	
		} catch(Exception e) {
			System.out.println("\nException Occured.\n" + e.getMessage());
		}
	}
}