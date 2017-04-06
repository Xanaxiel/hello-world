package com.app.calculator;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.model.CalculatorInputVO;
import com.app.calculator.view.Frame;
import com.app.calculator.view.TextField;
import com.app.calculator.view.button.Buttons;

/**
 * 
 * @author Miguel Alvarez
 *
 */
public class Calculator {
	
	public Calculator() {
		
		//MODEL
		CalculatorInputVO inputModel = new CalculatorInputVO();
		
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
