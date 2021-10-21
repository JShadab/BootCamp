import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		Connection connection = null;

		try {
			// Step#1. Load the Driver class
			Class.forName("org.mariadb.jdbc.Driver");

			// Step#2. Establish the connection
			connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/boot_camp_db", "root", "root");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

}
