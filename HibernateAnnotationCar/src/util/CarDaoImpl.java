package util;

import org.hibernate.Session;
import org.hibernate.Transaction;

import carpojo.CarPOJO;
import doa.CarDao;
import sessionfactory.CarSessionFactory;

public class CarDaoImpl implements CarDao {

	@Override
	public boolean save(CarPOJO car) throws Exception {
		Session carsess = null;
		Transaction cartrans = null;
		try {
			if(car == null) {
				throw new RuntimeException("Car is not defined or car is null");
			}

			carsess = CarSessionFactory.createsession().openSession();
			cartrans = carsess.beginTransaction();

			carsess.save(car);
			cartrans.commit();

			return true;
		}catch(Exception ex) {
			cartrans.rollback();
			ex.printStackTrace();
		}finally {
			carsess.close();
		}
		return false;
	}
}
