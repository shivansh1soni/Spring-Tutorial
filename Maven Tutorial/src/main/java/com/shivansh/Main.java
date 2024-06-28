package com.shivansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        PaymentService service = context.getBean(PaymentService.class);
        service.doPayment(50000.00);
    }
}