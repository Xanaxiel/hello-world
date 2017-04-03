package com.app.calculator.controller;

import javax.swing.JTextField;

import com.app.calculator.intf.ArithmeticOperation;
import com.app.calculator.intf.impl.Addition;
import com.app.calculator.intf.impl.Division;
import com.app.calculator.intf.impl.Multiplication;
import com.app.calculator.intf.impl.Subtraction;
import com.app.calculator.model.CalculatorInputVO;

public class CalculatorController{

	ArithmeticOperation<Long> operation;

	public void setOperation(ArithmeticOperation<Long> operation) {
		this.operation = operation;
	}

	public void displayResult(CalculatorInputVO inputModel, JTextField textField){
		long firstInput = Long.parseLong(inputModel.getFirstNum());
		long secondInput = Long.parseLong(inputModel.getSecondNum());
		
		if (("+").equals(inputModel.getOperator())) this.setOperation(new Addition());
		if (("-").equals(inputModel.getOperator())) this.setOperation(new Subtraction());
		if (("x").equals(inputModel.getOperator())) this.setOperation(new Multiplication());
		if (("/").equals(inputModel.getOperator())) this.setOperation(new Division());
		
		inputModel.setResult(operation.computeResult(firstInput, secondInput).toString());
		textField.setText(inputModel.getResult());
	}
}

	
	
