package StrategyPattern;

public class SportsCar extends Vehicle {

    SportsCar(){
        super(new SportsDrive());
    }
    
}
