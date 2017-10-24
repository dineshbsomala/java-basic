package util;

import org.hibernate.Session;
import org.hibernate.Transaction;

import POJO.Employee;
import dao.empdao;
import sessionfactory.EmpSessionFactory;

public class EmpDoaImplement implements empdao{
	@Override
	public boolean save(Employee emp) throws Exception {
		Session empsess = null;
		Transaction emptrans = null;

		try{
			if(emp==null) {
				throw new RuntimeException("Object is null or not initialized");
			}
			else {
				empsess = EmpSessionFactory.createempsess().openSession();
				emptrans = empsess.beginTransaction();

				empsess.save(emp);
				

				emptrans.commit();
				return true;
			}

		}catch(Exception ex) {
			emptrans.rollback();
			ex.printStackTrace();
		}finally {
			if(empsess !=null) {
				empsess.close();
			}
		}

		return false;
	}


	

}
