package com.app.calculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Buttons {
	
	private ArrayList<JButton> arrayList = new ArrayList<JButton>();
	
	public ArrayList<JButton> buildNumberButtons(JFrame frame, JTextField textField) {
		
		createAndAddButton("1", 10, 50, textField);
		createAndAddButton("2", 70, 50, textField);
		createAndAddButton("3", 130, 50, textField);
		createAndAddButton("4", 10, 110, textField);
		createAndAddButton("5", 70, 110, textField);
		createAndAddButton("6", 130, 110, textField);
		createAndAddButton("7", 10, 170, textField);
		createAndAddButton("8", 70, 170, textField);
		createAndAddButton("9", 130, 170, textField);
		createAndAddButton("0", 10, 230, textField);
		createAndAddButton("+", 190, 50, textField);
		createAndAddButton("-", 190, 110, textField);
		createAndAddButton("x", 190, 170, textField);
		createAndAddButton("/", 190, 230, textField);
		createAndAddButton("=", 130, 230, textField);
		createAndAddButton("C", 70, 230, textField);
		
		return arrayList;
	}

	public JButton createAndAddButton(String label, int xPos, int yPos, JTextField textField){
		
		int WIDTH = 50;
		JButton button = new JButton(label);
		button.setBounds(xPos, yPos, WIDTH, WIDTH);
		arrayList.add(button);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(button.getText());
				}
			});
		return button;
	}
}


