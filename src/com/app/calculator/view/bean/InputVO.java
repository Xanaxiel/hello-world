package com.app.calculator.view.bean;

public class InputVO {
	
	private String numberA = "";
	private String numberB = "";
	private String result = "";
	private String operator = "";
	private boolean isFirstNumber = true;
	private boolean isSecondNumber;
	
	public String getFirstNum() {
		return numberA;
	}
	public void setFirstNum(String a) {
		this.numberA = a;
	}
	public String getSecondNum() {
		return numberB;
	}
	public void setSecondNum(String b) {
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
