package com.app.calculator.ui;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Buttons {
	
	public static ArrayList<JButton> buildNumberButtons(JFrame frame, JTextField textField) {
		
		ArrayList<JButton> arrayList = new ArrayList<JButton>();
		
		JButton one = new JButton("1");  
		one.setBounds(10, 50, 50, 50);
		JButton two = new JButton("2");  
		two.setBounds(70, 50, 50, 50);
		JButton three = new JButton("3");  
		three.setBounds(130, 50, 50, 50);
		JButton four = new JButton("4");  
		four.setBounds(10, 110, 50, 50);
		JButton five = new JButton("5");  
		five.setBounds(70, 110, 50, 50);
		JButton six = new JButton("6");  
		six.setBounds(130, 110, 50, 50);
		JButton seven = new JButton("7");  
		seven.setBounds(10, 170, 50, 50);
		JButton eight = new JButton("8");  
		eight.setBounds(70, 170, 50, 50);
		JButton nine = new JButton("9");  
		nine.setBounds(130, 170, 50, 50);
		JButton zero = new JButton("0");  
		zero.setBounds(10, 230, 50, 50);
		
		arrayList.add(zero);
		arrayList.add(one);
		arrayList.add(two);
		arrayList.add(three);
		arrayList.add(four);
		arrayList.add(five);
		arrayList.add(six);
		arrayList.add(seven);
		arrayList.add(eight);
		arrayList.add(nine);
		
		ButtonActionListener.setButtonActionListenter(arrayList, textField);
		return arrayList;
		
	}

	public static ArrayList<JButton> buildOperatorButtons(JFrame frame, JTextField textField) {
		
		ArrayList<JButton> arrayList = new ArrayList<JButton>();
		
		JButton add = new JButton("+");  
		add.setBounds(190, 50, 50, 50);
		JButton subtract = new JButton("-");  
		subtract.setBounds(190, 110, 50, 50);
		JButton multiply = new JButton("x");  
		multiply.setBounds(190, 170, 50, 50);
		JButton divide = new JButton("/");  
		divide.setBounds(190, 230, 50, 50);
		JButton equals = new JButton("=");  
		equals.setBounds(130, 230, 50, 50);
		
		arrayList.add(add);
		arrayList.add(subtract);
		arrayList.add(multiply);
		arrayList.add(divide);
		arrayList.add(equals);
		
		return arrayList;
	}
	
	public static ArrayList<JButton> buildAdditionalButtons(JFrame frame, JTextField textField) {
		
		ArrayList<JButton> arrayList = new ArrayList<JButton>();
		
		JButton cancel = new JButton("C");  
		cancel.setBounds(70, 230, 50, 50);
		arrayList.add(cancel);
		
		return arrayList;
	}
	
}


