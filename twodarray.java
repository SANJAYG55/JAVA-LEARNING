import java.util.Scanner;
public class twodarray {

    public static void main(String argss[]){

        int arr[][] = new int[5][];
         arr[0] = new int[5];
         arr[1] = new int[4];
         arr[2] = new int[3];
         arr[3] = new int[2];
         arr[4] = new int[1];
         Scanner s =new Scanner(System.in);
         
         System.out.println("Enter value:");
         for(int i=0;i<arr.length;i++){
            for(int j=0;j < arr[i].length;j++){
                 
                arr[i][j] = s.nextInt(); 
            }

         }
         for(int i=0;i<arr.length;i++){
            for(int j=0;j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                System.out.println();

            }
        }
        s.close();
        System.out.println();

    }
    
}
