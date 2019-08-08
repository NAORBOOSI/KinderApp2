package com.example.MyWebApp.controler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="children") 
public class Child extends Parents {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String chfirstname;
	private String chlastname;
	private double age;
	
	public Child(String sex, String fathername, String mathername, String lastname, String chfirstname,
			String chlastname, double age) {
		super(sex, fathername, mathername, lastname);
		this.chfirstname = chfirstname;
		this.chlastname = chlastname;
		this.age = age;
	}

	public String getChfirstname() {
		return chfirstname;
	}

	public void setChfirstname(String chfirstname) {
		this.chfirstname = chfirstname;
	}

	public String getChlastname() {
		return chlastname;
	}

	public void setChlastname(String chlastname) {
		this.chlastname = chlastname;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	
	
}
