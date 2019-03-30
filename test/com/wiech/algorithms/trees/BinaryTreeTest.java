/*
 * @author Andrzej Wiech
 */

package com.wiech.algorithms.trees;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

    @Test
    void flip() {

        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.right = new Node(3);
        bt.root.left = new Node(2);

        bt.root.left.right = new Node(5);
        bt.root.left.left = new Node(4);
        bt.root.right.right = new Node(7);
        bt.root.right.left = new Node(6);
        //bt.reverse();

        System.out.println(bt);
        System.out.println(bt.isSymmetric());
        System.out.println(bt.isTheSame(bt.root));
        System.out.println(bt.height());
        System.out.println();
        bt.breadthFirstTraversal();
        System.out.println();
        bt.breadthFirstTraversalReversed();

    }
}