///////////PRIVATE AND PROTECTED//////////////

// public class access {
      
//     protected int a=10;
    
//     private int print(){
//         return a;
//     }    

//     public static void main(String[] args) {
//         access a = new access();
//         int ap = a.print();
//         System.out.println(ap);
//         System.out.println();
//     }
// }


///////////PROTECTED//////////


public class access {

    protected int s=100;
    protected int s1=250;

    protected int sum(){
        return s+s1;
    }

    public static void main(String[] args) {
        two tt = new two();
        int m = tt.sum();
        int l = tt.sum1();
        System.out.println(m);
        System.out.println(l);
    }

}

class two extends access{
        int au=s;
        int oi=s1;

        int sum1(){
            return au+oi;
        }
}
