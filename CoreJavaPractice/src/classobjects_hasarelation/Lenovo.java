package classobjects_hasarelation;

public class Lenovo extends Laptops {
	
	private String model;
	private String specs;
	private String lenprice;
	public Lenovo(String model, String specs, String lenprice) {
		super();
		this.model = model;
		this.specs = specs;
		this.lenprice = lenprice;
	}
	public String getModel() {
		return model;
	}
	public String getSpecs() {
		return specs;
	}
	public String getLenprice() {
		return lenprice;
	}
	public void showdetails() {
		System.out.println("Model name: "+getModel());
		System.out.println("Specs: "+getSpecs());
		System.out.println("Price: "+getLenprice());
	}

}
