public class timecomplex {
    public static void main(String[] args) {
        
       po p =  new po();
       p.pp(5);
    }
}

class po{
    int c =1;
    void pp(int x){
        for(int i=1;i<=x;i++){
            c = c*i;
        }
        // System.out.println(c);
    
       for(int j =1;j<=c;j++){
        System.out.println("hi");
    }
 }
}
