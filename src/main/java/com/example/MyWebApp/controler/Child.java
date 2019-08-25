package com.example.MyWebApp.controler;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="children") 
public class Child extends Person   {
	
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	@Column(name = "chfirstname")
	private String chfirstname;
	
	@Column(name = "chlastname")
	private String chlastname;
	
	@Column(name = "childId")
	private int childId;
	
	private double age;
	
  
	

	//@ManyToOne()
	//@JoinColumn(name="name child")
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

	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public void delete(int id2) {
		// TODO Auto-generated method stub
		
	}


	
}
