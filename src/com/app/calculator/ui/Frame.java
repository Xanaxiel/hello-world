package com.app.calculator.ui;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame {

	public static JFrame buildFrame() {
		JFrame frame = new JFrame();
		frame.setSize(265,330);
		return frame;
	}
	
	public static void addToFrame(JFrame frame, JTextField textField, ArrayList<JButton> listOfButtons){
		frame.add(textField);
		frame.setLayout(null);  
		frame.setVisible(true);
		for (JButton jButton : listOfButtons) {
			frame.add(jButton);
		}
	}
}