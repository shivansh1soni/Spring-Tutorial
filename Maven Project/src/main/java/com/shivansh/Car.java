package com.shivansh;

public class Car {

    private final IEngine eng;

    /*public Car(){
        System.out.println("0 parameter constructor");
    }*/

    public Car(IEngine eng){
        System.out.println("parameterised constructor");
        this.eng = eng;
    }

    /*public void setEng(IEngine eng){
        this.eng = eng;
    }*/



    public void drive(){
        int status = eng.start();
        if(status==1){
            System.out.println("Journey Started.........");
        }else{
            System.out.println("Engine not started....");
        }
    }

}
