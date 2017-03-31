package com.app.calculator.model;

public class InputVO {
	
	private String numberA = "";
	private String numberB = "";
	private String result = "";
	private String operator = "";
	private boolean isFirstNumber = true;
	private boolean isSecondNumber = false;
	private boolean isOperated = false;
	
	public boolean isOperated() {
		return isOperated;
	}
	public void setIsOperated(boolean isOperated) {
		this.isOperated = isOperated;
	}
	public String getA() {
		return numberA;
	}
	public void setA(String a) {
		this.numberA = a;
	}
	public String getB() {
		return numberB;
	}
	public void setB(String b) {
		this.numberB = b;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public boolean isFirstNumber() {
		return isFirstNumber;
	}
	public void setIsFirstNumber(boolean isFirstNumber) {
		this.isFirstNumber = isFirstNumber;
	}
	public boolean isSecondNumber() {
		return isSecondNumber;
	}
	public void setIsSecondNumber(boolean isSecondNumber) {
		this.isSecondNumber = isSecondNumber;
	}
}
