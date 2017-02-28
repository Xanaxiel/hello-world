package com.app.calculator.ui;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Screen {

	public static JTextField buildTextField(JFrame frame) {
		JTextField screen = new JTextField();
		screen.setBounds(10, 10, 230, 30);
		frame.add(screen);
		return screen;
	}
}
