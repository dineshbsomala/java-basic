package libraydb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateLibrary {

	public static void main(String[] args) {
		Session upsess = null;
		Transaction uptrans = null;
		

		try {
			SessionFactory sessions = SessionFactoryClass.createsession();

			upsess = sessions.openSession();
			uptrans = upsess.beginTransaction();

			/*LibraryPOJO updt = new LibraryPOJO();
			updt.setBid(1);
			updt.setBookname("Arecheology");
			upsess.update(updt);
			System.out.println("Updated succesfully");
*/
			LibraryPOJO objupdt = (LibraryPOJO) upsess.load(LibraryPOJO.class,4);
			System.out.println("book name:"+objupdt.getBookname());
			objupdt.setBookname("history");
			//objupdt.getBookname();
			
			uptrans.commit();
			System.out.println("updated");
			
			
		} catch (Exception e) {
			uptrans.rollback();

			e.printStackTrace();
		}finally {
			//uptrans.commit();
			upsess.close();
		}

	}

}
