package pojo;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="amazon_orders")
public class Amazon {

	@Id @GeneratedValue
private int ordrno;
	@Column
	private String cname;
	@Column
	private String pname;
	@Column
	private double price;
	@ElementCollection
	private List<Address> addresses;
	public Amazon() {
		super();
	}
	public Amazon(String cname, String pname, double price) {
		super();
		this.cname = cname;
		this.pname = pname;
		this.price = price;
		
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
}
