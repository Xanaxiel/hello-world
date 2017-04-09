package com.app.calculator.service;

/**
 * <pre>
 * Interface for use to demonstrate the OOP concept of Polymorphism, specifically the usage of generics.
 * </pre>  
 * 
 * @author Cy
 * @param <T> - a number such that type {@code T} is a primitive {@code byte, double, float, int, long,} and {@code short}
 * 
 * @see Number
 * 
 */
public interface ArithmeticOperation<T extends Number> {
	/**
	 * <pre>
	 * Provide an implementation in the concrete class such that the operation is executed on the number type.
	 * <pre>
	 * 
	 * @param firstInput 
	 * @param secondInput
	 * @return the result of the operation
	 */
	T computeResult(T firstInput, T secondInput);
}
