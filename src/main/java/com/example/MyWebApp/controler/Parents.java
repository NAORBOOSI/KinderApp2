package com.example.MyWebApp.controler;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "Parents")
public class Parents extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	// @Column(name = "fathername")
	private String fathername;
	
	private String fatherId;

	public String getFatherId() {
		return fatherId;
	}

	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}

	// @Column(name = "mathername")
	private String mathername;

	// @Column(name = "lastname")
	private String lastname;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Child> children;

 

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMathername() {
		return mathername;
	}

	public void setMathername(String mathername) {
		this.mathername = mathername;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<Child> getChildren() {
		return children;
	}

	public void setChildren(List<Child> children) {
		this.children = children;
	}

	

	
}
