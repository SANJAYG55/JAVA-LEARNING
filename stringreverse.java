public class stringreverse {

    String reverse(String c){

        char arr[] = c.toCharArray();
        String re ="";
        for(int i=arr.length-1;i>=0;i--){
            re = re+arr[i];
        }
        return re;
    }

    public static void main(String args[]){

        String c ="prabha hello";

        stringreverse rev = new stringreverse();
        String t = rev.reverse(c);
        System.out.println(t);


    }
    
}
