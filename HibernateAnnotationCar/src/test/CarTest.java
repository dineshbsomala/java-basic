package test;

import carpojo.CarPOJO;
import util.CarDaoImpl;

public class CarTest {

	public static void main(String[] args) {
		
		CarDaoImpl cardao = new CarDaoImpl();
		try {
			CarPOJO audi = new CarPOJO(1, "audi", "Q7", "$70kUsd");
			CarPOJO benz = new CarPOJO(2, "mercedes", "Benz", "$68k USD");
			cardao.save(audi);
			cardao.save(benz);
			System.out.println("Car details saved");
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
