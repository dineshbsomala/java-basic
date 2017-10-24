package sessionfactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CarSessionFactory {

	static SessionFactory carsf = null;
	public static SessionFactory createsession() {

		if (carsf == null){

			carsf = new Configuration().configure("hibernateCreate.cfg.xml").buildSessionFactory();
		}
		return carsf;
	}
}
