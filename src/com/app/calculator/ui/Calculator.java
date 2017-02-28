package com.app.calculator.ui;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {
	
	public Calculator() {
		JFrame frame = Frame.buildFrame();
		JTextField textField = Screen.buildTextField(frame);
		Buttons.buildNumberButtons(frame, textField);
		Buttons.buildOperatorButtons(frame, textField);
		Buttons.buildAdditionalButtons(frame, textField);
		frame.setLayout(null);  
		frame.setVisible(true);
	}
}