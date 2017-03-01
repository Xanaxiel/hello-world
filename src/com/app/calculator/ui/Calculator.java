package com.app.calculator.ui;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {
	
	public Calculator() {
		JFrame frame = Frame.buildFrame();
		JTextField textField = TextField.buildTextField();
		ArrayList<JButton> listOfButtons = Buttons.buildNumberButtons(frame, textField);
		Buttons.buildOperatorButtons(frame, textField);
		Buttons.buildAdditionalButtons(frame, textField);
		Frame.addToFrame(frame, textField, listOfButtons);
	}
}