public class pali {
    int flag = 1;
    char arr[];

int palin(char arr[]){
        flag =1;
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            if(arr[start] == arr[end]){
                start++;
                end--;
            }
            else{
                flag = 0;
                break;
            }
        }
    return flag;

    }

    public static void main(String args[]){
        String s = "hih";

        char arr[] = s.toCharArray();

        pali p = new pali();

        if(p.palin(arr)==1){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }
    }
    
}
