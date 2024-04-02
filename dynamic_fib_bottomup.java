import java.util.*;
class fiboo{
    void calfibo(int n){
        int[] table = new int[n+1];
        table[0] = 0;
        table[1] = 1;

        for(int i=2;i<table.length;i++){
            table[i] = table[i-1]+table[i-2];
        }
       System.out.println("Fibonacci of "+n+" is: "+table[n]) ;
    }
}

public class dynamic_fib_bottomup {
    public static void main(String[] args) {
        fiboo f = new fiboo();
        f.calfibo(7);
    }
}
