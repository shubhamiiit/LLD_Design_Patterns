package StrategyPattern;
import StrategyPattern.Strategy.SportsStrategy;

public class SportsVehicle extends Vechicle{
    SportsVehicle(){
        super(new SportsStrategy());
    }
}
