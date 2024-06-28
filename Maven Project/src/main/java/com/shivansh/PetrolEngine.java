package com.shivansh;

public class PetrolEngine implements IEngine{
    @Override
    public int start() {
        System.out.println("Petrol Engine car started........");
        return 1;
    }
}
