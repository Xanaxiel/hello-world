package com.app.calculator.buttonActions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.app.calculator.model.InputVO;

/**
 * 
 * @author miguelalvarez
 *
 */
public class CancelButtonAction implements ActionListener{

	private JTextField textField;
	private InputVO inputVo;

	/**
	 * 
	 * @param textField
	 * @param inputVo
	 */
	public CancelButtonAction(JTextField textField, InputVO inputVo) {
		super();
		this.textField = textField;
		this.inputVo = inputVo;
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		textField.setText(null);
		inputVo.setFirstNum("");
		inputVo.setSecondNum("");
		inputVo.setResult("");
		inputVo.setIsFirstNumber(true);
		inputVo.setIsSecondNumber(false);
		inputVo.setIsOperated(false);
	}

}
