import java.math.*;
import java.util.*;

class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;


    TreeNode(int data, TreeNode left, TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class tree {

    public static void trav(TreeNode node){
       if(node!=null){
        trav(node.left);
        System.out.println(node.data);
        trav(node.right);

       }
    }
    public static void main(String[] args) {
        TreeNode tn7 = new TreeNode(7, null, null);
        TreeNode tn6 = new TreeNode(6, null, null);
        TreeNode tn3 = new TreeNode(3, tn6, tn7);
        TreeNode tn4= new TreeNode(4, null, null);
        TreeNode tn5 = new TreeNode(5, null, null);
        TreeNode tn2 = new TreeNode(2, tn4, tn5);
        TreeNode tn1 = new TreeNode(1, tn2, tn3);

        System.out.println("treee travasal:");
        trav(tn1);
    }
    
}
