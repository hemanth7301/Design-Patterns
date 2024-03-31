package MediatorPattern;

public class Main {
    public static void main(String args[]){
        User hemanth = new User("Hemanth");
        User veer = new User("Veer");
    
        hemanth.sendMessage("Hi Veer");
        veer.sendMessage("Hi Hemanth");
    }
}
