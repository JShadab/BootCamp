import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {

		int id = 99;

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
		String sql = "DELETE FROM emp WHERE id=?";

		// Step#4. Get a carrier
		PreparedStatement ps = connection.prepareStatement(sql);

		ps.setInt(1, id);

		// Step#5 Execute the SQL query.
		ps.executeUpdate();

		// Step#6 Close the resources.
		ps.close();
		connection.close();

		System.out.println("Record Deleted Successfully");

	}

}
