package StrategyPattern;

public class NormalCar extends Vehicle {

    NormalCar(){
        super(new NormalDrive());
    }
    
}
