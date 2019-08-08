package com.example.MyWebApp.controler;



public class Calculation {
	
	
	private int num1;


	private int num2;

	
	private String operator;

	public Calculation(int num1, int num2, String operator) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
