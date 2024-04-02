
import java.util.Scanner;
public class arr{
    public static int length;

    public static void main(String[] args) {
        int[] tp = new int[10];

        Scanner sc = new Scanner(System.in);


        System.out.println("enter  10 elements:");

        for(int i=0;i<10;i++){
            tp[i]= sc.nextInt();
        }

        System.out.print("enter  10 elements:");
       for(int j=0;j<10;j++){
        System.out.println(tp[j]);
       }
        sc.close();
    }
}
