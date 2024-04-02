public class factorial {
 
     static int getfactorial(int a){
        if(a==0||a==1){
            return 1;
        }
        else{
            return a*getfactorial((a-1));
        }
     }

     public static void main (String args[]){
      int  m =  getfactorial(5);
      System.out.println(m);
     }

}


