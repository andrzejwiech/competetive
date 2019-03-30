/*
 * @author Andrzej Wiech
 */

package com.wiech.algorithms.recursion.easy;

import com.wiech.algorithms.trees.Node;

public class Reverse {

    public static void main(String[] args) {
        Node node = new Node(1);
        Node nodeNext = new Node(2);
        Node nodeNextNext = new Node(3);
        Node nodeNextNextNext = new Node(4);
        Node nodeNextNextNextNext = new Node(5);
        node.right = nodeNext;
        nodeNext.right = nodeNextNext;
        nodeNextNext.right = nodeNextNextNext;
        nodeNextNextNext.right = nodeNextNextNextNext;
        Node reversed = reverse(node);
        System.out.println(reversed);
    }

    private static Node reverse(Node node) {
        if (node == null || node.right == null) {
            return node;
        }

        Node current = reverse(node.right);
        node.right.right = node;
        node.right = null;
        return current;

    }
}
