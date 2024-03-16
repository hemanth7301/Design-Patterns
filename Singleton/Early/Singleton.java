package Singleton.Early;

public class Singleton{

    public static Singleton singletonObject = new Singleton();

    private Singleton() {
        
    }
    public static Singleton getInstance(){
        return singletonObject;
    }

    public void sayHello(){
        System.out.println("Hi!! This is from Early Loading");
    }
}