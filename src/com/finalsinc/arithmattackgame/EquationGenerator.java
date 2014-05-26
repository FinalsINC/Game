package com.finalsinc.arithmattackgame;

public interface EquationGenerator {

	public Equation newEquation();

	public boolean checkValidity(int firstValue, int secondValue, int operation);
}