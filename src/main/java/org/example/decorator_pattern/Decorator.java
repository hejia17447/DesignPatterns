package org.example.decorator_pattern;

public abstract class Decorator implements Component{

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }


}
