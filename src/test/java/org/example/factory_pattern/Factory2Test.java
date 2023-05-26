package org.example.factory_pattern;

import org.example.factory_pattern.factory_pattern.Application;
import org.example.factory_pattern.factory_pattern.ConcreteProductB;
import org.example.factory_pattern.factory_pattern.Product;
import org.junit.jupiter.api.Test;

public class Factory2Test {

    @Test
    void test() {
        Application application = new ConcreteProductB();
        Product product = application.getObject();
        product.method1();
    }

}
