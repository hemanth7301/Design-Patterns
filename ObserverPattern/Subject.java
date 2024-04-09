package ObserverPattern;

import java.util.ArrayList;
import java.util.*;

public class Subject {
    List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        NotifyAllObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void NotifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
