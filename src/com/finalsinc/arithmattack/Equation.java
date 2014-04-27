package com.finalsinc.arithmattack;

public class Equation {
	int firstValue;
	int secondValue;
	int operation;
	
	public Equation (int first, int second, int op)
	{
		firstValue = first;
		secondValue = second;
		operation = op;
	}
	
	public int getFirstValue()
	{
		return firstValue;
	}
	
	public int getSecondValue()
	{
		return secondValue;
	}
	
	public int getOperation()
	{
		return operation;
	}
}
