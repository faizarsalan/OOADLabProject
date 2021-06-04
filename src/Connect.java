import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

	public Connection con;
	public Statement stat;
	public ResultSet rs;
	public ResultSetMetaData rsm;
	
	public Connect() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "");
			
			stat = con.createStatement();
			
			System.out.println("Connect success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Connect fail");
		}
		try {
			rs = stat.executeQuery("SELECT * FROM test2");
			rsm = rs.getMetaData();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(rs);
	}
	
	public ResultSet execQuery(String query) {
		try {
			rs = stat.executeQuery(query);
			rsm = rs.getMetaData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Fail to get data");
		}
		
		return rs;
	}
	
	public boolean execUpdate(String query) {
		try {
			stat.executeUpdate(query);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	

}
