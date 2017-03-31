package com.app.calculator.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.controller.CalculatorController;
import com.app.calculator.model.InputVO;

public class Buttons {
	
	private List<JButton> arrayList = new ArrayList<JButton>();
	
	public List<JButton> buildNumberButtons(JFrame frame, 
			JTextField textField, InputVO inputModel) {
		createAndAddButton("1", 10, 50, textField, inputModel);
		createAndAddButton("2", 70, 50, textField, inputModel);
		createAndAddButton("3", 130, 50, textField, inputModel);
		createAndAddButton("4", 10, 110, textField, inputModel);
		createAndAddButton("5", 70, 110, textField, inputModel);
		createAndAddButton("6", 130, 110, textField, inputModel);
		createAndAddButton("7", 10, 170, textField,inputModel);
		createAndAddButton("8", 70, 170, textField, inputModel);
		createAndAddButton("9", 130, 170, textField, inputModel);
		createAndAddButton("0", 10, 230, textField, inputModel);
		return arrayList;
	}
	
	public List<JButton> buildOperatorButtons(JFrame frame, 
			JTextField textField, InputVO inputModel) {
		createAndAddButton("+", 190, 50, textField, inputModel);
		createAndAddButton("-", 190, 110, textField, inputModel);
		createAndAddButton("x", 190, 170, textField, inputModel);
		createAndAddButton("/", 190, 230, textField, inputModel);
		return arrayList;
	}
	
	public List<JButton> buildAdditionalButtons(JFrame frame, 
			JTextField textField, InputVO inputModel) {
		createAndAddButton("C", 70, 230, textField, inputModel);
		createAndAddButton("=", 130, 230, textField, inputModel);
		return arrayList;
	}
	
	public JButton createAndAddButton(String label, int xPos, int yPos, 
			JTextField textField, InputVO inputVo){
		CalculatorController calculatorController = new CalculatorController();
		int width = 50;
		JButton button = new JButton(label);
		button.setBounds(xPos, yPos, width, width);
		arrayList.add(button);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					boolean operated = isOperated(button, inputVo);
					//If Cancel button is clicked, clear all variables
					if(button.getText().equalsIgnoreCase("C"))
					{
						textField.setText(null);
						inputVo.setA("");
						inputVo.setB("");
						inputVo.setResult("");
						inputVo.setIsFirstNumber(true);
						inputVo.setIsSecondNumber(false);
						inputVo.setIsOperated(false);
					}
					//If first number is clicked, save to "setA" variable and
					//display in textfield
					else if (inputVo.isFirstNumber())
					{
						inputVo.setA(inputVo.getA() + button.getText());
						textField.setText(inputVo.getA());
					}
					//If operator button is clicked the second number will be set
					else if (inputVo.isSecondNumber()) {
						//If operated button returns true
						if(operated){
							//If "=" button is clicked it will display result
							if (button.getText().equalsIgnoreCase("="))
							{
								calculatorController.displayResult(inputVo, textField);
							}
							else{
								if(button.getText().equalsIgnoreCase("+") || 
								button.getText().equalsIgnoreCase("-")||
								button.getText().equalsIgnoreCase("x") || 
								button.getText().equalsIgnoreCase("/"))
								{
									inputVo.setOperator((button.getText()));
									textField.setText(inputVo.getOperator());
									if (!inputVo.getResult().isEmpty()) {
										inputVo.setA(inputVo.getResult());
										inputVo.setResult("");
										inputVo.setOperator(inputVo.getOperator());
									}
								}
							}
						}
						else
						{
							inputVo.setB((inputVo.getB() + button.getText()));
							textField.setText(inputVo.getB());	
						}
					}
					operated = false;
				}
			});
		return button;
	}
	
	private boolean isOperated(JButton button, InputVO inputModel) {
		if (button.getText().equalsIgnoreCase("+") || 
			button.getText().equalsIgnoreCase("-") ||
			button.getText().equalsIgnoreCase("x") || 
			button.getText().equalsIgnoreCase("/") ||
			button.getText().equalsIgnoreCase("="))
		{
			inputModel.setIsSecondNumber(true);
			inputModel.setIsFirstNumber(false);
			return true;
		}
		return false;
	}
}
