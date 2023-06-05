package org.example.strategy_pattern.off_pattern;

public class HiteAttack implements AttackAble {
    @Override
    public void attack() {
        System.out.println("打！！！");
    }
}
