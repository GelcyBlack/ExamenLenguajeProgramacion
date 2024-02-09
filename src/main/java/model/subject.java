package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Subject")
@NamedQuery(name = "subject.findAll", query = "SELECT s FROM subject s")
public class subject {
	
	@Id
	@Column(name = "idSubject")
	private int idSubject;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "credits")
	private String credits;

	
	public subject() {
		
	}


	public int getIdSubject() {
		return idSubject;
	}


	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getCredits() {
		return credits;
	}


	public void setCredits(String credits) {
		this.credits = credits;
	}
	

}