package com.timcoville.calculator;

public class Calculator implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double results;
	private double operandOne;
	private double operandTwo;
	private String operation;
	
	public Calculator() {
	}

	public void getResults() {
		System.out.println(results);
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public void setOperation(String operation) {
		if (operation == "+" || operation == "-") {
			this.operation = operation;
		}
		else {
			System.out.println("Operation not valid");
		}
	}
	
	public void performOperation() {
		if (operation == "+") {
			results = operandOne + operandTwo;
		}
		if (operation == "-") {
			results = operandOne - operandTwo;
		}	
	}
	
}
