package MementoPattern;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("First Version");

        originator.setState("Second Version");
        careTaker.addMemento(originator.saveStatetoMemento());

        originator.setState("Third Version");
        careTaker.addMemento(originator.saveStatetoMemento());

        originator.setState("Fourth Version");
        System.out.println("Currently :" + originator.getState());

        originator.getStatefromMemento(careTaker.getMementobyIndex(0));
        System.out.println("Currently :" + originator.getState());

        originator.getStatefromMemento(careTaker.getMementobyIndex(1));
        System.out.println("Currently :" + originator.getState());
    }
}
