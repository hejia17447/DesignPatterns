package org.example.factory_pattern.factory_pattern;

public class ConcreteProductB extends Application{
    @Override
    Product createProduct() {
        // ....
        return new ProductB();
    }
}
