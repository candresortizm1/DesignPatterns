package com.globant.creational.absfactory;

public class VictorianChair implements Chair{

    VictorianChair(){
        createChair();
    }

    @Override
    public void createChair() {
        System.out.println("Victorian Chair created");
    }
}
