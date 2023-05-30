package org.example.builder_pattern;

import org.junit.jupiter.api.Test;

class DirectorTest {

    @Test
    void test() {
        ProductBuilder builder = new DefaultConcreteProductBuilder();
        Director director = new Director(builder);
        Product product = director.makeProduct("productNameXXX", "companyNameXXX", "part1", "part2", "part3", "part4");
        System.out.println(product.toString());

        ProductBuilder builder1 = new SpecialConcreteProductBuilder();
        director = new Director(builder1);
        product = director.makeProduct("productNameXXX", "companyNameXXX", "part1", "part2", "part3", "part4");
        System.out.println(product.toString());

    }

}