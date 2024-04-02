public class palindrome {
    char arr[];
     int flag = 1;

    int  palindrom(char arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            if(arr[start]==arr[end]){
                start++;
                end--;
            }
            else{
                flag=0;
                break;
    
            }

        }
        return flag;

    }

    public static void main(String args[]){
       String s = "malayalam";
        char arr[]  = s.toCharArray();

    
        palindrome pi = new palindrome();
        if(pi. palindrom(arr)==1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }

}
