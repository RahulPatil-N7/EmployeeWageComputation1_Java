package com.bridgelabz.EmployeeWage;

public class EmployeeWageMain {

	public static void main(String[] args) {
		//printing Welcome message
		System.out.println("Welcome To Employee Wage Computation Program.");
        int isFullTime = 1;
        //Using random function to check attendance
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == isFullTime)
		{
			System.out.println("Employee is Present.");
		}
		else
		{
			System.out.println("Employee is Absent.");
		}

	}
}
