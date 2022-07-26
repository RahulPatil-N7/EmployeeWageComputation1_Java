package com.bridgelabz.EmployeeWage;

import java.util.ArrayList;

public class EmployeeWageMain implements IEmployeeWage {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	
	ArrayList<CompanyEmpWage> companyList = new ArrayList<CompanyEmpWage>();
	
	public void addCompanyEmpWage(String company, int wagePerHour, int workingDays, int hrsInMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, wagePerHour, workingDays, hrsInMonth);
		companyList.add(companyEmpWage);
	}
	
	public void calculateWage() {
		for (int i = 0; i < companyList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyList.get(i);
			companyEmpWage.setTotalEmpWage(this.calculateWage(companyEmpWage));
		}
	}
	
	/*This method uses random to check if employee is present or 
	 *absent while checking condition that total 100 working hrs
	 *& total 20 working days are reached.Then returns total employee 
	 *wage */
	public int calculateWage(CompanyEmpWage companyEmpWage) {
    	int workingHrs = 0;
		int totalEmpHrs = 0,totalWorkingDays = 0;
		while(totalEmpHrs <= companyEmpWage.hrsInMonth && totalWorkingDays < companyEmpWage.workingDays) {
			totalWorkingDays++;
			//using random() to check attendance 
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch(empCheck) {
				case isPartTime:
					workingHrs = 4;
					break;
				case isFullTime:
					workingHrs = 8;
					break;
				default:	
					workingHrs = 0;
			}
			totalEmpHrs += workingHrs;
			//dailyWage = workingHrs * companyEmpWage.wagePerHour;
			//System.out.println("Day:" + totalWorkingDays + " Worked Hrs:" + workingHrs+ " Daily Wage :"+dailyWage);		
		}
		return totalEmpHrs * companyEmpWage.wagePerHour; 
	}
    
	public void getTotalEmpWage(String companyName) {
		for (int i = 0; i < companyList.size(); i++) {
			String name = companyList.get(i).company;
			if (name.equals(companyName)) {
				int totalWage = companyList.get(i).totalEmpWage;
				System.out.println("-->Total Employee Wage of "+ companyName +" is :" + totalWage);
				break;
			} 
			else {
				continue;
			}
		}
	 }
	
	public static void main(String[] args) {
		//printing welcome message
		System.out.println("Welcome To Employee Wage Compuatation Program.\n");
		//creating class object
		EmployeeWageMain wage = new EmployeeWageMain();
		//calculating wage for multiple companies using object
		wage.addCompanyEmpWage("DMart",20,24,120);
		wage.addCompanyEmpWage("Jio Mart",10,20,100);
		wage.addCompanyEmpWage("Big Basket",24,22,80);
		wage.calculateWage();
		/* Getting the total wage when queried 
		 * by company */
		wage.getTotalEmpWage("DMart");
		wage.getTotalEmpWage("Jio Mart");
		wage.getTotalEmpWage("Big Basket");
	}
}
