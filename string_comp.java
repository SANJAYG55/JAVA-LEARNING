import java.util.*;
public class string_comp {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
               arr.add("prabha");
               arr.add("prabha");
               arr.add("prabha");
               arr.add("prabha");
               arr.add("prabha");
               arr.add("prashanth");
               arr.add("vignesh");
               arr.add("rohan");
        System.out.println("Original Array:"+arr);
        ArrayList<String> result=new ArrayList<>();
            ArrayList<String> encountered=new ArrayList<>();

        for(String i:arr){
            
            if(!encountered.contains(i)){
                result.add(i);
                encountered.add(i);
            }
        } 
        System.out.println("Non duplicate array:"+result); 
    }
    
}
