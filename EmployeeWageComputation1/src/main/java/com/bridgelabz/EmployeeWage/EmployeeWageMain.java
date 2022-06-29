package com.bridgelabz.EmployeeWage;

public class EmployeeWageMain {
    public static final int isPartTime = 1;
	public static final int isFullTime = 2;
    public void calculateWage(String company,int wagePerHour,int workingDays,int hrsInMonth)
	{
        int workingHrs = 0;
		int dailyWage = 0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs <= hrsInMonth && totalWorkingDays < workingDays) {
			totalWorkingDays++;
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
		totalEmpHrs += workingHrs;		
		dailyWage = workingHrs * wagePerHour;
		System.out.println("Day:" + totalWorkingDays + " Worked Hrs:" + workingHrs+" Daily Wage is:"+dailyWage);		
       }
		int totalEmpWage = totalEmpHrs * wagePerHour;
		System.out.println("\nTotal Employee Wage of company : " + company+" is :" +totalEmpWage); 
		
}
	public static void main(String[] args)
	{
		//printing welcome message
		System.out.println("Welcome To Employee Wage Compuatation Program.");
		//creating class object
		EmployeeWageMain wage=new EmployeeWageMain();
		wage.calculateWage("D MART",20,20,10); //calling function using object
	    wage.calculateWage("Jio Mart",15,22,20);
  	    wage.calculateWage("Big Basket",25,24,30);
	}
}
