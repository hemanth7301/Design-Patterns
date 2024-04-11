package MementoPattern;

public class Originator {
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStatetoMemento() {
        return new Memento(state);
    }

    public void getStatefromMemento(Memento memento) {
        state = memento.getState();
    }
}
