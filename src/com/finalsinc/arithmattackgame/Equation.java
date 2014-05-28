package com.finalsinc.arithmattackgame;

public class Equation {
	int firstValue;
	int secondValue;
	int operation;
	String eq;

	public Equation(int first, int second, int op) {
		firstValue = first;
		secondValue = second;
		operation = op;
		eq = "";
		eq.concat(Integer.toString(first));
		if(op==0)
			eq.concat("+");
		else if(op==1)
			eq.concat("-");
		else if(op==2)
			eq.concat("*");
		else
			eq.concat("/");
		eq.concat(Integer.toString(second));
	}

	public int getFirstValue() {
		return firstValue;
	}

	public int getSecondValue() {
		return secondValue;
	}

	public int getOperation() {
		return operation;
	}
}
