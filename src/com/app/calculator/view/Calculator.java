package com.app.calculator.view;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.model.InputVO;

public class Calculator {
	
	public Calculator() {
		
		//MODEL
		InputVO inputModel = new InputVO();
		
		//VIEW
		JFrame frame = Frame.buildFrame();
		JTextField textField = TextField.buildTextField();
		Buttons button = new Buttons();
		List<JButton> listOfNumberButtons = button.buildNumericButtons(frame, textField, inputModel);
		List<JButton> listOfOperatorButtons = button.buildOperatorButtons(frame, textField, inputModel);
		List<JButton> listOfAnotherButtons = button.buildClearAndEqualButtons(frame, textField, inputModel);
		Frame.addToFrame(frame, textField, listOfNumberButtons, listOfOperatorButtons, listOfAnotherButtons);
	}
}
