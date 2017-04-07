package com.app.calculator.util;

import static com.app.calculator.common.ViewConstants.PADDING;
import static com.app.calculator.common.ViewConstants.WIDTH;
import static com.app.calculator.common.ViewConstants.X_POS;
import static com.app.calculator.common.ViewConstants.Y_POS;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

/**
 * Introduce <code>Builder</code> pattern
 * 
 * @author Xanaxiel
 *
 */
public class ButtonBuilder {
	private List<JButton> buttonList = new ArrayList<JButton>(); 
	
	public List<JButton> buildButtons() {
		buildNumericButtons();
		buildOperatorButtons();
		return buttonList;
	}
	
	private void buildNumericButtons() {
		buttonList.add(buildButton("0", padX(0), padY(3)));
		
		int columnOffset = 0;
		int rowOffset = 0;
		for (int index = 1; index <= 9; index++) {
			buttonList.add(buildButton(String.valueOf(index), padX(columnOffset), padY(rowOffset)));
			if (hasReachedRowLimit(index)) {
				columnOffset++;
			} else {
				columnOffset = 0;
				rowOffset++;
			}
		}
	}

	private void buildOperatorButtons() {
		buttonList.add(buildButton("+", padX(3), padY(0)));
		buttonList.add(buildButton("-", padX(3), padY(1)));
		buttonList.add(buildButton("x", padX(3), padY(2)));
		buttonList.add(buildButton("/", padX(3), padY(3)));
		buttonList.add(buildButton("C", padX(1), padY(3)));
		buttonList.add(buildButton("=", padX(2), padY(3)));
	}

	private JButton buildButton(String buttonLabel, int xPosition, int yPosition) {
		JButton button = new JButton(buttonLabel); 
		button.setBounds(xPosition, yPosition, WIDTH, WIDTH);
		return button;
	}
	
	private boolean hasReachedRowLimit(int index) {
		return index % 3 != 0;
	}
	
	private int padY(int rowOffset) {
		return Y_POS + (PADDING * rowOffset);
	}
	
	private int padX(int columnOffset) {
		return X_POS + (PADDING * columnOffset);
	}
}
