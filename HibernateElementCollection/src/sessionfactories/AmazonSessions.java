package sessionfactories;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AmazonSessions {

	static SessionFactory amzsessions = null;
	
	public static SessionFactory createsessions() {
		if(amzsessions == null) {
			amzsessions = new Configuration().configure("hibernateUpdate.cfg.xml").buildSessionFactory();
		}
		
		return amzsessions;
		
	}
}
