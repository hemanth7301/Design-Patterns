package MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMementobyIndex(int index) {
        return mementos.get(index);
    }
}
