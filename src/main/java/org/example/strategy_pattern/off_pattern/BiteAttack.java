package org.example.strategy_pattern.off_pattern;

public class BiteAttack implements AttackAble {
    @Override
    public void attack() {
        System.out.println("咬！！！");
    }
}
