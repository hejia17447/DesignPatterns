package org.example.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Suject {
    // 容器
    private List<Observer> c = new ArrayList<>();
    // add
    public void addObserver(Observer observer) {
        c.add(observer);
    }
    // remove
    public void removeObserver(Observer observer) {
        c.remove(observer);
    }

    public void notifyObserver(Object object) {
        c.forEach(item -> item.update(object));
    }
}
