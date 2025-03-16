// Java program to find the size
// of a binary tree.
import java.util.*;

class GfG {
   static class Node {
        int data;
        Node left, right;
    
        Node(int x) {
            data = x;
            left = null;
            right = null;
        }
    }

    // Recursive function to find the 
    // size of binary tree.
    static int getSize(Node root) {
        if (root == null)
            return 0;

        // Find the size of left and right 
        // subtree.
        int left = getSize(root.left);
        int right = getSize(root.right);

        // return the size of curr subtree.
        return left + right + 1;
    }

    public static void main(String[] args) {

        // Constructed binary tree is
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(getSize(root));
    }
}