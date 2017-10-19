package libraydb;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryClass {

	static SessionFactory sessions = null;
	static SessionFactory delsessions = null;
	public static SessionFactory createsession() throws Exception {
		if(sessions == null) {
			sessions = new Configuration().configure("hibernateupdate.cfg.xml").buildSessionFactory();
		}
		return sessions;


	}

	public static SessionFactory delsessions() throws Exception{
		if(delsessions == null) {
			delsessions = new Configuration().configure("hibernatedelete.cfg2.xml").buildSessionFactory();
		}
		return delsessions;
	}
}

