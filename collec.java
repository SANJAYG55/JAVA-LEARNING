import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class collec {
    public static void main(String[] args) {
        List<Integer> op =new ArrayList<>();
            op.add(1);
            op.add(2);
            op.add(3);
            op.add(4);
            op.add(5);
            op.add(6);
            op.add(7);
            op.add(8);
            op.add(9);
            op.addFirst(0);
            op.addLast(10);
            System.out.println("elements are:");
            System.out.println(op);
            System.out.println("elements at 5th index : "+op.get(5));
            op.add(10, 11);
            System.out.println(op);
            op.sort(Comparator.reverseOrder()); 
            System.out.println(op);
        
       ArrayList<Integer> ok = new ArrayList<>();
            ok.add(0, 10);
            ok.add(1, 1);
            ok.add(2, 5);
            

                System.out.println(ok);
                ok.sort(Comparator.naturalOrder());
                System.out.println(ok);

                ok.addAll(op);
                System.out.println(ok);

                ok.sort(Comparator.naturalOrder());
                System.out.println(ok);

                System.out.println(op.containsAll(ok));

        }
}
