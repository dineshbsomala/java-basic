package libraydb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteLibrary {

	public static void main(String[] args) {

		Session delsess = null;
		Transaction deltrans = null;
		try {
			SessionFactory delsessions = SessionFactoryClass.delsessions();
			delsess = delsessions.openSession();
			deltrans = delsess.beginTransaction();

			LibraryPOJO delobj = (LibraryPOJO) delsess.load(LibraryPOJO.class, 2);
		     delsess.delete(delobj);

			/*LibraryPOJO delobj = new LibraryPOJO();
			delobj.setBid(2);
			delsess.delete(delobj);*/


			deltrans.commit();
			System.out.println("Deleted");

		}catch(Exception ex) {
			deltrans.rollback();
			ex.printStackTrace();
		} finally {
			
			delsess.close();
		}
	}

}
