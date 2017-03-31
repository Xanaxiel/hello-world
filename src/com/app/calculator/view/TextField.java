package com.app.calculator.view;

import javax.swing.JTextField;

public class TextField {

	public static JTextField buildTextField() {
		JTextField screen = new JTextField();
		screen.setBounds(10, 10, 230, 30);
		return screen;
	}
}
