package org.example.prototype_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Cloneable, Serializable {

    @Serial
    private static final long serialVersionUID = 42L;

    private String part1;

    private String part2;

    private Integer part3;

    private BaseInfo baseInfo;


    @Override
    public String toString() {
        return super.hashCode() + "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3=" + part3 +
                ", baseInfo=" + baseInfo +
                '}';
    }

    @Override
    public Product clone() {
        // v1
        Product clone;
//        try {
//            clone = (Product) super.clone();
//            // TODO: 复制此处的可变状态，这样此克隆就不能更改初始克隆的内部项
//            BaseInfo clone1 = this.baseInfo.clone();
//            clone.setBaseInfo(clone1);
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }

        // v2
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
            oos.writeObject(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        try (ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {
             clone = (Product) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return clone;
    }
}
