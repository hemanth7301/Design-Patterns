package Singleton.DoubleLocking;

public class Main {
    public static void main(String Args[]) {
        Singleton obj = Singleton.getInstance();
        obj.sayHello();
    }
}
