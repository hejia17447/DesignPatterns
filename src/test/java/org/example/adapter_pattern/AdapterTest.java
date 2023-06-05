package org.example.adapter_pattern;

import org.example.adapter_pattern.object_adapter.Adaptee;
import org.example.adapter_pattern.object_adapter.ObjectAdapter;
import org.junit.jupiter.api.Test;

class AdapterTest {

    @Test
    void output5v() {

        Adaptee adaptee = new Adaptee();
        ObjectAdapter adapter = new ObjectAdapter(adaptee);
        int i = adapter.output5v();
        System.out.println("最终电压：" + i);
    }
}