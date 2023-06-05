package org.example.adapter_pattern.class_adapter;

import org.example.adapter_pattern.Adaptee;
import org.example.adapter_pattern.Target;

/**
 * 类的适配器模式
 */
public class ClassAdapter extends Adaptee implements Target {


    @Override
    public int output5v() {
        int i = output220V();
        // ....
        System.out.printf("原始电压： %d v -> 输出电压： %d v%n", i, 5);
        return 5;
    }
}
