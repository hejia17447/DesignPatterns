package org.example.singleton_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/5/26 16:04
 * @description
 */
class HungrySingletonTest {

    @Test
    void getInstance() {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance1 = HungrySingleton.getInstance();
        System.out.println(instance == instance1);
    }
}