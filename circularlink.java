// import java.util.*;

// class CircularLink{
//     int data;
//     CircularLink next;

//     CircularLink(int data,CircularLink next){
//         this.data=data;
//         this.next=next;
//     }
// }

// public class circularlink {

// static CircularLink createCircular_link(int[] input){
//     if (input.length == 0) {
//         return null; 
//     }
//     CircularLink head =new CircularLink(input[0], null);
//     CircularLink tail = null;

//         for(int i=1;i<input.length;i++){
//             CircularLink cir = new CircularLink(input[i],null);
//             tail.next = cir;
//             tail = cir;
//         }
//         tail.next = head;
//         return head;
//     }
//     public static void main(String[] args) {
//         int[] x ={1,2,3,4,5};
//         System.out.println(Arrays.toString(x));

//         CircularLink head = createCircular_link(x);
//         if (head != null) {
//             CircularLink temp = head;
//             do {
//                 System.out.println(temp.data);
//                 temp = temp.next;
//             } while (temp != head);
//         }
//        }
//     }
    

import java.util.*;

class CircularLink {
    int data;
    CircularLink next;

    CircularLink(int data, CircularLink next) {
        this.data = data;
        this.next = next;
    }
}

public class circularlink {

    static CircularLink createCircularLink(int[] input) {
        if (input.length == 0) {
            return null; 
        }

        CircularLink head = new CircularLink(input[0], null);
        CircularLink tail = head;

        for (int i = 1; i < input.length; i++) {
            CircularLink newNode = new CircularLink(input[i], null);
            tail.next = newNode;
            tail = newNode;
        }
        tail.next = head; 
        return head;
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(x));

        CircularLink head = createCircularLink(x);

        if (head != null) {
            CircularLink temp = head;
            do {
                System.out.println(temp.data);
                temp = temp.next;
            } while (temp != head);
        }
    }
}
