package com.app.calculator.intf;

/**
 * <pre>
 * Interface for use to demonstrate the OOP concept of Polymorphism, specifically the usage of generics.
 * </pre>  
 * 
 * @author Cy
 * @param <T> - a number such that type {@code T} is a primitive {@code byte, double, float, int, long,} and {@code short}
 * @see Number
 * 
 */
public interface ArithmeticOperation<T extends Number> {
	T computeResult(T firstInput, T secondInput);
}
