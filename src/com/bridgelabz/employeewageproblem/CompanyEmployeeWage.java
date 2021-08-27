package com.bridgelabz.employeewageproblem;

public class CompanyEmployeeWage 

{
	
	private final String company;
	public  final int employeeRatePerHour;
	public  final int numberOfWorkingDays;
	public  final int maximumWorkHours;
	private int totalEmpWage=0;
	
	public CompanyEmployeeWage(String company,int employeeRatePerHour,int numberOfWorkingDays,int maximumWorkHours) 
	
	{
		this.company = company;
		this.employeeRatePerHour = employeeRatePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maximumWorkHours = maximumWorkHours;
	}
	
	public void setTotalEmployeeWage(int totalEmpWage)
	{
		
		this.totalEmpWage=totalEmpWage;
	}
	
	public String toString()
	{
		return "total emp wage for company "+company+"is :"+totalEmpWage;
	}
		

}
