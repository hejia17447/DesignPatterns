package org.example.strategy_pattern.no_pattern;

public class BigHeadZombie extends AbstractZombie {
    @Override
    public void display() {
        System.out.println("我是大头僵尸！！！");
    }

    @Override
    public void attack() {
        System.out.println("头撞！！！");
    }
}
