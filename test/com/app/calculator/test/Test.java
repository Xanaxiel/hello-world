package com.app.calculator.test;

import static com.app.calculator.view.Frame.buildFrame;
import static com.app.calculator.view.TextField.buildTextField;

import com.app.calculator.Calculator;
import com.app.calculator.view.bean.InputVO;

public class Test {

	public static void main(String[] args) {
		Calculator app = new Calculator(new InputVO(), buildFrame(), buildTextField());
		app.renderCalculator();
	}
}
