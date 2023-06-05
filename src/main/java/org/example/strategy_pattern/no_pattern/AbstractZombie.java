package org.example.strategy_pattern.no_pattern;

public abstract class AbstractZombie {

    public abstract void display();

    public void attack() {
        System.out.println("咬！！！");
    }

    public void move() {
        System.out.println("一步步移动！！！");
    }

}
