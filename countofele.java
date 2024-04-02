import java.util.Scanner;
class countofele{

     void countnum(int[] arr,int a){
        int visited[] = new int [arr.length];

        // for(int i=0;i<visited.length;i++){
        //     visited[i]=0;
        // }

        for(int i=0;i<arr.length;i++){
            visited[arr[i]]++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.println("count of given num is "+visited[arr[i]]);
                break;
                
            }
            //System.out.println("count of given num is "+visited[i]);

        }
    }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the count:"); 
        int a = sc.nextInt();
        int arr[] = new int[]{1,2,3,4,1,1,4,4,5,3,4,4,4,4,3,3,4,4,6,6,6,6,7,8};

        countofele c = new countofele();
        c.countnum(arr,a);
        sc.close();
     }
    }
