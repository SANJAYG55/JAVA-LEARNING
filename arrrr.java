import java.util.*;
public class arrrr {

    public static void main(String[] args) {
        int arr[] = new int[]{10,9,8,7,6,5,4,3,2,1,0};

        rev re = new rev();
       
        re.reverse(arr);
        
    }   
}
// class rev{
//     void reverse(int arr[]){
//         int start = 0;
//         int end  = arr.length-1;
//        while(start<end){
//         int t = arr[start];
//         arr[start] = arr[end];
//         arr[end] = t;
//         start++;
//         end--;
//        }
//        System.out.println(Arrays.toString(arr));
//     }
// }

// class rev{
//     void reverse(int arr[]){
//         int start = 0;
//         int end  = arr.length-1;
//        for(int i=end;i>=0;i--){
//             System.out.println(arr[i]);
//        }
    
//     }
// }


class rev{
    void reverse(int arr[]){
    
        int end  = arr.length;
       for(int i =0;i<end-1;i++){
        arr[end-1]=
       }
       System.out.println(Arrays.toString(arr));
    }
}

