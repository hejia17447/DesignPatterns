package org.example.decorator_pattern;

public class ConreteDecorator extends Decorator{


    public ConreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("添加美颜。");
        component.operation();
    }
}
