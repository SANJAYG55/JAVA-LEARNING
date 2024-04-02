public class removedupli {

    public static void main(String arg[]){
        int arr[] = new int[]{1,1,1,2,3,4,5,5,5,6,6,6,7,7,7,7};

        boolean visited[] = new boolean[arr.length];

        for(int i=0;i<visited.length;i++){
            visited[i]=false;
        }

        for(int i=0;i<arr.length;i++){
            visited[arr[i]]=true;
        }

        for(int i=0;i<arr.length;i++){
            if(visited[i]==true){
                System.out.println(i);
            }
        }   
    }   
}
