package com.app.calculator;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.view.Frame;
import com.app.calculator.view.bean.InputVO;
import com.app.calculator.view.button.Buttons;

/**
 * 
 * @author Miguel Alvarez
 *
 */
public class Calculator {
	
	private InputVO viewObject;
	private JFrame frame;
	private JTextField textField;
	
	public Calculator(InputVO viewObject, JFrame frame, JTextField textField) {
		super();
		this.viewObject = viewObject;
		this.frame = frame;
		this.textField = textField;
	}
	
	public void renderCalculator() {
		Buttons button = new Buttons();
		List<JButton> listOfNumberButtons = button.buildNumericButtons(frame, textField, viewObject);
		List<JButton> listOfOperatorButtons = button.buildOperatorButtons(frame, textField, viewObject);
		List<JButton> listOfAnotherButtons = button.buildClearAndEqualButtons(frame, textField, viewObject);
		Frame.addToFrame(frame, textField, listOfNumberButtons, listOfOperatorButtons, listOfAnotherButtons);
	}
}
