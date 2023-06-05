package org.example.adapter_pattern.object_adapter;

import org.example.adapter_pattern.Adaptee;
import org.example.adapter_pattern.Target;

/**
 * 对象适配器模式，通过输入的对象进行适配
 */
public class ObjectAdapter implements Target {

    private final Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int output5v() {

        int i = adaptee.output220V();
        // ....
        System.out.printf("原始电压： %d v -> 输出电压： %d v%n", i, 5);
        return 5;
    }
}
