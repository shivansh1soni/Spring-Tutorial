package com.shivansh;

public class DebitPayment implements IPayment{


    /*public DebitPayment(){
        System.out.println("Debit card constructor called....");
    }*/

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Debit card payment successful.....");
        return true;
    }
}
