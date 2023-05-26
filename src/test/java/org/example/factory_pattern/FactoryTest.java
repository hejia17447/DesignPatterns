package org.example.factory_pattern;

import org.junit.jupiter.api.Test;

class FactoryTest {

    @Test
    void test() {
        Application application = new Application();
        Product product = application.getObject("0");
        product.method1();
        product = application.getObject("1");
        product.method1();
    }

}