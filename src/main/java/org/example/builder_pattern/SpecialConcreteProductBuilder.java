package org.example.builder_pattern;

public class SpecialConcreteProductBuilder implements ProductBuilder{
    private String productName;

    private String companyName;

    private String part1;

    private String part2;

    private String part3;

    private String part4;

    @Override
    public void builderProductName(String productName) {
        this.productName = productName + "Special";
    }

    @Override
    public void builderCompanyName(String companyName) {
        this.companyName = companyName + "Special";
    }

    @Override
    public void builderPart1(String part1) {
        this.part1 = part1 + "Special";
    }

    @Override
    public void builderPart2(String part2) {
        this.part2 = part2 + "Special";
    }

    @Override
    public void builderPart3(String part3) {
        this.part3 = part3 + "Special";
    }

    @Override
    public void builderPart4(String part4) {
        this.part4 = part4 + "Special";
    }

    @Override
    public Product build() {
        return new Product(productName, companyName, part1, part2, part3, part4);
    }
}
