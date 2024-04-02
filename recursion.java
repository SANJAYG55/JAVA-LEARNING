// RECURSION:
// 1) print n "open" and n "closed" printed using recursion
// open 1
// open 2
// open 3
// open 4
// open 5
// closed 5
// closed 4
// closed 3
// closed 2
// closed 1
// 2) ITERATING LINKED LIST
// 1 -> 2 -> 5 -> 4 -> 3
// 1
// 2
// 3
// 4
// 5
// 3) FIBONACCI SERIES
// 0
// 1
// 1
// 2
// 3
// 4
// 7

import java.util.Arrays;
class rev{
    void reverse(int arr[]){
        reeeeevvvvvv(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println("close:"+arr[i]);
        }
        //System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        //     System.out.println("open :"+arr[i]);
        // }
     }


   void reeeeevvvvvv(int[] arr,int start,int end){
     if(start>=end){
        return;
     }
     int temp = arr[start];
     arr[start] = arr[end];
     arr[end] = temp;
     reeeeevvvvvv(arr,start+1,end-1);
   }


    // int start = 0;
    // int end = arr.length-1;
        
    //  while(start<end){
    //     int temp;
    //     temp = arr[start];
    //     arr[start]=arr[end];
    //     arr[end] = temp;
    //     start++;
    //     end--;
    //  }
    //  for(int i=0;i<arr.length;i++){
    //     System.out.println("close :"+arr[i]);
    // }
    // }
}
public class recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr);
           System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            System.out.println("open:"+arr[i]);
        }
     //System.out.println(Arrays.toString(arr));

        rev rr = new rev();
        rr.reverse(arr);
    }
}
