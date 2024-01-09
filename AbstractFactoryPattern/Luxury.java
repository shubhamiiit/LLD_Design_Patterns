package AbstractFactoryPattern;

public class Luxury implements VehicleFactory{
    
    @Override
    public Vehicle getVehicle(String input){
        switch (input) {
            case "BMW":
                return new LuxV1();
            case "MERCEDES":
                return new LuxV2();
            default:
                return null;
        }
    }
}
