package org.example.singleton_pattern;

/**
 * 枚举单例模式
 */
public enum EnumSingleton {

    INSTANCE;

    public void print() {
        System.out.println(this.hashCode());
    }

}
