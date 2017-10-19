import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateQuery {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement add = null;
		
		try {
			// 1. Loading Driver.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			//2.connection.
			
			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.4;databaseName=school", "sa", "dinesh");
			
			if(conn!=null) {
				System.out.println("Connection success");
			}
			
			//3. Create Statement.
			
			Statement st = conn.createStatement();
			
			
			/*ResultSet set = st.executeQuery("create table pwds (new Varchar(20), old varchar(20))");
			
			if(set!=null) {
				System.out.println("Table Created");
			}*/
			
			System.out.println("Enter password");
			String newpd = sc.nextLine();
			sc.close();
			
			String sql = "insert into pwds (new) values(?)";
			add = conn.prepareStatement(sql);
			add.setString(1, newpd);
			
			add.execute();
			
			/*String remove = "alter table pwds drop column old";
			add = conn.prepareStatement(remove);
			add.execute();*/
			
			String alter = "delete from pwds where new='sdb'";
				add = conn.prepareStatement(alter);
				add.execute();
		} catch(Exception e) {
			
		}finally {
			conn.close();
		}

	}

}
