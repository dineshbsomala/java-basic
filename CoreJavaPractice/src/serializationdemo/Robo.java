package serializationdemo;

import java.io.Serializable;

public class Robo implements Serializable{

	private String name;
	private double speed;
	private int mmy;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getMmy() {
		return mmy;
	}
	public void setMmy(int mmy) {
		this.mmy = mmy;
	}
	
	
	public Robo(String name, double speed, int mmy) {
		super();
		this.name = name;
		this.speed = speed;
		this.mmy = mmy;
	}
	
	public Robo(String name, int mmy) {
		super();
		this.name = name;
		this.mmy = mmy;
		
		
	}
	
	@Override
	public String toString() {
		return "Robo [name=" + name + ", speed=" + speed + ", mmy=" + mmy + "]";
	}
	
	
	public boolean equals(Object obj) {

		if(obj instanceof Robo){

			Robo robo = (Robo)obj;		
			if((this.getMmy()==(robo.mmy)) & (this.name.equals(robo.name)))
				return true;				
		}
		return false;
	}
	
	

}

