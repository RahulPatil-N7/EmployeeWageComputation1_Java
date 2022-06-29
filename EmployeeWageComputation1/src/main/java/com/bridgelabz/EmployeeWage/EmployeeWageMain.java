package com.bridgelabz.EmployeeWage;

public class EmployeeWageMain {

	public static void main(String[] args) {
		//printing Welcome message
		System.out.println("Welcome To Employee Wage Computation Program.");
		int isFullTime = 1;
		int wagePerHour = 20;
		int workingHrs = 0;
		int dailyWage = 0;
		//Using random() to check attendance
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == isFullTime)
		{			
			workingHrs = 8;
		System.out.println("Employee is Present.");
        }
		else
		{	
			workingHrs = 0;
		System.out.println("Employee is Absent.");
		}		
		dailyWage = workingHrs * wagePerHour;
		//printing daily wage
		System.out.println("Employee Daily Wage is: " + dailyWage);
       }
}


