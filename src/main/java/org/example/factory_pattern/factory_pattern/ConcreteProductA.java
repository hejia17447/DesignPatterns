package org.example.factory_pattern.factory_pattern;

public class ConcreteProductA extends Application{
    @Override
    Product createProduct() {
        // ....
        return new ProductA();
    }
}
