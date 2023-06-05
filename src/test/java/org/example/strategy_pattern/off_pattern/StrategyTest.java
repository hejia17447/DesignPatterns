package org.example.strategy_pattern.off_pattern;

import org.junit.jupiter.api.Test;

class StrategyTest {

    @Test
    void test() {
        Zombie normalZombie = new NormalZombie();
        Zombie flagZombie = new FlagZombie(new StepByStepMove(), new HiteAttack());
        normalZombie.display();
        normalZombie.move();
        normalZombie.attack();

        flagZombie.display();
        flagZombie.move();
        flagZombie.attack();
    }

}