package carpojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="cars_tbl")

public class CarPOJO {
	
	@Id @GeneratedValue
	private int cid;
	@Column (name="carcomp")
	private String company;
	
	private String cname;
	private String price;
	public CarPOJO() {
		super();
	}
	public CarPOJO(int cid, String company, String cname, String price) {
		super();
		this.cid = cid;
		this.company = company;
		this.cname = cname;
		this.price = price;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Column
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Column
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
