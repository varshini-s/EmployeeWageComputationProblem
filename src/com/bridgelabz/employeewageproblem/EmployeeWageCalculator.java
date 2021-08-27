package com.bridgelabz.employeewageproblem;

public class EmployeeWageCalculator 
{
	
	
	//Global constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	

	public  static void computeEmployeeWage(String company,int employeeRatePerHour,int numberOfWorkingDays,int maximumWorkHours)
	{

			//variables
			int empHours=0,totalEmpWage=0,totalEmpHours=0,totalWorkDays=0;
			
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
			System.out.println("Total Employee wage:"+totalEmpWage);
			
			
	}
		
	
	
	public static void main(String args[]) 
	{
	
		System.out.println("*-------------Welcome to Employee Wage Computation Program-------------*");
		
		computeEmployeeWage("Dmart",20,20,100);
		computeEmployeeWage("REliance",10,20,80);

		
	
	}
	

}
