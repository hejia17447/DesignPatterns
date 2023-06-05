package org.example.template_method_pattern;

public class SubClass extends AbstractClass {
    @Override
    protected void templateMethod() {
        System.out.println("SubClass executed ...");
    }
}
