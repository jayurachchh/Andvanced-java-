import java.sql.*;
import java.util.Scanner;

public class MySQLJDBCSelect {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Scanner sc = new Scanner(System.in);
			int total;
			Class.forName("com.mysql.jdbc.Driver");
			String dbPath = "jdbc:mysql://localhost/empDb";
			Connection con = DriverManager.getConnection(dbPath, "root", "");
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			//String sqlQuery = "SELECT * FROM `EmpDb`.`empinfo`;";
			String sqlQuery = "SELECT * FROM `empinfo`;";
			ResultSet rs = st.executeQuery(sqlQuery);
			rs.last();
			total = rs.getRow();
			rs.beforeFirst();
			if(total > 0) {
				System.out.print("\nID\tName\tSalary\n");
				System.out.print("--\t----\t------\n");
				while(rs.next()) {
					System.out.print(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\n");
				}
				System.out.println("\n" + total + "Row(s) Selected.\n");
			}
			else
				System.out.println("No Rows Selected.\n");
			con.close();	
		} catch(Exception e) {
			System.out.println("\nException Occured.\n" + e.getMessage());
		}
	}
}