package org.example.singleton_pattern;

/**
 * @author HJ
 * @date 2023/5/23 19:57
 * @description 线程安全的单例模式
 */
public class Singleton1 {
    private static final Singleton1 SINGLETON = new Singleton1();

    /**
     * 限制产生多个对象
     */
    private Singleton1() {}

    /**
     * 获取实例对象
     */
    public static Singleton1 getInstance() {
        return SINGLETON;
    }

}
