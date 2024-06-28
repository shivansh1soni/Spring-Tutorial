package com.shivansh;

public class CreditPayment implements IPayment {

    /*public CreditPayment(){
        System.out.println("Credit card constructor called....");
    }*/

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Credit card payment successful....");
        return true;
    }
}
