package StrategyPattern;
import StrategyPattern.Strategy.NormalStrategy;

public class GoodsVehicle extends Vechicle{
    GoodsVehicle(){
        super(new NormalStrategy());
    }
}
