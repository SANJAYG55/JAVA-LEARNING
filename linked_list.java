//singly linked list
import java.util.Arrays;

class LinkedListNode{

    int data;

    LinkedListNode next;

    public LinkedListNode(int data, LinkedListNode next) { 
        this.data = data;
        this.next = next;
    }

}
public class linked_list {
   static LinkedListNode createSinglyLinkedList(int[] input){
        
         LinkedListNode head = null;
        LinkedListNode tail  = null;
        for(int i=0;i<input.length;i++){

         LinkedListNode nod = new LinkedListNode(input[i], null);
                 if(head == null){
                    head = nod;
                    tail = nod;
                 }
                 else{
                    tail.next = nod;
                    tail = nod; 
                 }
        }
        return head;
    }

    public static void main(String[] args){
        int[] x = {1,5,7,9};
        System.out.println(Arrays.toString(x));



        // LinkedListNode node4 = new LinkedListNode(9, null);
        // LinkedListNode node3 = new LinkedListNode(7, node4);
        // LinkedListNode node2 = new LinkedListNode(5, node3);
        // LinkedListNode node1 = new LinkedListNode(1, node2);

        
          
        LinkedListNode head = createSinglyLinkedList(x);
        for(LinkedListNode temp = head;temp!=null;temp = temp.next){
            System.out.println(temp.data);
        }
    }
}
