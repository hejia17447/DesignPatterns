package org.example.singleton_pattern;

import org.junit.jupiter.api.Test;

/**
 * @author HJ
 * @date 2023/5/23 20:01
 * @description
 */
class Singleton1Test {



    @Test
    public void test() {
        for (int i = 0; i < 5; i++) {
            Runnable runnable = () -> {
                Singleton1 instance = Singleton1.getInstance();
                System.out.println(instance.toString());
            };
            runnable.run();
        }
    }

}