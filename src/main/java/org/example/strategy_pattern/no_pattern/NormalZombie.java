package org.example.strategy_pattern.no_pattern;

public class NormalZombie extends AbstractZombie {
    @Override
    public void display() {
        System.out.println("我是普通僵尸！！！");
    }
}
