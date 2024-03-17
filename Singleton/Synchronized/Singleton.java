package Singleton.Synchronized;

public class Singleton{

    public static Singleton singletonObject;

    private Singleton() {
        
    }
    synchronized public static Singleton getInstance(){
        if(singletonObject==null){
            singletonObject=new Singleton();
        }
        return singletonObject;
    }

    public void sayHello(){
        System.out.println("Hi!! This is from Synchronized Singleton");
    }
}
