import java.util.ArrayList;

public class rotatecoll {

public static void main(String[] args) {
    
     ArrayList<Integer> arr = new ArrayList<>();
     arr.add(1);
     arr.add(2);
     arr.add(3);
     arr.add(4);
     arr.add(5);
      System.out.println(arr);

      revv op = new revv();
    
      System.out.println(op.reverse(arr,0,1));
      System.out.println(op.reverse(arr,2,4));
     System.out.println(op.reverse(arr,0,4)); 
}

}

class revv{
    ArrayList<Integer>reverse(ArrayList<Integer>arr,int start,int end){
        for(int i=start,j=end;i<j;i++,j--){
            Integer ttt = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j, ttt);

        }
        return arr;
    }

}
