package org.example.decorator_pattern;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("拍照。");
    }
}
