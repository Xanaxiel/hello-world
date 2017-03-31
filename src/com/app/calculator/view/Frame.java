package com.app.calculator.view;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame {

	public static JFrame buildFrame() {
		JFrame frame = new JFrame();
		frame.setSize(265,330);
		return frame;
	}
	
	public static void addToFrame(JFrame frame, JTextField textField, List<JButton> listOfNumberButtons,
			List<JButton> listOfOperatorButtons, List<JButton> listOfAnotherButtons ){
		frame.add(textField);
		frame.setLayout(null);  
		frame.setVisible(true);
		for (JButton jButton : listOfNumberButtons) {
			frame.add(jButton);
		}
		for (JButton jButton : listOfOperatorButtons) {
			frame.add(jButton);
		}
		for (JButton jButton : listOfAnotherButtons) {
			frame.add(jButton);
		}
	}
}