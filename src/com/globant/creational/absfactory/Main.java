package com.globant.creational.absfactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory;
        factory = new ModernFurnitureFactory();
        factory.createChair();
        factory.createSofa();
        factory = new VictorianFurnitureFactory();
        factory.createChair();
        factory.createSofa();
    }
}
