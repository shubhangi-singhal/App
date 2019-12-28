package com.app;

public class Employee {
private int empId;
private String empNm;
public Employee()
{
	System.out.println("Default Constructor");
}
public Employee(int empId, String empNm) {
	
	this.empId = empId;
	this.empNm = empNm;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpNm() {
	return empNm;
}
public void setEmpNm(String empNm) {
	this.empNm = empNm;
}

public String toString() {
	return "Employee [empId=" + empId + ", empNm=" + empNm + "]";
}
public void display() {
	
	System.out.println("Employee Details +empId+emp");
}
}
