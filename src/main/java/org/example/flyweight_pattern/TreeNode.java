package org.example.flyweight_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TreeNode {

    private int x;

    private int y;

    private Tree tree;

}
