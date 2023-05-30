package org.example.builder_pattern.v2;

import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void test() {
        Product product = new Product.Builder().productName("xxx").companyName("xxx").part1("xxx").build();
        System.out.println(product.toString());
    }

}