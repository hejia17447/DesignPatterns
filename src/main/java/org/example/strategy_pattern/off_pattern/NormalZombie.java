package org.example.strategy_pattern.off_pattern;

public class NormalZombie extends Zombie {

    public NormalZombie() {
        super(new StepByStepMove(), new BiteAttack());
    }

    public NormalZombie(MoveAble moveAble, AttackAble attackAble) {
        super(moveAble, attackAble);
    }

    @Override
    public void display() {

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
