package org.example.factory_pattern.factory_pattern;

public class SimpleFactory {

    public static Product createProduct(String type) {
        switch (type) {
            case "0" -> {
                return new ProductA();
            }
            case "1" -> {
                return new ProductB();
            }
            default -> {
                return null;
            }
        }
    }

}
