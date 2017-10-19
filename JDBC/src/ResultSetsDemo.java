import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetsDemo {

	public static void main(String[] args) {
		
      System.out.println("Result Set");
      Connection conn = null;
      try {
    	  
    	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	  
    	  conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.4;databaseName=school", "sa", "dinesh");
    	  if(conn!=null) {
    		  System.out.println("Connection succesful");
    	  }
    	  Statement st = conn.createStatement();
    	  
    	 ResultSet  res = st.executeQuery("Select * from pwds");
    	 
    	while( res.next()!=false) {
    	System.out.println(res.getString("new")+"     "+res.getString("old"));
    	}
    	  
      }catch(Exception ex) {
    	  
      }finally {
    	  try {
			conn.close();
		} catch (SQLException e) {
	  
			e.printStackTrace();
		}
      }
      
		
		
	}

}
