package bst;

import java.util.ArrayList;

public class BST<E extends Comparable<E>>{
    private TreeNode<E> root;
    private int size = 0;

    /**
     * Create a default binary tree
     */
    public BST() {
    }

    /** Returns true if the data is in the tree
     * @param e
     * @return  */
    public boolean search(E e) {
        TreeNode<E> current = root; // Start from the root

        while (current != null) {
            if (e.compareTo(current.data) < 0) {
                current = current.left;
            } else if (e.compareTo(current.data) > 0) {
                current = current.right;
            } else {// data matches current.data
                return true; // data is found
            }
        }
        return false;
    }

    /** Insert data o into the binary tree
    * Return true if the data is inserted successfully
     * @param e
     * @return Boolean true if inserted */
    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode(e); // Create a new root
        } else {
            // Locate the parent node
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.data) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.data) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false; // Duplicate node not inserted
                }
            }
            // Create the new node and attach it to the parent node
            if (e.compareTo(parent.data) < 0) {
                parent.left = new TreeNode(e);
            } else {
                parent.right = new TreeNode(e);
            }
        }
        size++;
        return true; // data inserted
    }
    
    
    /** Get the number of nodes in the tree
     * @return  size of the tree*/
    public int getSize() {
        return size;
    }

    //Returns the height of the BST
    public int height() {
        return height(root);
    }

    private int height(TreeNode<E> node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    //End Returns the height of the BST
    /**
     * @return root of the tree
     */
    public E getRoot() {
        return root.data;
    }

    public E minValue() {
        return minValue(root);
    }

    /* Function to return least value recursively */
    private E minValue(TreeNode<E> node) {
        if (node.left == null) {
            return node.data;
        }
        return (E) minValue(node.left);
    }

    public E maxValue() {
        return maxValue(root);
    }

    /* Function to return least value recursively */
    private E maxValue(TreeNode<E> node) {
        if (node.right == null) {
            return node.data;
        }
        return (E) maxValue(node.right);
    }

    /**
     * Returns a path from the root leading to the specified data
     *
     * @param e
     * @return
     */
    public ArrayList<TreeNode<E>> path(E e) {
        ArrayList<TreeNode<E>> list = new ArrayList<>();
        TreeNode<E> current = root; // Start from the root
        while (current != null) {
            list.add(current); // Add the node to the list
            if (e.compareTo(current.data) < 0) {
                current = current.left;
            } else if (e.compareTo(current.data) > 0) {
                current = current.right;
            } else {
                break;
            }
        }
        return list; // Return an array of nodes
    }

    /** *  Delete an data from the binary tree.
     * Return true if the data is deleted successfully
     * Return false if the data is not in the tree
     * @param e
     * @return Boolean 
    */
    public boolean delete(E e) {
        // Locate the node to be deleted and also locate its parent node
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.data) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.data) > 0) {
                parent = current;
                current = current.right;
            } else {
                break; // data is in the tree pointed at by current
            }
        }

        if (current == null) {
            return false; // data is not in the tree
        }
        // Case 1: current has no left children
        if (current.left == null) {
            // Connect the parent with the right child of the current node
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.data) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else {
            // Case 2: The current node has a left child
            // Locate the rightmost node in the left subtree of
            // the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right; // Keep going to the right
            }

            // Replace the data in current by the data in rightMost
            current.data = rightMost.data;

            // Eliminate rightmost node
            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else // Special case: parentOfRightMost == current
            {
                parentOfRightMost.left = rightMost.left;
            }
        }

        size--;
        return true; // data inserted
    }

    /**
     * Remove all data from the tree
     */
    public void clear() {
        root = null;
        size = 0;
    }


    /** Inorder traversal from the root*/
    public void inorder() {
        inorder(root);
    }

    /**
     * Inorder traversal from a sub tree
     */
    private void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    /** Postorder traversal from the root */
    public void postorder() {
        postorder(root);
    }

    /**
     * Postorder traversal from a sub tree
     * @param root
     */
    private void postorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    /** Preorder traversal from the root */
    public void preorder() {
        preorder(root);
    }

    /**
     * Preorder traversal from a sub tree
     */
    private void preorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

}
