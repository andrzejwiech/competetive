package com.wiech.algorithms.trees;

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
}