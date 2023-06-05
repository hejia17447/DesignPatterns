package org.example.observer_pattern;

public class Task2 implements Observer {
    @Override
    public void update(Object object) {
        System.out.println("Task2 received:" + object);
    }
}
