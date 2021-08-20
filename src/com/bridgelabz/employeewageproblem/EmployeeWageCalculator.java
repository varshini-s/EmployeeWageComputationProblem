package com.bridgelabz.employeewageproblem;

public class EmployeeWageCalculator {
	
	public static void main(String args[]) {
	
	System.out.println("*-------------Welcome to Employee Wage Computation Program-------------*");
	
	//Constants
	int IS_FULL_TIME=1;
	//Computations
	double empCheck=Math.floor(Math.random()*10)%2;
	
	if(IS_FULL_TIME==empCheck)
	{
		System.out.println("Employee is Present");
	}
	else
	{
		System.out.println("Employee is absent");
	}
	
	}
	

}
