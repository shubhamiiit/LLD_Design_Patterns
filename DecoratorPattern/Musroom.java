package DecoratorPattern;

public class Musroom extends ToppingDecorator{
    BasePizza basePizza;

    Musroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost()+15;
    }
}
