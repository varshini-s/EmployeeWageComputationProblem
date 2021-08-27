package com.bridgelabz.employeewageproblem;

public class EmployeeWageBuilderArray 
{
	
	
	//Global constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	private int numberOfCompany=0;
	private CompanyEmployeeWage[] companyEmpWageArray;
	
	public EmployeeWageBuilderArray() 
	{
		companyEmpWageArray=new CompanyEmployeeWage[5];
		

	}

	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) 
	{

		companyEmpWageArray[numberOfCompany] = new CompanyEmployeeWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numberOfCompany++;
	}
	
	private void computeEmpWage() 
	{
		for(int index=0;index<numberOfCompany;index++) {
			companyEmpWageArray[index].setTotalEmployeeWage(this.computeEmpWage(companyEmpWageArray[index]));
			System.out.println(companyEmpWageArray[index]);
		}
	}

	public int computeEmpWage(CompanyEmployeeWage companyEmpWage) 
	{

		//variables
		int empHours=0,totalEmpWage=0,totalEmpHours=0,totalWorkDays=0;
		
		//Computations
		while(totalEmpHours<=companyEmpWage.maximumWorkHours && totalWorkDays<companyEmpWage.numberOfWorkingDays){
			
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
		
		
		 return totalEmpHours*companyEmpWage.employeeRatePerHour;
		
	}
	
	
	public static void main(String args[]) 
	{
	
		System.out.println("*-------------Welcome to Employee Wage Computation Program-------------*");
		
		EmployeeWageBuilderArray empWageBuilder = new EmployeeWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("dmart", 20, 2, 11);
		empWageBuilder.addCompanyEmpWage("reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();

	
	}
	

}
