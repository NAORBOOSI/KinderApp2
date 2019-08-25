package com.example.MyWebApp.controler;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity(name = "Person")
public class Person  {
	
	   
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String sex;
 

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
