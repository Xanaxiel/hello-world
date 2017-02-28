package com.app.calculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {
	
	private String firstNumber = "";
	private String secondNumber = "";
	private String operationSymbol = "";
	
	public Calculator() {
		JFrame frame = new JFrame();
		frame.setSize(265,330);
		JTextField screen = new JTextField();
		screen.setBounds(10, 10, 230, 30);
		frame.add(screen);
		
		//Create buttons and put inside array list
		List<JButton> listOfNumberButtons = Buttons.buildNumberButtons(frame);
		List<JButton> listOfOperatorButtons = Buttons.buildOperationButtons(frame);
		
		//Add number buttons to frame
		addButtonsToFrame(frame, listOfNumberButtons);
		addButtonsToFrame(frame, listOfOperatorButtons);
		
		setButtonActionListenter(listOfNumberButtons, listOfOperatorButtons, screen);
		setOperatorButtonActionListener(screen, listOfOperatorButtons);
		
		frame.setLayout(null);  
		frame.setVisible(true);
		
		
	}

	private void setOperatorButtonActionListener(JTextField screen, List<JButton> listOfOperatorButtons) {
		JButton buttonAdd = listOfOperatorButtons.get(0);
		buttonAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operationSymbol = "+";
				screen.setText(operationSymbol);
			}
		});
	}
	
	public void setButtonActionListenter(List<JButton> listOfNumberButtons,
			List<JButton> listOfOperationsButtons, JTextField screen){

		for (int i = 0; i <= 9; i++) {
			JButton button = listOfNumberButtons.get(i);
			Integer number = i;
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					firstNumber += number.toString();
					screen.setText(firstNumber);
				}
			});
		}
		
		for (int i = 0; i <= 9; i++) {
			JButton button = listOfNumberButtons.get(i);
			Integer number = i;
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					secondNumber += number.toString();
					screen.setText(secondNumber);
				}
			});
		}
	}
	private void addButtonsToFrame(JFrame frame, List<JButton> listOfButtons) {
		for (JButton jButton : listOfButtons) {
			frame.add(jButton);
		}
	}
}