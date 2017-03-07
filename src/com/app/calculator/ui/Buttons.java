package com.app.calculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.model.InputModel;

public class Buttons {
	
	private ArrayList<JButton> arrayList = new ArrayList<JButton>();
	
	public ArrayList<JButton> buildNumberButtons(JFrame frame, JTextField textField, InputModel inputModel) {
		
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
	
	public ArrayList<JButton> buildOperatorButtons(JFrame frame, JTextField textField, InputModel inputModel) {
		
		createAndAddButton("+", 190, 50, textField, inputModel);
		createAndAddButton("-", 190, 110, textField, inputModel);
		createAndAddButton("x", 190, 170, textField, inputModel);
		createAndAddButton("/", 190, 230, textField, inputModel);

		return arrayList;
	}
	
	public ArrayList<JButton> buildAnotherButtons(JFrame frame, JTextField textField, InputModel inputModel) {
		
		createAndAddButton("C", 70, 230, textField, inputModel);
		createAndAddButton("=", 130, 230, textField, inputModel);

		return arrayList;
	}
	
	public JButton createAndAddButton(String label, int xPos, int yPos, JTextField textField,
			InputModel inputModel){
		
		int WIDTH = 50;
		JButton button = new JButton(label);
		button.setBounds(xPos, yPos, WIDTH, WIDTH);
		arrayList.add(button);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (inputModel.isSecondNumber()) {
						inputModel.setSecondNumber((inputModel.getSecondNumber() + button.getText()));
						textField.setText(inputModel.getSecondNumber());
					}
					else if (inputModel.isNewNumber()){
						inputModel.setFirstNumber(inputModel.getFirstNumber() + button.getText());
						textField.setText(inputModel.getFirstNumber());
					}
				}
			});
		return button;
	}
	
	private boolean isOperator(String text, InputModel inputModel){
		boolean isOperator = false;
		if (text.equalsIgnoreCase("+")) {
			inputModel.setSecondNumber(true);
			isOperator = inputModel.isSecondNumber();
		}
		else{
			inputModel.setSecondNumber(false);
			
		}
		return false;
	}
}


