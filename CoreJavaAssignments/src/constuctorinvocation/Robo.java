package constuctorinvocation;

public class Robo {

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
	
	public Robo(String name, int mmy) {
		this("vasee", 0.0, 256);
	}
	public Robo(String name, double speed, int mmy) {
		super();
		this.name = name;
		this.speed = speed;
		this.mmy = mmy;
	}
	
	@Override
	public String toString() {
		String display = "Robo name= "+name+", memory = "+mmy+", speed = "+speed;
		return display;
	}
	
	public boolean equals(Object obj) {

		if(obj instanceof Robo){

			Robo robo = (Robo)obj;		
			if((this.getMmy()==(robo.mmy)) & (this.getSpeed() == (robo.speed)) & (this.name.equals(robo.name)))
				return true;				
		}
		return false;
	}
	
	

}

