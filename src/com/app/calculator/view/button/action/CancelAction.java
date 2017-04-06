package com.app.calculator.view.button.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.app.calculator.view.bean.InputVO;

/**
 * 
 * @author miguelalvarez
 *
 */
public class CancelAction implements ActionListener{

	private JTextField textField;
	private InputVO inputVo;

	/**
	 * 
	 * @param textField
	 * @param inputVo
	 */
	public CancelAction(JTextField textField, InputVO inputVo) {
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
	}

}
