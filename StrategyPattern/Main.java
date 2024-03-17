package StrategyPattern;

public class Main {
    public static void main(String Args[]) {
        Context contexOne = new Context(new Addition());
        System.out.println(contexOne.executeStrategy(2, 4));

        Context contextTwo = new Context(new Subtraction());
        System.out.println(contextTwo.executeStrategy(2, 4));

        Context contextThree = new Context(new Multiplication());
        System.out.println(contextThree.executeStrategy(2, 4));
    }
}
