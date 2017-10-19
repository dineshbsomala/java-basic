package libraydb;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class PersistLibrary {

	public static void main(String[] args) {

		//Configuration config = new Configuration();
		SessionFactory sessfactory = null;
		try {
			/*config.configure("Hibernate_Config..xml");
			sessfactory = config.buildSessionFactory();
*/
			
			sessfactory = new Configuration().configure("hibernateCreate.cfg.xml").buildSessionFactory();
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Session factory and configuration errors");
		}

		Session sess = sessfactory.openSession();
		Transaction trans = sess.beginTransaction();
		try {

			LibraryPOJO b3 = new LibraryPOJO();
			b3.setBid(5);
			b3.setStream("History");
			b3.setBookname("Indiana Jones:Crystal skull");
			b3.setCopies(36);
			
			LibraryPOJO b2 = new LibraryPOJO();
			b2.setBid(4);
			b2.setStream("History");
			b2.setBookname("Indiana Jones:Raiders of last Ark");
			b2.setCopies(16);

			sess.save(b3);
			sess.save(b2);
			System.out.println("Details saved in db with id:"+b3.getBid());
			System.out.println("Details saved in db with id:"+b2.getBid());
			
			trans.commit();
			
		}catch(Exception ex1) {
			trans.rollback();
			ex1.printStackTrace();
			System.out.println("Exception at DataBase Level");
		}
		
	}

}
