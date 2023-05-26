package org.example.singleton_pattern;

/**
 * @author HJ
 * @date 2023/5/26 15:30
 * @description 懒汉模式
 */
public class LazySingleton {
    private static volatile LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() throws InterruptedException {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
