package com.app.calculator.test;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.Calculator;
import com.app.calculator.util.ButtonBuilder;

public class Test {

	public static void main(String[] args) {
		JTextField textField = new JTextField();
		List<JButton> buttons = new ButtonBuilder().buildButtons();
		JFrame frame = new JFrame();
		
		Calculator app = new Calculator(frame, buttons, textField);
		app.renderCalculator();
	}
}
