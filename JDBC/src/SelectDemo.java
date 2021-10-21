import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {

	public static void main(String[] args) throws Exception {

//		// Step#1. Load the Driver class
//		Class.forName("org.mariadb.jdbc.Driver");// Maria DB
//		// Class.forName("com.mysql.jdbc.Driver");//MySQL DB
//
//		// Step#2. Establish the connection
//		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/boot_camp_db", "root",
//				"root"); // Maria DB
//		// DriverManager.getConnection("jdbc:mysql://localhost:3306/boot_camo_db",
//		// "root", "root"); //MySQL DB

		Connection connection = DBConnection.getConnection();

		// Step#3. Write the SQL queries
		String sql = "SELECT * FROM emp";

		// Step#4. Get a carrier
		PreparedStatement ps = connection.prepareStatement(sql);

		// Step#5 Execute the SQL query.
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			int id = rs.getInt("id");
			String name = rs.getString("name");
			String password = rs.getString("password");

			System.out.println(id + ", " + name + ", " + password);
		}

		// Step#6 Close the resources.
		rs.close();
		ps.close();
		connection.close();

	}

}
