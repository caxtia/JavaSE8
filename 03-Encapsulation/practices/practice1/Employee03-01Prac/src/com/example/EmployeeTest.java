package com.example;

import com.example.domain.Employee;
import com.example.domain.admin;
import com.example.domain.Director;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {

    public static void main(String[] args) {
        
         
       Engineer eng = new Engineer(101,"Jane Smith","012-34-5678", 120_345.27);
       Manager mng = new Manager(207,"Barbara Johnson","054-12-2367",109_501.36,"US Marketing");
       admin adm = new admin(304, "Bill Munroe","108-23-6509",75_002.34);
       Director drt = new Director(12,"Susan Wheeler","099-45-2340",120_567.36,1_000_000.00);

       eng.printEmployee();
       mng.printEmployee();
       adm.printEmployee();
       drt.printEmployee();
    }
}