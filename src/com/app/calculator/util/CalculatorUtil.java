package com.app.calculator.util;

import javax.swing.JButton;

import com.app.calculator.view.bean.CalculatorVO;

/**
 * 
 * @author Miguel Alvarez
 *
 */
public class CalculatorUtil {
	
	/**
	 * 
	 * @param button
	 * @param inputVo
	 * @return
	 */
	public static boolean isOperated(JButton button, CalculatorVO inputVo) {
		if (button.getText().equalsIgnoreCase("+") || 
			button.getText().equalsIgnoreCase("-") ||
			button.getText().equalsIgnoreCase("x") || 
			button.getText().equalsIgnoreCase("/") ||
			button.getText().equalsIgnoreCase("="))
		{
			inputVo.setIsSecondNumber(true);
			inputVo.setIsFirstNumber(false);
			return true;
		}
		return false;
	}
}
