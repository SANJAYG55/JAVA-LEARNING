import java.util.Scanner;
public class arraynthls {

    public static void main(String args[]) {
        
        int arr[]={22,44,99,11,49};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                    
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);    
      }
        Scanner s = new Scanner(System.in);
             System.out.println("enter which smallest element:");
        int small = s.nextInt();
             System.out.println("enter which largest element:");
        int large = s.nextInt();

           System.out.printf("%dth smallest number is: %d \n ",small, arr[small-1]);
           System.out.printf("%dth  largest number is: %d ",large,arr[arr.length-large]);
           s.close();
    }

}
