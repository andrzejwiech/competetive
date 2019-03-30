/*
 * @author Andrzej Wiech
 */

package com.wiech.algorithms.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void insert() {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        tree.print();
    }
}