//doublylinked list.

import java.util.*;

class Doublelistnode{
     int data;
     Doublelistnode next;
     Doublelistnode prev;

     Doublelistnode(int data,Doublelistnode next,Doublelistnode prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
     }
}
public class doubly_list{

       static Doublelistnode createdl(int[] a){
        Doublelistnode head = null;
        Doublelistnode tail =  null;

        for(int i=0;i<a.length;i++){
            Doublelistnode node = new Doublelistnode(a[i], null, null);
            if(head == null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }
        return head;
       }

       public static void main(String[] args) {
        int[] x = {9,8,7,6};
        System.out.println(Arrays.toString(x));

        Doublelistnode head = createdl(x);
        for(Doublelistnode temp = head ; head!=null ; temp=temp.next){
            System.out.println(temp.data);
          }
       }
}
