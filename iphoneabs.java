abstract class iphone{
    abstract void name();
    abstract void price();
}

class iphone11 extends iphone{
    void name(){
        System.out.println("name:iphone11");
    }
    void price(){
        System.out.println("price:35,000");
    }
}
class iphone12 extends iphone{
    void name(){
        System.out.println("name:iphone12");
    }
    void price(){
        System.out.println("price:55,000");
    }
}
class iphone13 extends iphone{
    void name(){
        System.out.println("name:iphone13");
    }
    void price(){
        System.out.println("price:70,000");
    }
}

public class iphoneabs {
    public static void main(String[] args) {
        iphone i = new iphone11();
          i.name(); 
          i.price();

        i =new iphone13();
          i.name();
          i.price();
          
        i = new iphone12();
          i.name();
          i.price();   
    }

}
