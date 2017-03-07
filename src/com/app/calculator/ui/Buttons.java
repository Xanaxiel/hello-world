package com.app.calculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.intf.impl.Addition;
import com.app.calculator.intf.impl.Division;
import com.app.calculator.intf.impl.Multiplication;
import com.app.calculator.intf.impl.Subtraction;
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
		
		int WIDTH = 50;
		JButton button = new JButton(label);
		button.setBounds(xPos, yPos, WIDTH, WIDTH);
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
								compute(inputModel, textField);
							}
							else{
								inputModel.setOperator((button.getText()));
								textField.setText(inputModel.getOperator());
							}
						}
						else
						{
							inputModel.setB((inputModel.getB() + button.getText()));
							textField.setText(inputModel.getB());
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

	private void compute(InputModel inputModel, JTextField textField) {
		
		String numberAString = inputModel.getA();
		String operator = inputModel.getOperator();
		String numberBString = inputModel.getB();
		
		long numberA = Long.parseLong(numberAString);
		long numberB = Long.parseLong(numberBString);
		
		if (operator.equals("+")){
			Addition add = new Addition();
			inputModel.setResult(add.computeResult(numberA, numberB).toString());
			textField.setText(inputModel.getResult());
		}
		if (operator.equals("-")){
			Subtraction subtract = new Subtraction();
			inputModel.setResult(subtract.computeResult(numberA, numberB).toString());
			textField.setText(inputModel.getResult());
		}
		if (operator.equals("x")){
			Multiplication multiply = new Multiplication();
			inputModel.setResult(multiply.computeResult(numberA, numberB).toString());
			textField.setText(inputModel.getResult());
		}
		if (operator.equals("/")){
			Division divide = new Division();
			inputModel.setResult(divide.computeResult(numberA, numberB).toString());
			textField.setText(inputModel.getResult());
		}
	}
}
