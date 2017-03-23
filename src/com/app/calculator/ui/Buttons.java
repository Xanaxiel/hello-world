package com.app.calculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.controller.CalculatorController;
import com.app.calculator.model.InputModel;

public class Buttons {
	
	private ArrayList<JButton> arrayList = new ArrayList<JButton>();
	
	public ArrayList<JButton> buildNumberButtons(JFrame frame, 
			JTextField textField, InputModel inputModel) {
		
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
	
	public ArrayList<JButton> buildOperatorButtons(JFrame frame, 
			JTextField textField, InputModel inputModel) {
		
		createAndAddButton("+", 190, 50, textField, inputModel);
		createAndAddButton("-", 190, 110, textField, inputModel);
		createAndAddButton("x", 190, 170, textField, inputModel);
		createAndAddButton("/", 190, 230, textField, inputModel);

		return arrayList;
	}
	
	public ArrayList<JButton> buildAdditionalButtons(JFrame frame, 
			JTextField textField, InputModel inputModel) {
		
		createAndAddButton("C", 70, 230, textField, inputModel);
		createAndAddButton("=", 130, 230, textField, inputModel);
		

		return arrayList;
	}
	
	public JButton createAndAddButton(String label, int xPos, int yPos, 
			JTextField textField, InputModel inputModel){
		
		CalculatorController calculateController = new CalculatorController();
		
		int width = 50;
		JButton button = new JButton(label);
		button.setBounds(xPos, yPos, width, width);
		arrayList.add(button);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					boolean operated = isOperated(button, inputModel);
					if (inputModel.isFirstNumber())
					{
						inputModel.setA(inputModel.getA() + button.getText());
						textField.setText(inputModel.getA());
					}
					else
					{
						if(operated){
							if (button.getText().equalsIgnoreCase("="))
							{
								
								calculateController.displayResult(inputModel, textField);
							}
							else{
								inputModel.setOperator((button.getText()));
								textField.setText(inputModel.getOperator());
							}
						}
						else
						{
							inputModel.setB((inputModel.getB() + button.getText()));	
						}
					}	
					

				}
			});
		return button;
	}
	
	private boolean isOperated(JButton button, InputModel inputModel) {
		if (button.getText().equalsIgnoreCase("+") || 
			button.getText().equalsIgnoreCase("-")||
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
