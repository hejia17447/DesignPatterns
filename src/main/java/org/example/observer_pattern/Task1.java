package org.example.observer_pattern;

public class Task1 implements Observer {
    @Override
    public void update(Object object) {
        System.out.println("Task1 received:" + object);
    }
}
