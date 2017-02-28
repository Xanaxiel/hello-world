package com.app.calculator.intf.impl;

import com.app.calculator.intf.ArithmeticOperation;

/**
 * 
 * @author Miguel Alvarez
 *
 */
public class Division implements ArithmeticOperation<Long>{

	@Override
	public Long computeResult(Long firstInput, Long secondInput) {
		return firstInput/secondInput;
	}

}
