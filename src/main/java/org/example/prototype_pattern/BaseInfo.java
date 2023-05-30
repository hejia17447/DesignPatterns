package org.example.prototype_pattern;

import lombok.AllArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
public class BaseInfo implements Cloneable, Serializable {

    @Serial
    private static final long serialVersionUID = 42L;


    private String name;

    @Override
    public String toString() {
        return super.hashCode() + "BaseInfo{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public BaseInfo clone() {
        try {
            BaseInfo clone = (BaseInfo) super.clone();
            // TODO: 复制此处的可变状态，这样此克隆就不能更改初始克隆的内部项
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
