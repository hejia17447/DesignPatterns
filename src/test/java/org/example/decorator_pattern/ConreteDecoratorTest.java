package org.example.decorator_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConreteDecoratorTest {

    @Test
    void test() {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConreteDecorator conreteDecorator = new ConreteDecorator(concreteComponent);
        new ConreteDecorator2(conreteDecorator).operation();
    }


}