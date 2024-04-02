      import java.util.*;
      public class min_maxcoll {
          public static void main(String[] args) {
              ArrayList<Integer> al = new ArrayList<>();
              al.add(1);
              al.add(2);
              al.add(3);
              al.add(4);
              al.add(5);
              System.out.println(al);
              int min = al.get(0);
              int max = al.get(0);
          Iterator<Integer> i = al.iterator();
  
          while(i.hasNext()){
               int  p = i.next();
                 if(p <= min){
                       min = p;
                      }
                if(p >= max){
                       max=p;
                    }
          }
          System.out.println("min:"+min);
          System.out.println("max:"+max);
      }
  }  
  