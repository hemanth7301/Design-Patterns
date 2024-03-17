package Singleton.DoubleLocking;

public class Singleton{

    public static Singleton singletonObject;

    private Singleton() {
        
    }
    public static Singleton getInstance(){
        if(singletonObject==null){
            synchronized(Singleton.class){
                if(singletonObject==null){
                    return new Singleton();
                }
            }
        }
        return singletonObject;
    }

    public void sayHello(){
        System.out.println("Hi!! This is from Double Locking");
    }
}
