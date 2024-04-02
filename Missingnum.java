import java.util.Scanner;

class Missingnum{
    public static void main(String args[]){
    
    int n;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the total num of element:");

    n = sc.nextInt();

    int arr[]  =new int[n];

    System.out.println("Enter the elements in array:");
    for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int sum = (n+1)*(n+2)/2;
    for(int i =0;i<n;i++){
      sum =sum-arr[i];
    }
    System.out.println("missing num is:"+ sum );
    sc.close();
}
}
