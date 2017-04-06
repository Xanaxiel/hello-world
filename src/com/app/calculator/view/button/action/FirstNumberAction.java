package com.app.calculator.view.button.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.app.calculator.view.bean.InputVO;

/**
 * 
 * @author miguelalvarez
 *
 */
public class FirstNumberAction implements ActionListener{
	
	private JTextField textField;
	private InputVO inputVo;
	private JButton button;

	/**
	 * 
	 * @param textField
	 * @param inputVo
	 * @param button
	 */
	public FirstNumberAction(JTextField textField, InputVO inputVo, JButton button) {
		super();
		this.textField = textField;
		this.inputVo = inputVo;
		this.button = button;
	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		inputVo.setFirstNum(inputVo.getFirstNum() + Long.parseLong(button.getText()));
		textField.setText(String.valueOf(inputVo.getFirstNum()));
	}

}
