import java.sql.*;
import java.util.Scanner;

public class MySQLJDBCUpdate {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int id;
			double sal;
			int no;
			Class.forName("com.mysql.jdbc.Driver");
			String dbPath = "jdbc:mysql://localhost/EmpDb";
			Connection con = DriverManager.getConnection(dbPath, "root", "");
			Statement st = con.createStatement();
			System.out.println("\nUpdate Salary:");
			System.out.print("ID: ");
			id = sc.nextInt();
			System.out.print("Salary: ");
			sal = sc.nextDouble();
			String sqlQuery = "UPDATE  `EmpDb`.`empinfo` SET  `Salary` =  '" + sal + "' WHERE  `empinfo`.`ID` =" + id + ";";
			no = st.executeUpdate(sqlQuery);
			if(no > 0)
				System.out.println("\n" + no + "Record(s) Updated.");
			else
				System.out.println("Error Occured.");
			con.close();	
		} catch(Exception e) {
			System.out.println("\nException Occured.\n" + e.getMessage());
		}
	}
}