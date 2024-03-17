package StrategyPattern;

public class Main {
    public static void main(String args[]){
        Vehicle vehicleOne = new SuperSUV();
        vehicleOne.drive();

        Vehicle vehicleTwo = new NormalCar();
        vehicleTwo.drive();

        Vehicle vehicleThree = new SportsCar();
        vehicleThree.drive();
    }
}
