package sessionfactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpSessionFactory {

	static SessionFactory empsessions = null;


	public static SessionFactory createempsess() {
		if(empsessions==null) {

			empsessions = new Configuration().configure("hibernateUpdate.cfg.xml").buildSessionFactory();
		}
		return empsessions;
	}

}
