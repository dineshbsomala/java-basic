import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;
import java.util.Scanner;

public class Student_Jdbc extends Student {

	public static void main(String[] args) {
		System.out.println("Students Records");


		LinkedList<Student> lkdst = st_details();

		insert(lkdst);
		LinkedList<String> ret = Retrieve();
		//System.out.println("Cse dept student is:"+ret);
		ret.forEach(k -> System.out.println(k));

		lkdst.forEach(print -> System.out.println(print));
	}

	private static LinkedList<String> Retrieve() {

		Connection conn = null;
		PreparedStatement insrt = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.4;databaseName=school", "sa", "dinesh");
			if(conn!=null) {
				System.out.println("Connection success");

				String sql = "Select name from studs where dept = 'cse' ";
				insrt = conn.prepareStatement(sql);
				boolean done =	insrt.execute();
				if(done) {
					ResultSet rst = insrt.getResultSet();
					rst.next();
					LinkedList<String> names = new LinkedList<>();
					names.add(rst.getString(1)); 
					return names;
				}
			}
		}catch(Exception ex) {
			ex.printStackTrace();

		}finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}


		return null;


	}

	private static LinkedList<Student> st_details() {
		Scanner sc = new Scanner(System.in);

		LinkedList<Student> list = new LinkedList<>();

		for(int i=1; i<4;i++) {
			System.out.println("Student Details");
			System.out.println("Enter Student name");
			String snamei = sc.nextLine();

			System.out.println("Enter Student dept");
			String sdepti = sc.nextLine();

			System.out.println("enter Student id");
			int sidi = sc.nextInt();
			sc.nextLine();

			Student si = new Student(snamei, sdepti, sidi);
			list.add(si);

		}
		sc.close();
		return list;

	}

	private static void insert(LinkedList<Student> lkdst) {
		Connection conn = null;
		PreparedStatement insrt = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.4;databaseName=school", "sa", "dinesh");
			if(conn!=null) {
				System.out.println("Connection success");
			}
			//Statement st = conn.createStatement();

			int did[] = new int[lkdst.size()];
			String dname[] = new String[lkdst.size()];
			String ddept[] = new String[lkdst.size()];
			String sql = null;

			for(int i =0; i<lkdst.size(); i++) {
				did[i] = lkdst.get(i).getId();
				dname[i] = lkdst.get(i).getName();
				ddept[i] = lkdst.get(i).getDept();

				sql = "insert into studs (name, dept, id) values (?,?,?) ";
				//int res =	st.executeUpdate(sql); 
				insrt = conn.prepareStatement(sql);		
				insrt.setString(1, dname[i]);
				insrt.setString(2, ddept[i]);
				insrt.setInt(3, did[i]);
				insrt.execute();
			}

		}catch(Exception ex) {
			ex.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
