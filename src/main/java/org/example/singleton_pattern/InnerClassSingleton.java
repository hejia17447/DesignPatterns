package org.example.singleton_pattern;

/**
 * 静态内部类单例模式
 */
public class InnerClassSingleton {
    private static class InnerClassHolder {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
        if (InnerClassHolder.instance != null) {
            throw  new RuntimeException("单例不允许多个实例");
        }
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }

}
