package org.example.singleton_pattern;

/**
 * @author HJ
 * @date 2023/5/23 20:16
 * @description 线程不安全的单例模式
 */
public class Singleton2 {

    private static Singleton2 SINGLETON = null;

    /**
     * 限制产生多个对象
     */
    private Singleton2() {}

    /**
     * 获取实例对象
     */
    public static Singleton2 getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Singleton2();
        }
        return SINGLETON;
    }

}
