package org.example.strategy_pattern.off_pattern;

public class StepByStepMove implements MoveAble{
    @Override
    public void move() {
        System.out.println("一步步移动！！！");
    }
}
