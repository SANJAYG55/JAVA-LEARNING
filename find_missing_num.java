// public class find_missing_num {
//     public static void main(String[] args) {
        
//         int arr[] = {1,2,3,5};
//         int sum =15;
//         int s=0;
//         for(int i=0;i<arr.length;i++){ 
//             s=s+arr[i];
//         }
//         int y = sum-s;
//         System.out.println(y);

//     }
    
// }



import java.lang.reflect.Array;
import java.util.*;
public class find_missing_num{
    public static void main(String[] args) {
      int[] arr= new int[]{5,4,2,1};
      System.out.println(Arrays.toString(arr));
      int size =arr.length;
     ss s =new ss();
     s.sort(arr, size);
    System.out.println(Arrays.toString(arr));


    }
}
class ss{
    void sort(int arr[],int size){
        int start = 0;
        int end = size-1;
        while(start<end){
            int t;
             t = arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++;
            end--;

        }
    }
    
}
class misnum{
    void missnum(int arr[]){


    }
}