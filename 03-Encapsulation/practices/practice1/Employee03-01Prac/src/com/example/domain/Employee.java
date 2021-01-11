package com.example.domain;

public class Employee {

    public int empId;
    public String name;
    public String ssn;
    public double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
    public Employee() {
	}
	public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }


    public String getSsn() {
        return ssn;
    }

    public void raiseSalary(double increase){
        salary += increase;
    }
    
	public void setEmpId(int i) {
	}

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println("id: "+getEmpId()+" name: "+getName()+" ssn: "+getSsn()+ " Salary: "+getSalary());
    }


}
