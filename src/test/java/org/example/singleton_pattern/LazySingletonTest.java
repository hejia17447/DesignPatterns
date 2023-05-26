package org.example.singleton_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/5/26 15:35
 * @description
 */
class LazySingletonTest {

    /**
     * 单线程
     */
    @Test
    void getInstance() throws InterruptedException {
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println(instance == instance1);
    }

    /**
     * 多线程
     */
    @Test
    void multiThreadGetInstance() throws InterruptedException {
        new Thread(() -> {
            try {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        Thread.sleep(500);
    }
}