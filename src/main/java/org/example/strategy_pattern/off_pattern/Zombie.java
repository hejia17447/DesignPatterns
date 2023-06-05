package org.example.strategy_pattern.off_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Zombie {

    abstract public void display();

    MoveAble moveAble;

    AttackAble attackAble;

    abstract void move();

    abstract void attack();


}
