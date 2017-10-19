import java.sql.*;

public class CallableDemo {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.4;databaseName=school", "sa", "dinesh");
			if(conn!=null) {
				System.out.println("Connection success");
			}
			
			CallableStatement cs = conn.prepareCall("{call insertcse(?,'cse',?)}");
			cs.setString(1, "madasu Komali");
			//cs.setString(2, "cse");
			cs.setInt(2, 9789);
			boolean tf = cs.execute();
			
			if(tf) {
				ResultSet rs = cs.getResultSet();
				rs.next();
				System.out.println(rs.getString(1)+"        " +rs.getString(2)+"        "+rs.getInt(3));
			}
			else {
				System.out.println(tf+ " rows affected");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(Exception ex1) {
				ex1.printStackTrace();
			}
		}
		

	}

}
