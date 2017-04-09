package com.app.calculator.service;

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
