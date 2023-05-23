package org.example.singleton_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/5/23 20:19
 * @description
 */
class Singleton2Test {

    @Test
    void getInstance() {
        for (int i = 0; i < 200; i++) {
            int finalI = i;
            Runnable runnable = () -> {
                Singleton2 instance = Singleton2.getInstance();
                System.out.println("test" + finalI + ":" + instance.toString());
            };
            runnable.run();
        }
    }
}