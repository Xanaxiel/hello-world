package com.app.calculator.controller;

import javax.swing.JTextField;

import com.app.calculator.service.Addition;
import com.app.calculator.service.ArithmeticOperation;
import com.app.calculator.service.Division;
import com.app.calculator.service.Multiplication;
import com.app.calculator.service.Subtraction;
import com.app.calculator.view.bean.CalculatorVO;

public class ActionController{

	ArithmeticOperation<Long> operation;
	CalculatorVO calculatorViewObject;
	
	public void displayResult(CalculatorVO inputModel, JTextField textField){
		long firstInput = Long.parseLong(inputModel.getFirstNum());
		long secondInput = Long.parseLong(inputModel.getSecondNum());
		
		if (("+").equals(inputModel.getOperator())) this.setOperation(new Addition());
		if (("-").equals(inputModel.getOperator())) this.setOperation(new Subtraction());
		if (("x").equals(inputModel.getOperator())) this.setOperation(new Multiplication());
		if (("/").equals(inputModel.getOperator())) this.setOperation(new Division());
		
		inputModel.setResult(operation.computeResult(firstInput, secondInput).toString());
		textField.setText(inputModel.getResult());
	}
	
	public CalculatorVO getCalculatorViewObject() {
		return calculatorViewObject;
	}

	public void setCalculatorViewObject(CalculatorVO calculatorViewObject) {
		this.calculatorViewObject = calculatorViewObject;
	}

	private void setOperation(ArithmeticOperation<Long> operation) {
		this.operation = operation;
	}
}

	
	
