package StrategyPattern;
import StrategyPattern.Strategy.SportsStrategy;

public class OffRoadVehicle extends Vechicle{
    OffRoadVehicle(){
        super(new SportsStrategy());
    }
}
