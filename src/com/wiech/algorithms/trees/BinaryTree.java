package com.wiech.algorithms.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static java.lang.Math.max;

class BinaryTree {

    Node root;

    void reverse() {
        reverse(root);
    }

    private Node reverse(Node node) {
        if (node == null) {
            return null;
        }
        Node tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        node.right = reverse(node.right);
        node.left = reverse(node.left);

        return node;
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

    boolean isTheSame(Node node) {

        return isTheSame(root, node);
    }

    private boolean isTheSame(Node one, Node two) {
        if (one == null && two == null) {
            return true;
        } else if (one == null || two == null) {
            return false;
        } else if (one.value != two.value) {
            return false;
        }
        return isTheSame(one.left, two.left) && isTheSame(one.right, two.right);
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

    void breadthFirstTraversal() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.value);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    void breadthFirstTraversalReversed() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            stack.push(current);
            if (current.right != null) {
                queue.add(current.right);
            }
            if (current.left != null) {
                queue.add(current.left);
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().value);
        }
    }

    void specificOrder() {
        specificOrder(root);
    }

    private void specificOrder(Node node) {

        System.out.println(node.value);

        Queue<Node> queue1 = new LinkedList<>();
        Queue<Node> queue2 = new LinkedList<>();

        queue1.add(node.left);
        queue2.add(node.right);

        while (!queue1.isEmpty()) {

            Node node1 = queue1.poll();
            System.out.println(node1.value);
            if (node1.left != null) {
                queue1.add(node1.left);
            }
            if (node1.right != null) {
                queue1.add(node1.right);
            }

            Node node2 = queue2.poll();
            System.out.println(node2.value);
            if (node2.left != null) {
                queue2.add(node2.right);
            }
            if (node2.right != null) {
                queue2.add(node2.left);
            }


        }


    }
}