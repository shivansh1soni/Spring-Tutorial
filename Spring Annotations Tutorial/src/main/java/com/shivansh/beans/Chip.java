package com.shivansh.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {

    public Chip(){
        System.out.println("Chip :: Constructor....");
    }

    public String chipType() {
        return "32-Bit";
    }

}
