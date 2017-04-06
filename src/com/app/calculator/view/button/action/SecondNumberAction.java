package com.app.calculator.view.button.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.app.calculator.controller.CalculatorController;
import com.app.calculator.model.CalculatorInputVO;

/**
 * 
 * @author miguelalvarez
 *
 */
public class SecondNumberAction implements ActionListener{

	private JTextField textField;
	private CalculatorInputVO inputVo;
	private CalculatorController controller;
	private JButton button;
	private boolean isOperated;
	
	/**
	 * 
	 * @param textField
	 * @param inputVo
	 * @param controller
	 * @param button
	 * @param isOperated
	 */
	public SecondNumberAction(JTextField textField, CalculatorInputVO inputVo, CalculatorController controller, JButton button,
			boolean isOperated) {
		super();
		this.textField = textField;
		this.inputVo = inputVo;
		this.controller = controller;
		this.button = button;
		this.isOperated = isOperated;
	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if(isOperated)
		{
			//EQUALS
			if (button.getText().equalsIgnoreCase("="))
			{
				controller.displayResult(inputVo, textField);
			}
			else
			{
				//OPERATORS
				if(	button.getText().equalsIgnoreCase("+") || 
					button.getText().equalsIgnoreCase("-") ||
					button.getText().equalsIgnoreCase("x") || 
					button.getText().equalsIgnoreCase("/") )
				{
					inputVo.setOperator((button.getText()));
					textField.setText(inputVo.getOperator());
					
					if (!inputVo.getResult().isEmpty()) 
					{
						inputVo.setFirstNum(inputVo.getResult());
						inputVo.setResult("");
						inputVo.setOperator(inputVo.getOperator());
					}
				}
			}
		}
		else
		{
			//NUMERALS
			inputVo.setSecondNum((inputVo.getSecondNum() + button.getText()));
			textField.setText(inputVo.getSecondNum());	
		}
	}

}
