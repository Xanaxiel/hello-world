package com.app.calculator.model;

public class InputModel {

	private String firstNumber = "";
	private String secondNumber = "";
	private String operator = "";
	private boolean isNewNumber = true;
	private boolean isSecondNumber;
	
	public boolean isSecondNumber() {
		return isSecondNumber;
	}
	public void setSecondNumber(boolean isSecondNumber) {
		this.isSecondNumber = isSecondNumber;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(String firstNumber) {
		this.firstNumber = firstNumber;
	}
	public String getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(String secondNumber) {
		this.secondNumber = secondNumber;
	}
	public boolean isNewNumber() {
		return isNewNumber;
	}
	public void setNewNumber(boolean isNewNumber) {
		this.isNewNumber = isNewNumber;
	}
	
}
