package com.app.calculator.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.calculator.buttonActions.CancelButtonAction;
import com.app.calculator.buttonActions.FirstNumberAction;
import com.app.calculator.buttonActions.SecondNumberAction;
import com.app.calculator.controller.CalculatorController;
import com.app.calculator.model.InputVO;

/**
 * 
 * @author miguelalvarez
 *
 */
public class Buttons {
	
	private List<JButton> buttonList = new ArrayList<JButton>();
	
	/**
	 * 
	 * @param frame
	 * @param textField
	 * @param inputModel
	 * @return
	 */
	public List<JButton> buildNumericButtons(JFrame frame, 
			JTextField textField, InputVO inputModel) {
		buildAndProcessButtons("1", 10, 50, textField, inputModel);
		buildAndProcessButtons("2", 70, 50, textField, inputModel);
		buildAndProcessButtons("3", 130, 50, textField, inputModel);
		buildAndProcessButtons("4", 10, 110, textField, inputModel);
		buildAndProcessButtons("5", 70, 110, textField, inputModel);
		buildAndProcessButtons("6", 130, 110, textField, inputModel);
		buildAndProcessButtons("7", 10, 170, textField,inputModel);
		buildAndProcessButtons("8", 70, 170, textField, inputModel);
		buildAndProcessButtons("9", 130, 170, textField, inputModel);
		buildAndProcessButtons("0", 10, 230, textField, inputModel);
		return buttonList;
	}
	
	/**
	 * 
	 * @param frame
	 * @param textField
	 * @param inputModel
	 * @return
	 */
	public List<JButton> buildOperatorButtons(JFrame frame, 
			JTextField textField, InputVO inputModel) {
		buildAndProcessButtons("+", 190, 50, textField, inputModel);
		buildAndProcessButtons("-", 190, 110, textField, inputModel);
		buildAndProcessButtons("x", 190, 170, textField, inputModel);
		buildAndProcessButtons("/", 190, 230, textField, inputModel);
		return buttonList;
	}
	
	/**
	 * 
	 * @param frame
	 * @param textField
	 * @param inputModel
	 * @return
	 */
	public List<JButton> buildClearAndEqualButtons(JFrame frame, 
			JTextField textField, InputVO inputModel) {
		buildAndProcessButtons("C", 70, 230, textField, inputModel);
		buildAndProcessButtons("=", 130, 230, textField, inputModel);
		return buttonList;
	}
	
	/**
	 * 
	 * @param buttonLabel
	 * @param xPosition
	 * @param yPosition
	 * @param textField
	 * @param inputVo
	 * @return
	 */
	public JButton buildAndProcessButtons(String buttonLabel, int xPosition, int yPosition, 
			JTextField textField, InputVO inputVo){
		
		CalculatorController controller = new CalculatorController();
		
		int width = 50;
		JButton button = new JButton(buttonLabel);
		button.setBounds(xPosition, yPosition, width, width);
		
		buttonList.add(button);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					boolean isOperated = isOperated(button, inputVo);
					ActionListener action = null;
					
					if (inputVo.isFirstNumber())
					{
						action = new FirstNumberAction(textField, inputVo, button);
					}
					else if (inputVo.isSecondNumber()) {
						action = new SecondNumberAction(textField, inputVo, 
								controller, button, isOperated);
					}
					else if(button.getText().equalsIgnoreCase("C"))
					{
						action = new CancelButtonAction(textField, inputVo);
					}
					
					action.actionPerformed(e);
					isOperated = false;
				}
			});
		return button;
	}
	
	/**
	 * 
	 * @param button
	 * @param inputVo
	 * @return
	 */
	private boolean isOperated(JButton button, InputVO inputVo) {
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
