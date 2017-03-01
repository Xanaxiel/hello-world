package com.app.calculator.ui;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {
	
	public Calculator() {
		JFrame frame = Frame.buildFrame();
		JTextField textField = TextField.buildTextField();
		ArrayList<JButton> listOfNumberButtons = Buttons.buildNumberButtons(frame, textField);
		ArrayList<JButton> listOfOperatorButtons = Buttons.buildOperatorButtons(frame, textField);
		ArrayList<JButton> listOfAdditionalButtons = Buttons.buildAdditionalButtons(frame, textField);
		Frame.addToFrame(frame, textField, listOfNumberButtons, listOfOperatorButtons, listOfAdditionalButtons);
	}
}