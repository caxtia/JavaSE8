package com.example.domain;

public class Director extends Employee{
    private double budget;
    
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Director(int empId, String name, String ssn, double salary,double budget){
        super(empId, name, ssn, salary);
    }
}
