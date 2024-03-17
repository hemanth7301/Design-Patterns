package StrategyPattern;

public class SuperSUV extends Vehicle {

    SuperSUV(){
        super(new SportsDrive());
    }
    
}
