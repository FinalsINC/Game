package com.finalsinc.arithmattack;

public interface EquationGenerator {
	
	public Equation newEquation();
	
	public boolean checkValidity(int firstValue,int secondValue,int operation);
}
