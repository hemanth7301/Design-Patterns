package NullObject;

public class Main{
    public static void main(String args[]){
        Vehicle car= VehicleFactory.getVehicle("Car");
        printVehicleDetails(car);

        Vehicle bike= VehicleFactory.getVehicle("bike");
        printVehicleDetails(bike);
    }
    public static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Vehicle seat capacity is "+vehicle.getSeatCapacity());
        System.out.println("Vehicle tank capacity is "+vehicle.getTankCapacity());
    }
}