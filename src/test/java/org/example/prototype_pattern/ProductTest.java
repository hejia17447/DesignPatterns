package org.example.prototype_pattern;

import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void test() {
        BaseInfo baseInfo = new BaseInfo("xxx");
        Product product = new Product("part1", "part2", 3, baseInfo);
        Product product1 = product.clone();
        product.setBaseInfo(new BaseInfo("yyy"));
        System.out.println("原始：" + product);
        System.out.println("复制：" + product1);
    }



}