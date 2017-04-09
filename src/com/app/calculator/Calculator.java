package com.app.calculator;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 
 * @author Miguel Alvarez
 *
 */
public class Calculator {
	
	private JFrame frame;
	private List<JButton> buttons;
	private JTextField textField;
	
	public Calculator(JFrame frame, List<JButton> buttons, JTextField textField) {
		super();
		this.frame = frame;
		this.buttons = buttons;
		this.textField = textField;
	}

	public void renderCalculator() {
		textField.setBounds(10, 10, 230, 30);
		
		frame.setSize(265,330);
		frame.add(textField);
		frame.setLayout(null);  
		frame.setVisible(true);
		for (JButton button : buttons) {
			frame.add(button);
		}
	}
}
