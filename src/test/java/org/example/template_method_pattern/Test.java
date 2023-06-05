package org.example.template_method_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1 {

    @Test
    void test() {
        AbstractClass abstractClass = new SubClass();
        abstractClass.operation();
    }

}