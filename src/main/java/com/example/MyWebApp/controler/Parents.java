package com.example.MyWebApp.controler;

public class Parents extends Person{
	
	
	private String fathername;
	private String mathername;
	private String lastname;
	
	public Parents(String sex, String fathername, String mathername, String lastname) {
		super(sex);
		this.fathername = fathername;
		this.mathername = mathername;
		this.lastname = lastname;
	}

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
	
	
}
