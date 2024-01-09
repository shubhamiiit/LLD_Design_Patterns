package StrategyPattern;
import StrategyPattern.Strategy.DriveStrategy;

public class Vechicle {
    DriveStrategy driveObj;

    // This is known as constructor injection
    Vechicle(DriveStrategy driveObj){
        this.driveObj = driveObj;
    }

    public void drive(){
        driveObj.drive();
    }
}
