package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new BlackOlive(new Mushroom(new Jalapeno(new FarmHouse())));
        System.out.println("Pizza Cost "+basePizza.cost());
    }
}
