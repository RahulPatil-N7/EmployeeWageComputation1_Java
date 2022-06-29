package com.bridgelabz.EmployeeWage;

public class EmployeeWageMain {
    public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int wagePerHour = 20;
    public static void main(String[] args) {
		//printing welcome message
		System.out.println("Welcome To Employee Wage Compuatation Program.");
		int workingHrs = 0;
		int dailyWage = 0;
		//using random() to check attendance 
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		//Using Switch case
		switch(empCheck) {
		case isPartTime:
	        workingHrs = 4;
		System.out.println("Employee is Present for "+workingHrs+" Hrs.");
		break;
		case isFullTime:
			workingHrs = 8;
		System.out.println("Employee is Present for "+workingHrs+" Hrs.");
		break;
		default:	
			workingHrs = 0;
		System.out.println("Employee is Absent");
		}
		//printing daily wage
		dailyWage = workingHrs * wagePerHour;
		System.out.println("Daily Wage is : " + dailyWage);
       }
}


