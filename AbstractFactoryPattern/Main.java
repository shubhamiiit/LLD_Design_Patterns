package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        VehicleTypeFactory vehicleTypeFactory = new VehicleTypeFactory();
        VehicleFactory vehicleFactory = vehicleTypeFactory.getVehicleType("LUXURY");
        Vehicle vehicle = vehicleFactory.getVehicle("BMW");
        vehicle.mileage();
    }
}
