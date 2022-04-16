import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class sqliteConnection {
	Connection con = null;
	public static Connection dbConnector ()
	{D:
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:D:\\Code(Updated)-20220330T155627Z-001\\Code(Updated)\\EmployeeData.sqlite");
			//JOptionPane.showMessageDialog(null, "Connection Successful");
			return con;
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
