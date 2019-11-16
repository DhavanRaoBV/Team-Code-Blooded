package practis.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	public Statement st;
	public Connection con;
	public ResultSet rs;

	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mywork", "root", "Dhavan@1997");
			st = con.createStatement();
		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
