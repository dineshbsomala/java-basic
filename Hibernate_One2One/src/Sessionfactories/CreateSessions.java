package Sessionfactories;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateSessions {
	
	static SessionFactory sessions = null;
	public static SessionFactory createsession() {
		if(sessions == null) {
			sessions = new Configuration().configure("hibernateUpdate.cfg.xml").buildSessionFactory();
		}
		return sessions;
	}

}
