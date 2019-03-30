/*
 * @author Andrzej Wiech
 */

package com.wiech.algorithms.general.easy;

public class TreeSerializer {
    public static void treeTraversalInOrder(Node<Integer> node) {

        if (node == null) {
            return;
        }
        if (node.left != null) {
            treeTraversalInOrder(node.left);
        }
        if (node.right != null) {
            treeTraversalInOrder(node.right);
        }

    }
}

class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;
}
