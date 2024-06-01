package bst;

/* @author Amaan Geelani Syed S2191704 */

public class TreeNode<E extends Comparable<E>> implements Comparable<TreeNode>{
    E data;
    TreeNode left;
    TreeNode right;
    
    TreeNode(E data){
        this.data = data;
    }

    @Override
    public int compareTo(TreeNode o) {
        return data.compareTo((E)o.data);
    }
}
