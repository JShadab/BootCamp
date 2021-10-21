import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) {

		int id = 17;
		String name = "PQR";
		String password = "hukns";

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
		String sql = "INSERT INTO emp VALUES (?,?,?)";
		try {
			// Step#4. Get a carrier
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, password);

			// Step#5 Execute the SQL query.
			ps.executeUpdate();

			// Step#6 Close the resources.
			ps.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Record Inserted Successfully");

	}

}
