package util;

import org.hibernate.Session;
import org.hibernate.Transaction;

import doa.amazondoa;
import pojo.Amazon;
import sessionfactories.AmazonSessions;

public class AmazonDoaImpl implements amazondoa{

	Session amzsess = null;
	Transaction amztrans = null;
	@Override
	public boolean save(Amazon order) throws Exception {
		try {
			amzsess = AmazonSessions.createsessions().openSession();
			amztrans = amzsess.beginTransaction();
			
			amzsess.save(order);
			amztrans.commit();
			System.out.println("Saved Succesfully");
			return true;
			
		}catch(Exception ex) {
			amztrans.rollback();
			ex.printStackTrace();
		}finally {
			amzsess.close();
		}
		return false;
	}

}
