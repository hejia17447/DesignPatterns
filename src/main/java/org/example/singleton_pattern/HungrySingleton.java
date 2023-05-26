package org.example.singleton_pattern;

/**
 * @author HJ
 * @date 2023/5/26 16:03
 * @description 饿汉模式
 */
public class HungrySingleton {
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
