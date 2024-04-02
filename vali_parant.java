import java.util.*;

public class vali_parant {

    public static void main(String[] args) {

        String s = "(()({))";
        char cc[] = s.toCharArray();
        System.out.println(cc);

        ArrayDeque<Character> arr = new ArrayDeque<Character>();
        for(char c:cc){
            if(c=='('){
                arr.push('(');
               }
              else if(c==')'){
                if(arr.isEmpty()){
                    System.out.println("invalid");
                }
                   arr.pop();
        }
    }
        if(arr.isEmpty()){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");

        }
            
        
        

    }
    
}
