package NullObject;

public class VehicleFactory {
    public static Vehicle getVehicle(String typeOfVehicle){
        if("Car".equals(typeOfVehicle)){
            return new Car();
        }
        return new NullObject(); //return null
    }
}
