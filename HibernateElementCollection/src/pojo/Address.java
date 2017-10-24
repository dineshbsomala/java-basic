package pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column
	private String city;
	@Column
	private String h_no;
	@Column
	private String state;
	
	public Address() {
		super();
	}
	public Address(String city, String h_no, String state) {
		super();
		this.city = city;
		this.h_no = h_no;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getH_no() {
		return h_no;
	}
	public void setH_no(String h_no) {
		this.h_no = h_no;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
