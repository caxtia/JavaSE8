package com.example;

import javax.lang.model.util.ElementScanner14;

public class CheckingAccount extends Account{
    

    private final double overDraftLimit;


    public CheckingAccount(double balance) {
       this(balance,0);
        // TODO Auto-generated constructor stub
    }

    public CheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
         
    }

    



    @Override
    public boolean withdraw(double amount) {

        if(amount <= balance + overDraftLimit){
            balance= balance - amount;
            return false;
        }
        else        
            return false;
    }

    @Override
    public String getDescription() {
        return "Checking Account";
    }

    
}
