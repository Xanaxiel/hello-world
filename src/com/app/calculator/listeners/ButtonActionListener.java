package com.app.calculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ButtonActionListener {

	private static String firstNumber = "";
	private static String secondNumber = "";
	
	public static void setButtonActionListenter(List<JButton> listOfButtons, 
			JTextField textField){

		for (int i = 0; i <= 9; i++) {
			JButton button = listOfButtons.get(i);
			Integer number = i;
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					firstNumber += number.toString();
					textField.setText(firstNumber);
				}
			});
		}
		
		for (int i = 0; i <= 9; i++) {
			JButton button = listOfButtons.get(i);
			Integer number = i;
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					secondNumber += number.toString();
					textField.setText(secondNumber);
				}
			});
		}
	}
}
