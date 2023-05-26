package org.example.factory_pattern;

/**
 * 编写习惯类似于工厂模式
 */
public class Application {

    private Product createProductA(String type) {
        // .... init
        // ...
        return SimpleFactory.createProduct(type);
    }

    Product getObject(String type) {
        // ...
        return createProductA(type);

    }
}
