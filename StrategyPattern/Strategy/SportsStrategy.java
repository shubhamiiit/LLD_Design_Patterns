package StrategyPattern.Strategy;

public class SportsStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("Sports Strategy Capability");
    }
}
