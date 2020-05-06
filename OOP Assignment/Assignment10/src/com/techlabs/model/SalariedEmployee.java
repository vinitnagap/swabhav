package com.techlabs.model;

public interface SalariedEmployee {

	double calculateNetSalary(int lectures);

	void updateSalary(int lectures);

	double getNetSalary();

	double getSalaryPerLecture();
}
