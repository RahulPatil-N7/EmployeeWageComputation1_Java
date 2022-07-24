package com.bridgelabz.EmployeeWage;

public interface IEmployeeWage {
	//employee wage calculation methods
	public void addCompanyEmpWage(String company, int wagePerHour, int workingDays, int hrsInMonth);
	public void calculateWage();
	public int calculateWage(CompanyEmpWage companyEmpWage);

}
