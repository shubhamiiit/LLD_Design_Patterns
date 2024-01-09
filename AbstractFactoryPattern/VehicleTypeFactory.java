package AbstractFactoryPattern;

public class VehicleTypeFactory {
    public VehicleFactory getVehicleType(String input){
        switch (input) {
            case "LUXURY":
                return new Luxury();
            case "ORDINARY":
                return new Ordinary();
            default:
                return null;
        }
    }
}
