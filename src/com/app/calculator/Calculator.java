package com.app.calculator;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.util.ButtonBuilder;
import com.app.calculator.view.Frame;
import com.app.calculator.view.bean.InputVO;

/**
 * 
 * @author Miguel Alvarez
 *
 */
public class Calculator {
	
	private InputVO viewObject;
	private JFrame frame;
	private List<JButton> buttons;
	private JTextField textField;
	
	public Calculator(InputVO viewObject, JFrame frame, List<JButton> buttons, JTextField textField) {
		super();
		this.viewObject = viewObject;
		this.frame = frame;
		this.buttons = buttons;
		this.textField = textField;
	}

	public void renderCalculator() {
		List<JButton> buttons = new ButtonBuilder().buildButtons();
		Frame.addToFrame(frame, textField, buttons);
	}
}
