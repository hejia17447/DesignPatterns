package org.example.decorator_pattern;

public class ConreteDecorator2 extends Decorator{

    public ConreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("添加美颜。");
        component.operation();
    }

}
