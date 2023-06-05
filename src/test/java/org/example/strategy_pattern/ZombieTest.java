package org.example.strategy_pattern;

import org.example.strategy_pattern.no_pattern.AbstractZombie;
import org.example.strategy_pattern.no_pattern.FlagZombie;
import org.example.strategy_pattern.no_pattern.NormalZombie;
import org.junit.jupiter.api.Test;

class ZombieTest {

    @Test
    void test() {
        AbstractZombie normalZombie = new NormalZombie();
        AbstractZombie flagZombie = new FlagZombie();
        normalZombie.display();
        normalZombie.move();
        normalZombie.attack();

        flagZombie.display();
        flagZombie.move();
        flagZombie.attack();
    }

}