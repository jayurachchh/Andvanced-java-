import java.sql.*;
import java.util.Scanner;

public class MySQLJDBCInsert {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			double sal;
			String name;
			Class.forName("com.mysql.jdbc.Driver");
			String dbPath = "jdbc:mysql://localhost/EmpDb";
			Connection con = DriverManager.getConnection(dbPath, "root", "");
			Statement st = con.createStatement();
			System.out.println("\nInsert Data:");
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Salary: ");
			sal = sc.nextDouble();
			String sqlQuery = "INSERT INTO  `EmpDb`.`empinfo` (`Name` ,`Salary`) VALUES ('" + name + "',  '" + sal + "');";
			if(st.executeUpdate(sqlQuery) == 1)
				System.out.println("\nData Inserted.");
			else
				System.out.println("Error Occured.");
			con.close();	
		} catch(Exception e) {
			System.out.println("\nException Occured.\n" + e.getMessage());
		}
	}
}