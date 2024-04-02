import java.util.*;

public class rev_arrlis {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(3);
        n.add(2);
        n.add(1);
        n.add(5);
        n.add(4);
        System.out.println(n);
        rev r = new rev();
        System.out.println(r.reverse(n,0,4));
    }}
      

//     int start = 0;
//     int end = n.size()-1;

//     for(int i =start,j=end;i<=j;i++,j--){
//         Integer t = n.get(i);
//         n.set(i, n.get(j));
//         n.set(j,t);
//     }
//     System.out.println(n); 
//       }
    
//    }

//     int start = 0;
//     int end = n.size()-1;

//     for(int i=start;i<end;i++){
//         Integer tt = n.get(start);
//         n.set(start,n.get(end));
//         n.set(end,tt);
//         start++;
//         end--;
//     }
//          System.out.println(n); 

// }
// }


     


class rev{
     ArrayList<Integer>reverse(ArrayList<Integer> n,int start,int end){
        for(int i=start,j=end;i<j;i++,j--){
                Integer temp = n.get(i);
                n.set(i, n.get(j));
                n.set(j, temp);
        }
        return n;
    }
}
