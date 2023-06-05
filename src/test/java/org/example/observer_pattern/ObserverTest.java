package org.example.observer_pattern;

import org.junit.jupiter.api.Test;


class ObserverTest {

    @Test
    void test() {
        Suject suject = new Suject();
        suject.addObserver(new Task1());
        suject.addObserver(new Task2());
        suject.notifyObserver("测试！！！");
    }

}