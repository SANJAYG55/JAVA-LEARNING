import java.util.Arrays;
public class highlow {

    

    public static void main(String[] args) {
        
        int arr[]={0,7,4,5,6,7,9,1,5,8};

        Arrays.sort(arr);

        int start=0;
        int end=arr.length-1;

        while(start<end){
            System.out.print(" "+arr[end]);
            System.out.print(" "+arr[start]);
            end--;
            start++;
            
        }

    }
    
}
