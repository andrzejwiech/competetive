package com.wiech.algorithms.trees;

class BinarySearchTree {

    private Node root;

    void insert(int value) {
        root = insert(root, value);
    }
    void print() {
        print(root);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (node.value > 0) {
            node.left = insert(node.left, value);
        } else if (node.value < 0){
            node.right = insert(node.right, value);
        }
        return node;
    }

    private void print(Node node) {
        if (node == null) {
            return;
        }
        print(node.left);
        System.out.println(node.value);
        print(node.right);
    }
}
