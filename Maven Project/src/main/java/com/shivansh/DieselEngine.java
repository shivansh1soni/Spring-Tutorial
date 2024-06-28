package com.shivansh;

public class DieselEngine implements IEngine{
    @Override
    public int start() {
        System.out.println("Diesel Engine car started........");
        return 1;
    }
}
