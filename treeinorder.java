import java.util.*;
class treenode{
    int data;
    treenode left;
    treenode right;

    treenode(int data,treenode left,treenode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}



public class treeinorder {
-
    static void printOneTreeNode(TreeNode temp){
        String leftValue = temp.left==null?"null": String.valueOf(temp.left.hashCode());
        
        String rightValue = temp.right==null?"null": String.valueOf(temp.right.hashCode());

        System.out.println("LinkedListNode{ data=" + temp.data +", left=" + leftValue +", right=" + rightValue +'}');
    }


    static treenode create(int i){
        if (i>=arr.length){
            return null;
        }
        treenode left = create(2*i+1);
        treenode right = create(2*i+2);

        treenode res = new treenode(i, left, right);  
        // printOneTreeNode();
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
    
    }
    
}
