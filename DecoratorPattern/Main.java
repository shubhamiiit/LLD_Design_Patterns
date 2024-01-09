package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Musroom(new ExtraCheese(new Margherita()));
        System.out.println(basePizza.cost());
    }
}
