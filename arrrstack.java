public class arrrstack {
    public static void main(String[] args) {
        stack s = new stack();
        // s.Create_stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        System.out.println(s.arr);
    }
}
class stack{
    int reff  = -1;
    int arr[] = new int[10];

//    public void Create_stack(){
//         int size = 10;
//         int arr[] = new int[size];
        
//     }

    public void push(int x){
    
        if(reff==arr.length){
            reff--;
            System.out.println("cant enter value");
        }
        else {
            reff++;
            arr[reff] = x;
            System.out.println("inserted");
        }

    }

    public void pop(){
        arr[reff]=0;
        reff--;
        System.out.println("deleted");
    }

    public void isEmpty(){
        if(reff == -1){
            System.out.println("empty");
        }
        else{
            System.out.println("not empty");
        }
    }
}