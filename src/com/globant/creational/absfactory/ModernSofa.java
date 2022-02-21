package com.globant.creational.absfactory;

public class ModernSofa implements Sofa{

    ModernSofa(){
        createSofa();
    }

    @Override
    public void createSofa() {
        System.out.println("Modern Sofa Created");
    }
}
