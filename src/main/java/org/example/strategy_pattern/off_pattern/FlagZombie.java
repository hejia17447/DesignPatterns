package org.example.strategy_pattern.off_pattern;

public class FlagZombie extends Zombie {

    public FlagZombie() {
        super(new StepByStepMove(), new BiteAttack());
    }

    public FlagZombie(MoveAble moveAble, AttackAble attackAble) {
        super(moveAble, attackAble);
    }

    @Override
    public void display() {
        System.out.println("我是棋手僵尸！！！");
    }

    @Override
    void move() {
        moveAble.move();
    }

    @Override
    void attack() {
        attackAble.attack();
    }
}
