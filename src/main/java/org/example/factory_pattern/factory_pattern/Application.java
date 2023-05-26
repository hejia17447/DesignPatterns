package org.example.factory_pattern.factory_pattern;

/**
 * 工厂方法模式（工厂模式）
 */
public abstract class Application {

    abstract Product createProduct();

    public Product getObject() {
        // ...
        return createProduct();

    }
}
