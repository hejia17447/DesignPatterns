package org.example.singleton_pattern;

import org.junit.jupiter.api.Test;

class EnumSingletonTest {

    @Test
    void values() {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        System.out.println(instance == instance1);
    }
}