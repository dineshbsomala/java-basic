import java.sql.*;

public class ConnectionSuccess {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		Connection conn = null;
		conn =	DriverManager.getConnection("jdbc:sqlserver://192.168.0.4;databaseName=school", "sa", "dinesh");

		if(conn != null) {
			System.out.println("Connection Success");
		}
		else {
			System.out.println("Connection unsuccesful");
		}


		/*Statement st = conn.createStatement();

		int res = st.executeUpdate("insert into students (name) values ('dineshuu')");
        
		System.out.println(res+" rows affected");*/
		conn.close();
	}

}
