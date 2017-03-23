package com.app.calculator.controller;

import javax.swing.JTextField;

import com.app.calculator.intf.impl.Addition;
import com.app.calculator.intf.impl.Division;
import com.app.calculator.intf.impl.Multiplication;
import com.app.calculator.intf.impl.Subtraction;
import com.app.calculator.model.InputModel;

public class CalculatorController{

		
		public void displayResult(InputModel inputModel, JTextField textField){
				
			String numberAString = inputModel.getA();
			String operator = inputModel.getOperator();
			String numberBString = inputModel.getB();
			
			long firstInput = Long.parseLong(numberAString);
			long secondInput = Long.parseLong(numberBString);
			
			if (operator.equals("+")){
				inputModel.setResult(add(firstInput, secondInput));
				textField.setText(inputModel.getResult());
			}
			if (operator.equals("-")){
				inputModel.setResult(subtract(firstInput, secondInput));
				textField.setText(inputModel.getResult());
			}
			if (operator.equals("x")){
				inputModel.setResult(multiply(firstInput, secondInput));
				textField.setText(inputModel.getResult());
			}
			if (operator.equals("/")){
				inputModel.setResult(divide(firstInput, secondInput));
				textField.setText(inputModel.getResult());
			}
		}
		
		private String add(long firstInput, long secondInput){
			Addition add = new Addition();
			String result =  add.computeResult(firstInput, secondInput).toString();
			return result;
		}
		
		private String multiply(long firstInput, long secondInput){
			Multiplication multiply = new Multiplication();
			String result = multiply.computeResult(firstInput, secondInput).toString();
			return result;
		}
		
		private String subtract(long firstInput, long secondInput){
			Subtraction subtract = new Subtraction();
			String result = subtract.computeResult(firstInput, secondInput).toString();
			return result;
		}
		
		private String divide(long firstInput, long secondInput){
			Division division = new Division();
			String result = division.computeResult(firstInput, secondInput).toString();
			return result;
		}
		
		
	}

	
	
