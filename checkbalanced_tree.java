import java.util.*;

class node{
    int data;
    node left;
    node right;

    node(int data){
        this.data=data;
        left = right =null;
    }
}

class binaryTree{
    node root;
    int height(node root){
        if(root==null){
            return 0;
        }
         return 1+Math.max(height(root.left),height(root.right));
    }


    public boolean isbalanced(node root){
        if(root==null)
        return true;
        int l,r;
        l=height(root.left);
        r=height(root.right);

        return Math.abs(l-r)<=1&&isbalanced(root.left)&&isbalanced(root.right);

    }
}

public class checkbalanced_tree {
    public static void main(String[] args) {
        
    
    binaryTree tree = new  binaryTree();
      tree.root = new node(1);
      tree.root.left = new node(2);
      tree.root.right = new node(3);
      tree.root.left.left = new node(4);
      tree.root.left.right = new node(5);
    //    tree.isbalanced(tree.root);
    boolean isBalanced = tree.isbalanced(tree.root);
    System.out.println(isBalanced);

    }
}
