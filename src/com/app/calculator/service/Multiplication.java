package com.app.calculator.service;

/**
 * 
 * @author Miguel Alvarez
 *
 */
public class Multiplication implements ArithmeticOperation<Long>{

	@Override
	public Long computeResult(Long firstInput, Long secondInput) {
		return firstInput*secondInput;
	}

}
