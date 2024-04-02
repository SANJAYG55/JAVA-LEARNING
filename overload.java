public class overload {
    int sum=0;
    public static void main(String[] args) {
        sum o=new sum();
        System.out.println(o.add(1,2,5,1.9f));
    }
}

class sum{
    int add(int a,int b){
        return a+b;
    }
    
    int add(int a,int b,int c){
        return a+b+c;
    }

    int add(int a,int b,int c,float d){
        return a+b+c+(int)d;
    }
}
