package com.bridgelabz.EmployeeWage;

public class CompanyEmpWage {
	public final String company;
	public final int wagePerHour;
	public final int workingDays;
	public final int hrsInMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int wagePerHour, int workingDays, int hrsInMonth) {
		super();
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.hrsInMonth = hrsInMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
    public String toString() {
    	return "\nTotal Employee Wage of company : "  + company+" is :" +totalEmpWage;
    }
	
}

