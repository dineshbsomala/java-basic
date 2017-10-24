package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Sessionfactories.CreateSessions;
import pojo.College;
import pojo.Depatrment;
import util.ClgDoaImpl;

public class clgTest {

	public static void main(String[] args) {

		
		Session sess = null;
		Transaction trans = null;
		try {
			
			sess = CreateSessions.createsession().openSession();
			trans = sess.beginTransaction();
			
			College rmd = new College();
			rmd.setColgname("rmd");
			rmd.setDept("eee");
			rmd.setRegno(1);
			
			Depatrment eee = new Depatrment();
			eee.setDname(2);
			eee.setProfessor("saranya");
			eee.setSubject("micro prosessors");
			
			rmd.setDepts(eee);
			
			sess.save(eee);
			sess.save(rmd);
			System.out.println("Saved");
			
			
			trans.commit();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
