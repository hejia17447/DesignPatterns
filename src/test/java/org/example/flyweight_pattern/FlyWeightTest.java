package org.example.flyweight_pattern;

import org.junit.jupiter.api.Test;

class FlyWeightTest {

    @Test
    void test() {
        TreeNode treeNode1 = new TreeNode(3, 4, TreeFactory.getTree("xxx", "xxxxxxx"));
        TreeNode treeNode2 = new TreeNode(5, 4, TreeFactory.getTree("xxx", "xxxxxxx"));
    }

}