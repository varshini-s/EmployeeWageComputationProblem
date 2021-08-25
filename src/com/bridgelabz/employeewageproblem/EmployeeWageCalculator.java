package com.bridgelabz.employeewageproblem;

public class EmployeeWageCalculator {
	
	int empHours,totalEmpWage,totalEmpHours,totalWorkDays;

	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_WORK_HOURS=100;

	
	public EmployeeWageCalculator() 
	
	{
		empHours=0;
		totalEmpWage=0;
		totalEmpHours=0;
		totalWorkDays=0;
		
		
	}
	
	public static void checkEmployeeType(EmployeeWageCalculator Employee)
	{
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		
		switch(empCheck) {
		
			case IS_FULL_TIME:
				Employee.empHours=8;
				break;
			case IS_PART_TIME:
				Employee.empHours=4;
				break;
			default:
				Employee.empHours=0;
		
			
		}
		
	}
	
	public static void calculateEachDayWage(EmployeeWageCalculator Employee)
	{
		while(Employee.totalEmpHours<=MAX_WORK_HOURS && Employee.totalWorkDays<NUM_OF_WORKING_DAYS)
		{
			
			Employee.totalWorkDays++;
			checkEmployeeType(Employee);
			
			Employee.totalEmpHours+=Employee.empHours;
			System.out.println("Day#:"+Employee.totalWorkDays+" Emp hours:"+Employee.empHours);
			
			
		}
	}
	
	public static void calculateEachMonthWage(EmployeeWageCalculator Employee)
	{
		Employee.totalEmpWage=Employee.totalEmpHours*EMP_RATE_PER_HOUR;
		
	}
	
	public static void main(String args[]) 
	{
	
	System.out.println("*-------------Welcome to Employee Wage Computation Program-------------*");
	
	EmployeeWageCalculator Employee1 = new EmployeeWageCalculator();
	
	//variables
	calculateEachDayWage(Employee1);
	calculateEachMonthWage(Employee1);
	
	System.out.println("Total Employee wage:"+Employee1.totalEmpWage);
	
	
	}
	

}
