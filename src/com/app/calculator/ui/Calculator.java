package com.app.calculator.ui;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {
	
	public Calculator() {
		JFrame frame = Frame.buildFrame();
		JTextField textField = TextField.buildTextField();
		Buttons button = new Buttons();
		List<JButton> listOfNumberButtons = button.buildNumberButtons(frame, textField);
		Frame.addToFrame(frame, textField, listOfNumberButtons);
	}
}
