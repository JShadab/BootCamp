import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {

		int id = 11;
		String name = "PQR";
		String password = "112233";

//		// Step#1. Load the Driver class
//		Class.forName("org.mariadb.jdbc.Driver");// Maria DB
//		// Class.forName("com.mysql.jdbc.Driver");//MySQL DB
//
//		// Step#2. Establish the connection
//		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/boot_camp_db", "root",
//				"root"); // Maria DB
//		// DriverManager.getConnection("jdbc:mysql://localhost:3306/boot_camo_db",
//		// "root", "root"); //MySQL DB

		Connection connection= DBConnection.getConnection();

		// Step#3. Write the SQL queries
		String sql = "UPDATE emp SET name=?, password=? WHERE id=?";

		// Step#4. Get a carrier
		PreparedStatement ps = connection.prepareStatement(sql);

		ps.setInt(3, id);
		ps.setString(1, name);
		ps.setString(2, password);

		// Step#5 Execute the SQL query.
		ps.executeUpdate();

		// Step#6 Close the resources.
		ps.close();
		connection.close();

		System.out.println("Record Updated Successfully");

	}

}
