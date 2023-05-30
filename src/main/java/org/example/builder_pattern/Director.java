package org.example.builder_pattern;

public class Director {

    public Director(ProductBuilder builder) {
        this.builder = builder;
    }

    private ProductBuilder builder;

    public Product makeProduct(String productName, String companyName, String part1, String part2, String part3, String part4) {
        builder.builderProductName(productName);
        builder.builderCompanyName(companyName);
        builder.builderPart1(part1);
        builder.builderPart2(part2);
        builder.builderPart3(part3);
        builder.builderPart4(part4);
        return builder.build();
    }

}
