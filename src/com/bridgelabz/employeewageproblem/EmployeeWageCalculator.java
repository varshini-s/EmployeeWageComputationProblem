package com.bridgelabz.employeewageproblem;

public class EmployeeWageCalculator 
{
	
	
	//Global constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	private final String company;
	public  final int employeeRatePerHour;
	public  final int numberOfWorkingDays;
	public  final int maximumWorkHours;
	private int totalEmpWage=0;
	
	public EmployeeWageCalculator(String company,int employeeRatePerHour,int numberOfWorkingDays,int maximumWorkHours) 
	
	{
		this.company = company;
		this.employeeRatePerHour = employeeRatePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maximumWorkHours = maximumWorkHours;
		
	}

	public  void computeEmployeeWage()
	{

			//variables
			int empHours=0,totalEmpHours=0,totalWorkDays=0;
			
			//Computations
			while(totalEmpHours<=maximumWorkHours && totalWorkDays<numberOfWorkingDays){
				
				totalWorkDays++;
				
				int empCheck=(int)Math.floor(Math.random()*10)%3;
				
				switch(empCheck) {
				
					case IS_FULL_TIME:
						empHours=8;
						break;
					case IS_PART_TIME:
						empHours=4;
						break;
					default:
						empHours=0;
				
					
				}
				totalEmpHours+=empHours;
				System.out.println("Day#:"+totalWorkDays+" Emp hours:"+empHours);
				
				
			}
			
			
			 totalEmpWage=totalEmpHours*employeeRatePerHour;
			
			
	}
	
	public String toString()
	{
		return "total emp wage for company "+company+"is :"+totalEmpWage;
	}
		
	
	
	public static void main(String args[]) 
	{
	
		System.out.println("*-------------Welcome to Employee Wage Computation Program-------------*");
		
		EmployeeWageCalculator dmart = new EmployeeWageCalculator("Dmart",20,20,100);
		dmart.computeEmployeeWage();
		System.out.println(dmart);
		EmployeeWageCalculator reliance = new EmployeeWageCalculator("Reliance",20,20,100);
		reliance.computeEmployeeWage();
		System.out.println(reliance);

		
	
	}
	

}
