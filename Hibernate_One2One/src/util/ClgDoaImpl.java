package util;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Sessionfactories.CreateSessions;
import doa.ClgDoa;
import pojo.College;
import pojo.Depatrment;



public class ClgDoaImpl implements ClgDoa{

	/*Session clgsess = null;
	Transaction clgtrans = null;
	@Override
	public boolean save(College clg) throws Exception {
		
		try {
			clgsess = CreateSessions.createsession().openSession();
			clgtrans = clgsess.beginTransaction();
			
			clgsess.save(clg);
	
			clgtrans.commit();
		}catch(Exception ex) {
			clgtrans.rollback();
			ex.printStackTrace();
		}
		
		return false;
	}*/
	
}

