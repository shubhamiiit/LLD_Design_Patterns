package AbstractFactoryPattern;

public class Ordinary implements VehicleFactory{
    
    @Override
    public Vehicle getVehicle(String input){
        switch (input) {
            case "HONDA":
                return new OrdV1();
            case "HYUNDAI":
                return new OrdV2();
            default:
                return null;
        }
    }
}
