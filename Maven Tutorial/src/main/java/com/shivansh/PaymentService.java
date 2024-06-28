package com.shivansh;

public class PaymentService {

    private IPayment payment;

    public PaymentService(){
//        System.out.println("Payment Service 0 - constructor called....");
    }

    public PaymentService(IPayment payment) {
//        System.out.println("Payment Service 1 - constructor called....");
        this.payment = payment;
    }

    public void setPayment(IPayment payment){
        System.out.println("Setter method called...");
        this.payment = payment;
    }

    public void doPayment(double amount) {
        boolean status = payment.processPayment(amount);
        if (status) {
            System.out.println("Payment done....");
        } else {
            System.out.println("Payment not done");
        }
    }

}
