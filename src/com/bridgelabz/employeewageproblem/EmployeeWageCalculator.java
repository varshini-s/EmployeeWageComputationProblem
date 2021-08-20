package com.bridgelabz.employeewageproblem;

public class EmployeeWageCalculator {
	
	public static void main(String args[]) {
	
	System.out.println("*-------------Welcome to Employee Wage Computation Program-------------*");
	
	//Constants
	int IS_FULL_TIME=1;
	int IS_PART_TIME=2;
	int EMP_RATE_PER_HOUR=20;
	
	//variables
	int empHours=0;
	int empWage=0;
	
	//Computations
	double empCheck=Math.floor(Math.random()*10)%3;
	
	if(IS_FULL_TIME==empCheck)
	{
		empHours=8;
	}
	else if(IS_PART_TIME==empCheck)
	{
		empHours=4;
	}
	else
	{
		empHours=0;
	}
	empWage=empHours*EMP_RATE_PER_HOUR;
	System.out.println("Employee wage:"+empWage);
	
	}
	

}
