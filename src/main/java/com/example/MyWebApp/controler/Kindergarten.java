package com.example.MyWebApp.controler;

public class Kindergarten extends Child  {
	
	public String kgarten;

	public Kindergarten(String sex, String fathername, String mathername, String lastname,
			String chfirstname, String chlastname, double age, String kgarten) {
		super(sex, fathername, mathername, lastname, chfirstname, chlastname, age);
		this.kgarten = kgarten;
	}

	public String getKgarten() {
		return kgarten;
	}

	public void setKgarten(String kgarten) {
		this.kgarten = kgarten;
	}

	
	


}
