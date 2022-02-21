package com.globant.creational.absfactory;

public class ModernChair implements Chair{

    ModernChair(){
        createChair();
    }

    @Override
    public void createChair() {
        System.out.println("Modern chair created");
    }
}
