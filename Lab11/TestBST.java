package bst;

import java.util.ArrayList;

/* @author Amaan Geelani Syed S2191704 */

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        // Insert elements
        bst.insert(45);
        bst.insert(88);
        bst.insert(54);
        bst.insert(76);
        bst.insert(98);
        bst.insert(1);
        bst.insert(2);
        bst.insert(20);
        bst.insert(6);
        bst.insert(53);
        bst.insert(42);
        bst.insert(100);
        bst.insert(86);
        bst.insert(32);
        bst.insert(28);
        bst.insert(65);
        bst.insert(14);

        // Inorder traversal (sorted)
        System.out.print("Inorder (sorted): ");
        bst.inorder();
        System.out.println();

        // Postorder traversal
        System.out.print("Postorder: ");
        bst.postorder();
        System.out.println();

        // Preorder traversal
        System.out.print("Preorder: ");
        bst.preorder();
        System.out.println();

        // Height of the BST
        System.out.println("Height of BST: " + bst.height());

        // Get the root value
        System.out.println("Root for BST is: " + bst.getRoot());

        // Search for an element
        System.out.println("Check whether 10 is in the tree? " + bst.search(10));

        // Delete an element
        bst.delete(53);
        System.out.print("Updated Inorder data (sorted): ");
        bst.inorder();
        System.out.println();

        // Get minimum and maximum values
        System.out.println("Min Value :" + bst.minValue());
        System.out.println("Max Value :" + bst.maxValue());

        // Get the path from root to a node
        ArrayList<TreeNode<Integer>> path = bst.path(6);
        System.out.print("A path from the root to 6 is: ");
        for (TreeNode<Integer> node : path) {
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
}
