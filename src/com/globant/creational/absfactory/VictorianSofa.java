package com.globant.creational.absfactory;

public class VictorianSofa implements Sofa{

    VictorianSofa(){
        createSofa();
    }

    @Override
    public void createSofa() {
        System.out.println("Victorian Sofa created");
    }
}
