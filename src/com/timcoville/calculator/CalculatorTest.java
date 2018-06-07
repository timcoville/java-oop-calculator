package com.timcoville.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOperandOne(10.5);
		calc.setOperation("-");
		calc.setOperandTwo(5.5);
		calc.performOperation();
		calc.getResults();
	}
	
}
