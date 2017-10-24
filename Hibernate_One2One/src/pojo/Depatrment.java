package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Dept_details")
public class Depatrment {

	@Id @GeneratedValue
	private int dno;
	@Column
	private String subject;
	@Column
	private String professor;
	public Depatrment() {
		super();
	}
	public Depatrment(int dno, String subject, String professor) {
		super();
		this.dno = dno;
		this.subject = subject;
		this.professor = professor;
	}
	public int getDno() {
		return dno;
	}
	public void setDname(int dno) {
		this.dno = dno;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	@Override
	public String toString() {
		return "Depatrment [dname=" + dno + ", subject=" + subject + ", professor=" + professor + "]";
	}

}
