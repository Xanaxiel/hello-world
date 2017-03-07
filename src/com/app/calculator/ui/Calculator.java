package com.app.calculator.ui;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.model.InputModel;

public class Calculator {
	
	public Calculator() {
		
		//MODEL
		InputModel inputModel = new InputModel();
		
		//VIEW
		JFrame frame = Frame.buildFrame();
		JTextField textField = TextField.buildTextField();
		Buttons button = new Buttons();
		List<JButton> listOfNumberButtons = button.buildNumberButtons(frame, textField, inputModel);
		List<JButton> listOfOperatorButtons = button.buildOperatorButtons(frame, textField, inputModel);
		List<JButton> listOfAnotherButtons = button.buildAnotherButtons(frame, textField, inputModel);
		Frame.addToFrame(frame, textField, listOfNumberButtons, listOfOperatorButtons, listOfAnotherButtons);
	}
}
