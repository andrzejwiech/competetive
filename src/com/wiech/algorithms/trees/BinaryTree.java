package com.wiech.algorithms.trees;

import static java.lang.Math.max;

class BinaryTree {

    Node root;

    void reverse() {
        reverse(root);
    }

    boolean isSymmetric() {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    private Node reverse(Node node) {
        if (node == null)
            return null;

        Node tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        node.right = reverse(node.right);
        node.left = reverse(node.left);

        return node;
    }

    boolean isTheSame(Node node) {

        return isTheSame(root, node);
    }

    int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return 0;
        int heightLeft = height(root.left) + 1;
        int heightRight = height(root.right) + 1;

        return max(heightLeft, heightRight);
    }

    private boolean isTheSame(Node one, Node two) {

        if (one == null && two == null)
            return true;
        else if (one == null || two == null)
            return false;
        else if (one.value != two.value)
            return false;
        return isTheSame(one.left, two.left) && isTheSame(one.right, two.right);
    }

}